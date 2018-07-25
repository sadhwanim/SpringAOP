package com.manish.javbrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggigAspect {
	
LoggigAspect(){
//	System.out.println("LoggigAspect");
 }

@Before("allGetters() && allCircleMethod()")
public void LoggingAdvice(JoinPoint joinPoint) {
	System.out.println(joinPoint.toString());
}
@Before("allGetters() && allCircleMethod()")
public void LoggingAdviceToGetCallingObject(JoinPoint joinPoint) {
	System.out.println(joinPoint.getTarget());
}
@Before("allGetters()")
public void SecondAdvice() {
	System.out.println("Second Advice Given. Before Run Method");
}

@Before("args(name)")
public void argsImpl(String name) {
	System.out.println("Second Advice Given."+name);
}
@After("args(name)")
public void argsImplAfter(String name) {
	System.out.println("Second Advice Given."+name);
}
@AfterThrowing(pointcut="args(name)",throwing="ex")
public void argsImplAfterThrowing(String name,Runtime ex) {
	System.out.println("Second Advice Given."+name);
}
@AfterReturning(pointcut="args(name)",returning="returnedString")
public void argsImplAfterReturning(String name,String returnedString) {
	System.out.println("Second Advice Given."+name);
}

@Before("@annotation(com.manish.javbrains.aspect.Loggable)")
public void args() {
	System.out.println("Circle Specific.");
}


@Pointcut("execution(public * get*())")
public void allGetters() {}



@Pointcut("within(com.manish.javbrains.model.Circle)")
public void allCircleMethod(){}


}
