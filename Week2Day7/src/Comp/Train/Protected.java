package Comp.Train;
class AnimalProtected {
    protected String name;
    protected void display() {
        System.out.println("I am an animal.");
    }
}
class DogProtected extends AnimalProtected {
    public void getInfo() {
        System.out.println("My name is " + name);
    }
}
