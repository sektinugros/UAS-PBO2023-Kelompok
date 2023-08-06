package UAS;

import java.util.Scanner;
public class Soal2 {
    
    public static void main(String[] args) {
      double  a = 100, b = 25, hasil = 0;
    
    Scanner input = new Scanner(System.in);
        
    
    
        System.out.println("_____________________________________________________________");    
        System.out.println("Berikut ini Menampilkan Hasil Program Penjumlahan dan Pengurangan ");
        System.out.println("Dengan nilai a = 100 dan Nilai b = 25 .");
        System.out.println("_____________________________________________________________");
        System.out.println("Ketikkan Pilihan Anda Dibawah ini: ");
        System.out.println("-----------------------------------");
        System.out.println("1 . menampilkan Hasil dari a + b :");
        System.out.println("2 . menampilkan hasil dari a - b :");

        System.out.println("_____________________________________________________________");
        System.out.print ("masukkan pilihan anda :  ");
        String pilihan = input.nextLine();
        
        
switch (pilihan) {
case "1" -> {
    hasil = a + b;
    System.out.println("Hasil dari Perhitungan a + b adalah : " + hasil);
            }
case "2" -> {
    hasil = a - b;
    System.out.println("Hasil dari Perhitungan a - b adalah : " + hasil);
            }
default -> System.out.println("Maaf Pilihan Anda Salah !");            
         }
    }
}
