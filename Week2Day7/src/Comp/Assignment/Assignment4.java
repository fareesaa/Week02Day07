package Comp.Assignment;

import java.util.*;

abstract class Worker{
    int IDKaryawan;
    String Nama="";
    int Absensi;


    abstract int tambahAbsensi();
}


class Staff extends Worker{


    String jabatan;
    public Staff(int id, String nama, String jabatan , int absen) {
        this.IDKaryawan = id;
        this.Nama = nama;
        this.jabatan = jabatan;
        this.Absensi = absen;
    }
    public int getIDKaryawan() {
        return IDKaryawan;
    }

    public void setIDKaryawan(int IDKaryawan) {
        this.IDKaryawan = IDKaryawan;
    }
    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getAbsensi() {
        return Absensi;
    }
    public void setAbsensi(int absensi) {
        Absensi = absensi;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    int tambahAbsensi() {
       return this.Absensi++;
    }
}


public class Assignment4 {
    Map m = new HashMap();
    Scanner input = new Scanner(System.in);
    void inputDummy(){
        m.put(1,new Staff( 1,"Tom", "Staff Senior",0));
        m.put(2,new Staff( 2,"Andika", "Staff Senior",0));
    }
    public void absen(){
        System.out.println("Masukkan Id yang dituju");
        int id = input.nextInt();


        Set set = m.entrySet();
        Iterator itr = set.iterator();

        System.out.println("ID\tNama\t\tJabatan");

        while (itr.hasNext()){
            Map.Entry entry =(Map.Entry)itr.next();
            Staff st = (Staff) entry.getValue();
            if(id == st.getIDKaryawan()){

                System.out.println(entry.getKey()+"\t"+ st.getNama()+"\t\t"+st.getJabatan());
                st.tambahAbsensi();
            }
        }
    }

    public void tampilData(){
        Set set = m.entrySet();
        Iterator itr = set.iterator();

        System.out.println("ID\tNama\t\tJabatan\tTotal Absen");

        while (itr.hasNext()){
            Map.Entry entry =(Map.Entry) itr.next();
            Staff st =(Staff) entry.getValue();
            System.out.println(entry.getKey()+"\t"+ st.getNama()+"\t\t"+st.getJabatan()+"\t" + st.getAbsensi());
        }
    }
    public void inputData(){
        System.out.print("Input ID : ");
        int id = this.input.nextInt();
        System.out.print("Input Nama : ");
        String nama = this.input.next();
        System.out.print("Input Jabatan : ");
        String jabatan = this.input.next();

        Staff st = new Staff(id, nama, jabatan,0);
        m.put(id,st);
    }
    public static void main(String [] args){

        Assignment4 ass = new Assignment4();
        Scanner input = new Scanner(System.in);
        int pil=0;

        do {
            System.out.println("MENU");
            System.out.println("0. Masukkan Dummy Data");
            System.out.println("1. Buat Staff");
            System.out.println("2. Absen Staff");
            System.out.println("3. Tampilkan Staff");

            System.out.println("99. EXIT");

            System.out.print("Input nomor : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    ass.inputData();
                    break;
                case 2:
                    ass.absen();
                    break;
                case 3:
                    ass.tampilData();
                    break;
                case 0:
                    ass.inputDummy();
                    break;
            }
            System.out.println();

        } while(pil != 99);

        // closing the scanner object
        input.close();
    }
}
