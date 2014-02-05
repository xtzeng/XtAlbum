package com.xiaoti.basic.inner;

public class Outer6 {
	
	private void f0() {
		System.out.println("f0");
		
	}
	
	class A {
		
		private void a() {
			f0();
			System.out.println("this is in A class");
		}
		
		class B {
			
			protected void b() {
				a();
				System.out.println("direct invoke f0");
				f0();
				System.out.println("this is in B class");
			}
		}
    }

	
	public static void main(String[] args) {
			Outer6 outer6 = new Outer6();
			Outer6.A a = outer6.new A();
			Outer6.A.B b = a.new B();
			b.b();
	}
}
