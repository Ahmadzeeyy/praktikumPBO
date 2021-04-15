/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmad.barizi;
import java.util.*;
class VCD{
   String name;
   String kategori;
   int stok;
}
class judul extends VCD{   
}
class sutradara extends VCD{
}
class aktor extends VCD{  
}
class publisher extends VCD{
}
class kategori extends VCD {
}

public class AhmadBarizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sutradara sutradara = new sutradara();
        ArrayList data = new ArrayList();
        judul judul = new judul();
        aktor aktor = new aktor();
        publisher publisher = new publisher();
        kategori kategori = new kategori();
        VCD stok = new VCD();
        
       System.out.print("data yang ingin di inputkan : ");
       int jumlah = input.nextInt();
       System.out.println("+===========================+");
       System.out.println("|        RENTAL VCD         |");
       System.out.println("+===========================+");
        for(int a = 0 ; a!= jumlah ; a++){
            System.out.println(" ");
            System.out.print("judul film \t : ");
            judul.name = input.next();
            data.add(judul.name);
            System.out.print("Nama Sutradara \t : ");
            sutradara.name = input.next();
            data.add(sutradara.name);
            System.out.print("Nama aktor \t : ");
            aktor.name = input.next();
            data.add(aktor.name);
            System.out.print("Nama Publisher \t : ");
            publisher.name = input.next();
            data.add(publisher.name);
            System.out.println("pilih kategori : ");
            System.out.print("1. SU(semua umur) \n2. D (dewasa) \n3. R (remaja) \n4. A (anak-anak)\n");
            System.out.print("masukkan kategori \t : ");
            int pilihan = input.nextInt();
            System.out.print("stok \t : ");
            stok.stok = input.nextInt();
            data.add(stok.stok);
            
            switch (pilihan){
                case 1:
                    kategori.kategori = "semua umur";
                    data.add(kategori.kategori);
                    break;
                case 2:
                    kategori.kategori = "Dewasa";
                    data.add(kategori.kategori);
                    break;
                case 3:
                    kategori.kategori = "Remaja";
                    data.add(kategori.kategori);
                    break;
                case 4:
                    kategori.kategori = "Anak-anak";
                    data.add(kategori.kategori);
                    break;
            }
        }
       int b =0;
       for(int a = 0 ; a!=jumlah; a++){
           System.out.println(" ");
           System.out.println("");
           System.out.println("+===========================+");
           System.out.println("|      DAFTAR STOK VCD      |");
           System.out.println("+===========================+");
           System.out.print("VCD ke-"+(a+1)+" :\n");
           System.out.println("judul film \t : "+data.get(a+b));
           b++;
           System.out.println("Nama sutradara \t : "+data.get(a+b));
           b++;
           System.out.println("Nama aktor \t : "+data.get(a+b));
           b++;
           System.out.println("Nama publisher \t : "+data.get(a+b));
           b++;
           System.out.println("stok  \t : "+data.get(a+b));
           b++;
           System.out.println("kategori\t : "+data.get(a+b));
           
           if (a+b >= data.size()){
                break;}
           }
       
       }
    }
    
