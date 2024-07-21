package com.miaoubich;

import java.math.BigDecimal;

import com.miaoubich.builder.Student;
import com.miaoubich.builder.StudentReceiver;
import com.miaoubich.factory.Payment;
import com.miaoubich.factory.PaymentFactory;
import com.miaoubich.factory.PaymentMethod;

//@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DesignPatternsApplication.class, args);
	
		factoryDesignPattern();
		builderDesignPattern();
	}

	public static void factoryDesignPattern() {
		try {
			Payment payment = PaymentFactory.create(PaymentMethod.GOOGLE_PAY);
			payment.pay(BigDecimal.valueOf(2000.00));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void builderDesignPattern() {
//		StudentReceiver studentReceiver = new StudentReceiver();
//		System.out.println(studentReceiver.getStudent());
		
		Student student = Student.Builder.newInstance()
								 .setId(1)
								 .setName("Ali")
								 .setAddress("Depolo 5, Korcula")
								 .build();
		System.out.println(student);
	}

}
