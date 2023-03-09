public class Box
{
private double length;
private double width;
private double height;
public Box() 
{
this.length = 0;
this.width = 0;
this.height = 0;
}
public Box(double length, double width, double height)
{
this.length = length;
this.width = width;
this.height = height;
}
public Box(double length, double width)
{
this.length = length;
this.width = width;
this.height = 0;
}
public double getVolume()
{
return length * width * height;
}
public static void main(String[] args)
{
IT21063
Box box1 = new Box();
System.out.println("Box 1 volume: " + box1.getVolume());
Box box2 = new Box(10, 20, 30);
System.out.println("Box 2 volume: " + box2.getVolume());
Box box3 = new Box(5, 10);
System.out.println("Box 3 volume: " + box3.getVolume());
}
}
