package slovo;

import java.util.Scanner;

public class slovo {

	public static void main(String[] args) {
		
		String word;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Введіть слово java: ");
		word = inputDevice.next();
		char j = word.charAt(0);
		char a = word.charAt(1);
		char v = word.charAt(2);
		char a2 = word.charAt(3);
		System.out.println("     "+j+"       "+a+"    "+v+"       "+v+"   "+a);
		System.out.println("     "+j+"      "+a+" "+a+"    "+v+"     "+v+"   "+a+" "+a);
		System.out.println("     "+j+"     "+a+"   "+a+"    "+v+"   "+v+"   "+a+"   "+a);
		System.out.println(j+"    "+j+"    "+a+a+a+a+a+a+a+"    "+v+" "+v+"   "+a+a+a+a+a+a+a);
		System.out.println(j+""+j+j+j+j+j+"   "+a+"       "+a+"    "+v+"   "+a+"       "+a);
		
		

	}

}
