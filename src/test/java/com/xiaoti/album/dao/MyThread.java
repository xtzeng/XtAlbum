package com.xiaoti.album.dao;

public class MyThread extends Thread {

	public int x = 0;
	
	@Override
	public void run() {
		System.out.println(++x);
	}
}
