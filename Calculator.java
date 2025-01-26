class Calculator
{
    public static void main(int x,char op,int y)
    {
        int res=0;
        {
            if(op=='+'){
             res=x+y;
            System.out.println("add = "+res);
            }
            else if(op=='-'){
            res=x-y;
            System.out.println("sub = " + res);
            }
           else{
            System.out.println("invalid op");
           }
        }
       
    }
}