package pbo;

import java.util.Scanner;

public class contohberaksi {
        public static void main(String[] args) {
        //objek
        //DataDiri biodata = new DataDiri("6305 - 23042003 - 04","Rinaldy");
        
        //System.out.println(biodata.displayInfo());
        //System.out.println(biodata.displayInfo("Kandangan"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        contohdetail[] mobil = new contohdetail[2];
        
        //perulangan
        for(int i =0; i<mobil.length;i++){  
        System.out.print(" Masukkan Plat"+(i+1)+" = ");
        String plat = scanner.nextLine();
        System.out.print(" Masukkan Namamobil  "+(i+1)+" = ");
        String namamobil = scanner.nextLine();
        
        //objek
        mobil[i] = new contohdetail(plat,namamobil);
        }
        
        //perulangan
        for(contohdetail data : mobil) {
            System.out.println("====================");
            System.out.println("Nomor Seri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Plat "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Namamobil"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
