package com.example.klein.aop;

import com.example.klein.utils.result.DataResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AroundCut {
    /*public static final String POINT_CUT = "execution(* com.test.demo.controller.CategoryController.*(..)) || " +
            "execution(* com.test.demo.controller.DocController.*(..))";

    @Around(AroundCut.POINT_CUT)
    public DataResult checkSession(ProceedingJoinPoint pjp) throws Throwable {
        //获取session
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        return (DataResult) pjp.proceed();
    }*/
}
