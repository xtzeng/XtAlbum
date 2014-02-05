package com.xiaoti.album.thread;

public class Test {
	int x = 0;
	
	public synchronized void test() {
		if(x==0) {
			try {
				this.wait(3000);
				System.out.println("this is test method");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ExtThread().start();
		
		System.out.println("-----------"+Thread.currentThread().getName());
		
		System.out.println("this is main thread");
	}
}
