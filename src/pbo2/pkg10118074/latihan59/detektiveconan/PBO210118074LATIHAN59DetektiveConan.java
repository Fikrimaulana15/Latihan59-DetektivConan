/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan59.detektiveconan;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA : FIKRI MAULANA
 * KELAS : IF2
 * NIM : 10118074
 */
public class PBO210118074LATIHAN59DetektiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        Karakter karakter = new Karakter();
        
        System.out.println("===Karakter Dalam Detektif Konan===");
        System.out.println("---Berdasarkan Keahliannya---");
        karakter.tampilDaftarKeahlian();
        karakter.setKeahlian(sc.nextInt());
        
        System.out.println("");
        
        karakter.tampilKeahlian(karakter.getKeahlian());
        
        System.out.println("developed by : fikri maulana");
    }
    
}
    

