package com.kuang.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //注意：上传的文件位置在打包生成的war包路径下找

        //判断上传的表单是普通表单还是文件表单
        if(!ServletFileUpload.isMultipartContent(req)){
            return;//普通表单
        }

        //创建上传文件的保存路径
        String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
        File uploadFile = new File(uploadPath);
        if(!uploadFile.exists()){
            uploadFile.mkdir();//创建这个目录
        }
        //缓存，临时文件，假设文件超过了预期大小，就把它放到一个临时文件中，过几天自动删除，或者提醒用户转存为永久
        String tmpPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
        File tmpFile = new File(tmpPath);
        if(!tmpFile.exists()){
            tmpFile.mkdir();//创建这个临时目录
        }
        //处理上传的文件，可以使用request.getInputStream()原生文件上传流获取，但很麻烦
        //建议使用commons-fileupload实现

        //1.创建DiskFileItemFactory对象，处理文件上传路径或者大小限制
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //通过其设置缓冲区，当上传文件大小大于这个缓冲区的时候，将其放到临时文件中
        factory.setSizeThreshold(1024*1024);//1M
        factory.setRepository(tmpFile);//临时文件的保存目录

        //2.获取ServletFileUpload
        ServletFileUpload upload = new ServletFileUpload(factory);
        //监听文件上传进度
        upload.setProgressListener(new ProgressListener() {
            //pBytesRead    已经读取到的文件大小
            //pContentLength    文件大小
            public void update(long pBytesRead, long pContentLength, int pItems) {
                System.out.println("总大小："+pContentLength+"已上传： "+pBytesRead);
            }
        });
        //处理乱码问题
        upload.setHeaderEncoding("UTF-8");
        //设置单个文件的最大值
        upload.setFileSizeMax(1024*1024*10);
        //设置总共能够上传的文件大小
        upload.setSizeMax(1024*1024*10);

        //3.处理上传文件
        List<FileItem> fileItems = null;
        try {
            fileItems = upload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        for (FileItem fileItem : fileItems) {
            if(fileItem.isFormField()){//普通表单还是文件表单
                String name = fileItem.getFieldName();
                String value = fileItem.getString("UTF-8");//处理乱码
                System.out.println(name+"："+value);
            }else{
                String uploadFileName = fileItem.getName();
                System.out.println("上传的文件名: "+uploadFileName);
                if(uploadFileName.trim().equals("") || uploadFileName==null){
                    continue;
                }
                //获得上传的文件名 eg:images/girl/paojie.png
                String fileName = uploadFileName.substring(uploadFileName.lastIndexOf("/") + 1);
                //获得文件的后缀名
                String fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);
                System.out.println("文件信息[文件名："+fileName+"--文件类型"+fileExtName+"]");

                //uuid生成不重复文件名
                String uuidPath = UUID.randomUUID().toString();
                //存到哪里 uploadPath   文件真实存在的路径 realPath
                String realPath = uploadPath + "/" + uuidPath;
                //给每个文件创建一个对应的文件夹
                File realPathFile = new File(realPath);
                if(!realPathFile.exists()){
                    realPathFile.mkdir();
                }

                //获得文件上传的流
                InputStream inputStream = fileItem.getInputStream();
                FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
                byte[] buffer = new byte[1024];
                int len = 0;
                while((len = inputStream.read(buffer)) > 0 ){
                    fos.write(buffer,0,len);
                }
                fos.close();
                inputStream.close();

                String msg = "文件上传成功";
                fileItem.delete();
                req.setAttribute("msg",msg);
                req.getRequestDispatcher("info.jsp").forward(req,resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
