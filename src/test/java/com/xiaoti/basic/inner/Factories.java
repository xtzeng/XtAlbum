package com.xiaoti.basic.inner;

public class Factories {

	public static void serviceConsumer(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
	}
}
