package Null.Pointer.ExceptionClass;

import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
		
		String strName;
		Scanner objScanner = new Scanner(System.in);
		
		try{			
			System.out.println(strName);
			}catch (Exception npe)
		{
			System.out.println("sdf");
		}
	}
}
