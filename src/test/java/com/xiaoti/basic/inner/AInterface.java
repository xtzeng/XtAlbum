package com.xiaoti.basic.inner;

public interface AInterface {
	void readme();
	
	class Inner1 implements AInterface {

		@Override
		public void readme() {
			System.out.println("i am a 接口内部类");
			
		}
		
	}
	
	
}
