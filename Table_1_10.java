import java.util.Scanner;
public class Table_1_10 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        i=sc.nextInt();
        for(int a=1;a<11;a++){
            // itrate 10 time
            System.out.println(i+"*"+a+"="+i*a );
        }
    }    
}
