import java.util.Scanner;
public class Exercise2{
	public static void main(String[] args){

	int number1 = 0;
	int number2 = 0;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	number1 = input.nextInt();
	System.out.print("Enter second number: ");
	number2 = input.nextInt();

	System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
	System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

	}
}
