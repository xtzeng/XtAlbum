package com.xiaoti.basic.inner;

public class Outer5 {

	public static int a = 500;
	public int b = 400;
	
	protected static class Inner {
		int i = 100;
		String name;
		
		public Inner(String name) {
			this.name = name;
		}
		
		void innerSayHello() {
			System.out.println("Hello"+name);
			this.i++;
			Outer5.a++;
			
		}
	}
	
	
	public Inner genInner(String name) {
		return new Inner(name);
	}
	
	
	public static void main(String[] args) {
		Outer5.Inner in1 = new Outer5().genInner("1111");
		in1.innerSayHello();
		System.out.println(in1.i);
		System.out.println(Outer5.a);
		
		Outer5.Inner in2 = new Outer5().genInner("2222");
		in2.innerSayHello();
		System.out.println(in1.i);
		System.out.println(Outer5.a);
	}
}
