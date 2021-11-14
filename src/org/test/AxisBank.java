package org.test;

import java.io.File;
import java.io.IOException;

public class AxisBank extends IdfcBank {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\cv");
		String[] list = file.list();
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("******************************************************");
		File[] listFiles = file.listFiles();
		for (File y : listFiles) {
			
			System.out.println(y);
		}
		
	System.out.println("Chocolate Boy");	
		
		

}
}