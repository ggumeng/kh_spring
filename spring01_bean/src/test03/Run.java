package test03;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		//ApplicationContext에 2021년 10월 9일 날짜를 가지는 java.util.Date 빈을 등록하고
		//main 메서드에서 '오늘 날짜는 2021년 10월 9일입니다.' 형태로 출력하세요.
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");

	}

}
