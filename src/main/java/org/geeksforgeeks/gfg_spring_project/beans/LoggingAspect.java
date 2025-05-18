package org.geeksforgeeks.gfg_spring_project.beans;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

//    private final Logger logger = LoggerFactory.getLogger(this.getClass()) ;
    @Before("execution(* org.geeksforgeeks.gfg_spring_project.services.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        log.info("Logging: Calling Before {}  with arguments {} " , joinPoint.getSignature().getName() ,Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* org.geeksforgeeks.gfg_spring_project.services.*.*(..))")
    public void logMethodCallAfter(JoinPoint joinPoint) {
        log.info("Logging: Calling After {} with arguments {} " ,joinPoint.getSignature().getName() ,Arrays.toString(joinPoint.getArgs()));
    }
}
