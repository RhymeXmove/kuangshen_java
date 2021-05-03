package annotationAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：注解实现Aop
@Aspect //标识这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void befor(){
        System.out.println("方法执行前");
    }
    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理的切入的点
    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        System.out.println(joinPoint.getSignature());//获得签名
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
