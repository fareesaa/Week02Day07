    package Comp.Assignment;

class Parent1{
    protected String name = "Mr.USD";
    protected int money = 20000000;
    public void home(){
        System.out.println("Parent's Home");
    }
    public void car(){
        System.out.println("Parent's Car");
    }
}
class Child1 extends Parent1{
    public String name = "Tom";
    public int money = 200;
    @Override
    public void car(){
        System.out.println("Child's Car");
    }
    public void parentCall(){
        super.home();
        super.car();
    }

    public void parentInfo(){
        System.out.println("=====Parent Info=====");
        System.out.println("Parent Name: " + super.name);
        System.out.println("Parent Money: " + super.money);
    }
    public void childInfo(){
        System.out.println("=====Child Info=====");
        System.out.println("Name : " + name);
        System.out.println("Money : " + money);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        // create an object of the subclass
        Child1 child = new Child1();
        child.parentCall();
        child.car();
        child.parentInfo();
        child.childInfo();
    }
}
