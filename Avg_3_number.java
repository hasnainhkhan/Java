import java.util.*;
class Avg_3_number{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);//object scaner 
        System.out.println("Enter sum number you want to add");//
        String number = obj.nextLine();
        String regex = "[,\\.\\s]";
        String[] strArray = number.split(regex);
        int sum = 0;
        for(String str:strArray){
            sum +=Integer.parseInt(str);
        }
        System.out.println("Sum:"+sum);

    }
}