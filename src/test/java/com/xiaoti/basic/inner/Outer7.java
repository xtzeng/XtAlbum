package com.xiaoti.basic.inner;

public class Outer7 {
	
	class Inner {
		void doSomething() {
			System.out.println("Inner doing ...");
		}
	}
	
	class Inner2 extends Inner {
		
		@Override
		void doSomething() {
			System.out.println("Inner2 doing ...");
		}
		
		void readme() {
			System.out.println("呵呵");
		}
	}
	
	
	public static void main(String[] args) {
		Outer7 outer7 = new Outer7();
		Outer7.Inner in = outer7.new Inner();
		Outer7.Inner2 in2 = outer7.new Inner2();
		
		in.doSomething();
		in2.doSomething();
		in2.readme();
	}
}
