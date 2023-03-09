import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
int firstNumber = input.nextInt();
System.out.print("Enter second number: ");
int secondNumber = input.nextInt();
System.out.print("Enter third number: ");
int thirdNumber = input.nextInt();
int max = firstNumber;
if (secondNumber > max) {
max = secondNumber;
}
if (thirdNumber > max) {
max = thirdNumber;
}
System.out.println("The maximum of the three numbers is: " + max);
input.close();
}
}
