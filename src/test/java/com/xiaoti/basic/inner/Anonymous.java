package com.xiaoti.basic.inner;

public class Anonymous {

	public Foo f = new Foo() {
		@Override
		public void say() {
			System.out.println("hello~匿名类");
		}
	};
	
	public Foo test() {
		return new Foo() {
			@Override
			public void say() {
				System.out.println("hello foo");
			}
		};
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.f.say();
		anonymous.test().say();
	}
}
