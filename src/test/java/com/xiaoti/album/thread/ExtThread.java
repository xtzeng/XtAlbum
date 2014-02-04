package com.xiaoti.album.thread;

public class ExtThread extends Thread {
	
	Test t = new Test();
	
	@Override
	public void run(){
		t.test();
		System.out.println("Thread say:Hello,World！");
	}
}
