package com.xiaoti.basic.inner;

public class Outer2 {

	private class FooImpl implements Foo {

		@Override
		public void say() {
			System.out.println("hello foo~");
		}
		
	}
	
	private class BarImpl implements Bar {

		@Override
		public void readme() {
			System.out.println("hello bar!");
		}
		
	}
	
	
	public Foo genFoo() {
		return new FooImpl();
	}
	
	public Bar genBar() {
		return new BarImpl();
	}
	
	
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Foo f = outer2.genFoo();
		Bar b = outer2.genBar();
		f.say();
		b.readme();
	}
}
