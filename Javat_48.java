class Javat_48{
    private int a; // reference variabble
    private int b;
    private Men men; // reference class
    public Javat_48(int c,int d){ //constructure
        this.a=c;
        this.b=d;
        System.out.println("Constructor");
        men = new Men(); // constructure variable
    }

    public int Show(int a,int b){
        System.out.print("Show");
        return a+b;

        
    }
     public int Show(int a){
            System.out.print("Do Nothing");
            return a;
        }
    public void setA(int a){
        this.a=a;

    }
    public void setB(int b){ // setter
        this.b=b;
    }
    public int getA(){
        return a; // getter
    }
    public int getB(){
        return b;
        }

 
    private class Men{ //inner class
        private String name; 
        private String gender;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public String getGender(){
            return gender;
        }
    }
    public void SetMenDetails(String name,String gender){
      men.setName(name);
      men.setGender(gender);  
    }
    public void GetUserDetails(){
        System.out.println(men.getName());
        System.out.println(men.getGender());
    }

}

   
   class hello{
    
    public static void main(String[] args) {
        System.out.println("hello");
        Javat_48 sh=new Javat_48(20,30);
        sh.Show(10,20);
        int result = (sh.getA() + sh.getB());
        System.out.println(result);
        sh.SetMenDetails("hasnain", "male");
        sh.GetUserDetails();

        
    }
   }
