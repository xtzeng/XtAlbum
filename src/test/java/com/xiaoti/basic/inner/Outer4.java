package com.xiaoti.basic.inner;

public class Outer4 {
	
	public Foo genFoo() {
		//方法内的内部类
		class FooImpl implements Foo {
			public void say() {
				System.out.println("hello~方法内的内部类");
			}
		}
		
		return new FooImpl();
	}
	
	
	public Bar genBar() {
		Bar b = null;
		if (true) {
			//任意位置的内部类
			class BarImpl implements Bar {
				@Override
				public void readme() {
					System.out.println("hello~任意位置的内部类");
				}
			}
			b = new BarImpl();
		}
		
		return b;
	}
	
	
	public static void main(String[] args) {
		Outer4 outer4 = new Outer4();
		Foo f = outer4.genFoo();
		Bar b = outer4.genBar();
		f.say();
		b.readme();
	}
	
}
