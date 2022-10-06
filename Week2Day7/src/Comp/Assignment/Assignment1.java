package Comp.Assignment;
import java.util.*;


class Karyawan{
    int id;
    String nama="";

    //getter setter id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //getter setter nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
class Jabatan extends Karyawan{
    String jabatan="";

    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String display() {
        String s = ( getNama()+ "\t\t"+getJabatan());
    return s;
    }
}
public class Assignment1{

    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        Scanner inputInt= new Scanner(System.in);
        Jabatan jabat = new Jabatan();
        //membuat map
        Map<Integer,String> map=new HashMap<Integer,String>();
        //Adding elements to map

        int x=1, loop=2;
        while(x<loop){
            System.out.println("MENU ");
            System.out.println("1. Buat Staff");
            System.out.println("2. Tampilkan Laporan data staff ");
            System.out.println("4. EXIT ");
            System.out.println("");
            System.out.print("Input Menu : ");
            System.out.print("");

            //mendeklarasikan switch menu
            int menu = inputInt.nextInt();
            switch (menu) {
                case 1:
                    for (int i=1;i<=3;i++){
                        System.out.print("==================");
                        jabat.id = i;
                        System.out.print("Input Nama " + i + ": ");
                        jabat.nama = input.nextLine();
                        System.out.print("Input Jabatan" + i + ": ");
                        jabat.jabatan = input.nextLine();
                        String s = jabat.display();
                        map.put(jabat.id, s );
                    }
                    break;
                case 2:
                    Set set1=map.entrySet();
                    Iterator itr1=set1.iterator();
                    System.out.println("ID\t\t Nama\t\t Jabatan");
                    while(itr1.hasNext()){
                        Map.Entry entry=(Map.Entry)itr1.next();

                        System.out.println(entry.getKey()+"\t\t"+entry.getValue());
                    }
                    break;
                }

            }
            input.close();
            inputInt.close();
        }
        
}


