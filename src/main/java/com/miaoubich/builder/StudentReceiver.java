package com.miaoubich.builder;

//Client Side Code
public class StudentReceiver {

	private Student student;

	public StudentReceiver() {
		student = Student.Builder.newInstance()
								 .setId(1)
								 .setName("Ali")
								 .setAddress("Korcula")
								 .build();
	}
	
	public Student getStudent() {
        return student;
    }
}
