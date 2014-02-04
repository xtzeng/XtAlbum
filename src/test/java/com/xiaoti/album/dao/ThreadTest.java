package com.xiaoti.album.dao;

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 10; i++) {
			Thread t = new MyThread();
			t.start();
		}
		
		Thread.sleep(10000);
		
		System.out.println("-----------------------");
		
		R r = new R();
		
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(r);
			t.start();
		}
	}
}
