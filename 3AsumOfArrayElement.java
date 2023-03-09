public class SumOfArrayElements {
 public static void main(String[] args) {
 int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // initialize array with 10 elements
 int sum = 0; // initialize sum variable to zero
 // iterate through array and add each element to sum
 for (int i = 0; i < arr.length; i++) {
 sum += arr[i];
 }
 System.out.println("The sum of elements in the array is: " + sum); // print sum
 }
}
