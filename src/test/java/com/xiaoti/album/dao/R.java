package com.xiaoti.album.dao;

public class R implements Runnable {

	private int x = 0;
	
	@Override
	public void run() {
		System.out.println(++x);
	}

}
