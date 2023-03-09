public class SwapVariables {
 public static void main(String[] args) {
 int num1 = 5;
 int num2 = 10;
 
 // Print the initial values
 System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
 
 // Swap the values using a temporary variable
 int temp = num1;
 num1 = num2;
 num2 = temp;
 
 // Print the swapped values
 System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
 }
}
