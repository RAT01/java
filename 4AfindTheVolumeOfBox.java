public class Box {
 private double length;
 private double width;
 private double height;
 public Box(double length, double width, double height) {
 this.length = length;
 this.width = width;
 this.height = height;
 }
 public static double calculateVolume(Box box) {
 return box.length * box.width * box.height;
 }
 public static void main(String[] args) {
 Box box = new Box(2, 3, 4);
 double volume = Box.calculateVolume(box);
 System.out.println("Volume of the box is: " + volume);
 }
}
