public class small {
 public static void main(String[] args) {
 int[] array = {10, 5, 20, 30, 15};
 int min = array[0];
 int max = array[0];
 
 for (int i = 1; i < array.length; i++) {
 if (array[i] < min) {
 min = array[i];
 }
 if (array[i] > max) {
 max = array[i];
 }
 }
 
 System.out.println("Smallest element in array: " + min);
 System.out.println("Largest element in array: " + max);
 }
}
