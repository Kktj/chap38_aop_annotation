package com.javalab.board.common;
/*
 * [어드바이스, 부가적인 관심사]
 *  - 부가적인 로직, 공통 메소드라고  불리며
 *  - 핵심 로직은 아니지만 로깅, 보안, 트랜잭션, 예외처리 등을 해주는 기능을 하는 클래스
 */
public class Log4JAdvice {

	public Log4JAdvice() {
	}

	public void printLogging(){
		System.out.println("[공통로직-Log4j] 비지니스로직 수행전 동작");
	}
}

