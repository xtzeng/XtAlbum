package com.xiaoti.basic.inner;

public class Outer3 {

	protected class Foo {
		
		protected void say() {
			System.out.println("hi~ foo");
		}
		
		private void test() {
			System.out.println("----test----");
		}
	}
	
	
	protected class Bar {
		protected void readme() {
			System.out.println("hi~ bar!");
			new Foo().test();
		}
	}
	
	
	public Foo genFoo() {
		return new Foo();
	}
	
	public Bar genBar(){
		return new Bar();
	}
	
	
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		Outer3.Bar bar = outer3.genBar();
		bar.readme();
	}
}
