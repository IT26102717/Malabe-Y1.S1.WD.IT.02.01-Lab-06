import java.util.Scanner;
public class IT26102717Lab6Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num = input.nextInt();
		
		double squart = (num * num);
		System.out.println("The squar of "+ num + " is " + squart);
		
		double root = Math.sqrt(num);
		System.out.println("The squar root of "+ num + " is "+ root);
	}
}