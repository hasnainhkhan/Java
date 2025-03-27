// Write a Java program to print the area and perimeter of a circle.
// area of circle = 2pier^2 
// perimeter of a circle. = 2pieR
import java.util.*;
public class Area_premer_circle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Ratio to find the area and pri");
    float R = sc.nextFloat();
    float pie = 3.14285714f;

    float perimeter = 2*pie*R;
    float area = pie*R*R;
    System.out.println("Area is:"+area);
    System.out.println("perimeter is:"+perimeter);

}

}
