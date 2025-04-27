import java.util.*;
public class Swap_to_number {
    // define swap(a, b)
    // temp := a
    // a := b
    // b := tempdefine swap(a, b)
    // temp := a
    // a := b
    // b := temp
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int a = 10, b = 25;
        int temp = 0;
        System.out.println("Enter the number");
        temp = a;
        a = b;
        b = temp;
        System.out.println(temp);
    }
}
