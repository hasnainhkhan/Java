class Animal_01{
    void Show(){
        System.out.println("Display");
    }
}
class Birds extends  Animal_01{
    void Run(){
        System.out.println("Running");
    }
}
class All extends  Birds{

    public static void main(String[] args) {
        Animal_01 obj = new Animal_01();
        obj.Show();
        // obj.Run();
        Birds obj1 = new Birds();
        obj1.Show();
        obj1.Run();


    }
}