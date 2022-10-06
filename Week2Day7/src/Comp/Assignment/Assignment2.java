package Comp.Assignment;

class Parent{
    public void home(){
        System.out.println("Parent's Home");
    }
    public void car(){
        System.out.println("Parent's Car");
    }
}
class Child extends Parent{
    @Override
    public void car(){
        System.out.println("Child's Car");
    }
    public void parentCall(){
        super.home();
        super.car();
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        // create an object of the subclass
        Child child = new Child();
        child.parentCall();
        child.car();

    }
}
