package com.xiaoti.album.dao;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {

	@Test
	public void testFile() {
		
		try {
			File test = new File("db_album");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		File f = new File("hello.txt");
//		
//	     try {
//	            System.out.println(f.createNewFile());//当文件存在时返回false
//	           // System.out.println(f.delete());//当文件不存在时返回false
//	        } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
	}
}
