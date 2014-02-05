package com.xiaoti.basic.inner;

public class Outer {
	private int a = 3;
	private int b = 5;
	
	public Outer() {
		System.out.println("Outer的构造方法:outer");
	}
	
	private void outerSayHello(){
		System.out.println("Hello~ Outer class");
	}
	
	
	class Inner {
		
		int i = 30;
		
		public Inner() {
			System.out.println("Inner构造方法：inner");
		}
		
		public void innerMsg() {
			System.out.println(">>>>>>>>>Hello~ Inner class.");
			outerSayHello(); //内部类可以调用外部类的private方法
			
			//访问内部类自己的成员i
			this.i++;
			
			//访问外部类的成员a和b
			Outer.this.a++;
			b--;
			
		}
		
		int getI() {
			return i;
		}
	}
	
	
	public void test() {
		
		Inner inner = new Inner();
		inner.innerMsg();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.test();
		
		System.out.println(outer.getA());
		System.out.println("-------------1-----------");
		
		Outer.Inner iner = outer.new Inner();
		iner.innerMsg();
		System.out.println(iner.getI());
		System.out.println("========2=========");
		
		System.out.println(outer.getA());
	}
	
	
}
