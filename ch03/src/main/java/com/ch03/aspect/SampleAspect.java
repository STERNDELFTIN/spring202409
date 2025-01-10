package com.ch03.aspect;

import java.text.SimpleDateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {

	@Before("execution(* com.ch03.greeting.*IGreet.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		// 시작 부분 표시
		System.out.println("==== Before Advie ====");
		// 날짜 출력
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
		// 메서드명 출력
		System.out.println(String.format("메서드: %s", jp.getSignature().getName()));
	}
	
	@After("execution(* com.ch03.greeting.*IGreet.*(..))")
	public void afterAdvice(JoinPoint jp) {
		// 시작 부분 표시
		System.out.println("==== After Advice ====");
		// 날짜 출력
		System.out.println(String.format("메서드명: %s", jp.getSignature().getName()));
		// 메서드명 출력
		System.out.println(String.format("메서드명: %s", jp.getSignature().getName()));
	}
	
	@Around("execution(* com.ch03.greeting.*IGreet.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// 시작 부분 표시
		System.out.println("==== Around Advice ====");
		System.out.println("▼▼▼ 처리전 ▼▼▼");
		// 지정한 클래스의 메서드 실행
		Object result = pjp.proceed();
		
		System.out.println("▲▲▲ 처리후 ▲▲▲");
		
		// 반환값을 돌려줄 필요가 있는 경우에는 Object 타입의 반환값을 돌려줌
		return result;
	}
}
