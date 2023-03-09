import java.util.Scanner;
public class DayName {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter day code (1-7): ");
 int dayCode = input.nextInt();
 
 String dayName;
 switch (dayCode) {
 case 1:
 dayName = "Sunday";
 break;
 case 2:
 dayName = "Monday";
 break;
 case 3:
 dayName = "Tuesday";
 break;
 case 4:
 dayName = "Wednesday";
 break;
 case 5:
 dayName = "Thursday";
 break;
 case 6:
 dayName = "Friday";
 break;
IT21063
 case 7:
 dayName = "Saturday";
 break;
 default:
 dayName = "Invalid day code";
 break;
 }
 
 System.out.println("Day name: " + dayName);
 }
}
