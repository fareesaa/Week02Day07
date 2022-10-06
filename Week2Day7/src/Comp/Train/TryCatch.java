package Comp.Train;

public class TryCatch {
    public static void main(String args[]){
        try{
            int hasil = 50/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        try{
            int data = 25/5;
            System.out.println(data);

        }catch (NullPointerException ne){
            System.out.println(ne);
        }
        finally {
            System.out.println("executed finally");
        }
    }
}
