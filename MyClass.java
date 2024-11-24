package Java;

import java.util.Scanner;

public class MyClass {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sub.");
		int numSub=input.nextInt();
		
		float[]marks = new float[numSub];
		float totalMarks= 0;
		
		for (int i=0;i <numSub; i++) {
			System.out.print("Enter marks for sub"+(i+1)+":");
			marks[i]=input.nextFloat();
			totalMarks +=marks[i];
		}
		
		double avg=(double)
		totalMarks/numSub;
		double percentage= (avg/100)*100;
		
		char grade=0;
		if(percentage>=90) {
			System.out.println("Grade A");
		}
		else if(percentage>=80) {
			System.out.println("Grade B");
		}
		else if(percentage>=70) {
			System.out.println("Grade c");
		}
		else if(percentage>=60) {
			System.out.println("Grade D");
		}
		else if(percentage>=50) {
			System.out.println("Grade E");
		}
		else{
			System.out.println("Grade F");
		}
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Avg marks: "+avg);
		System.out.println("Percentage:"+percentage+"%");
		System.out.print("Grade: "+grade);
			
	}
}