//add to number simple java project
import java.util.Scanner; 

class Add_2_number{
    public static void main(String[] args) {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        a=sc.nextInt();
        System.out.println("Enter a number");
        b=sc.nextInt();
        result = a+b;
        System.out.println("Result is:"+result);
    }
}