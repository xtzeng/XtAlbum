package com.xiaoti.basic.inner;

public class FkTest {

	public Fk hehe() {
		return new Fk("fk"){
			@Override
			public String toString() {
				return "fk";
			}
		};
	}
	
	public Fk haha() {
		return new Fk("fk");
	}
	
	public static void main(String[] args) {
		
		Fk f = new Fk("helloWorld");
		System.out.println(f);
		
		System.out.println("-----------");
		FkTest fkTest = new FkTest();
		Fk fk = fkTest.hehe();
		System.out.println(fk);
		
		System.out.println("=============");
		System.out.println(fkTest.haha());
	}
}
