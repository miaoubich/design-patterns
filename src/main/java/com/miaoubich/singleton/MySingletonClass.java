package com.miaoubich.singleton;

public class MySingletonClass {

	private static MySingletonClass instance;
	
	private MySingletonClass() {}
	
	public static MySingletonClass createInstance() {
		if(instance == null)
			instance = new MySingletonClass();
		return instance;
	}
}
