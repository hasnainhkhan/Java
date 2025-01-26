// Correcting the issues in the code
abstract class Javat_47 {
    // Abstract method declaration with proper visibility modifier
    abstract void show();
    void hello(){
        System.out.println("Hello");
    }
}

class JavaImplementation extends Javat_47 {
    // Implementing the abstract method in the subclass
    @Override
    void show() {
        System.out.println("Show");
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance of JavaImplementation and call the show method
        Javat_47 obj = new JavaImplementation();
        obj.show(); // Output: Show
        JavaImplementation obj1 = new JavaImplementation();
        obj1.hello();
        NewInt obj3 = new newCls();
        obj3.show();
        newCls obj4 = new newCls();
        obj4.show(19);

    }
}
interface NewInt{
    int Age= 100;
    void show();
}
class newCls implements NewInt{
    @Override
    public void show(){
        System.out.println(Age);
    }
    public void show(int a){
        System.out.print("Hello");
    }
}