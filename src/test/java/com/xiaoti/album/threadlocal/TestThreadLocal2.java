package com.xiaoti.album.threadlocal;

public class TestThreadLocal2 {

	//初始化子类？看不懂
	private static ThreadLocal<Integer> a = new ThreadLocal<Integer>() { 
		public Integer initialValue() { // 初始化，默认是返回 null 
			return 0; 
		} 
		}; 




	public static void main(String args[]) { 

		MyThread my; 

		my = new MyThread(); 

		my.start(); 

		for ( int i = 0; i < 5; i++) { 

			a.set(a.get() + 1); 
	
			System. out .println(Thread.currentThread().getName() + ":" + a.get()); 

		} 

    } 




		public static class MyThread extends Thread { 

			public void run() { 
	
				for ( int i = 0; i < 5; i++) { 
		
					a.set(a.get() + 1); 
			
					System.out.println(Thread. currentThread().getName() + ":" + a .get()); 
		
				} 
	
		    } 

	   } 


}
