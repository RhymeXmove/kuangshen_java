package com.kuang.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    //初始化
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化");
    }

    //  chain（链）
    /*
    过滤中的所有代码，在过滤特定请求的时候都会执行
    必须要让过滤器继续通行  chain.doFilter(request,response);
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("CharacterEncodingFilter执行前......");
        chain.doFilter(request,response);//让请求继续走，如果不写，程序会被这里拦截
        System.out.println("CharacterEncodingFilter执行后......");
    }

    //销毁
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁");
    }
}
