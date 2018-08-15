/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9nisrina;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class latihan4 {
    public static void hitung(int jarak, int waktu)
    {
        
    }
    public static void main(String[] args){
        
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukkan jarak : ");
        int jarak = masukan.nextInt();
        
        System.out.println("masukkan waktu : ");
        int waktu = masukan.nextInt();
        
        int kecepatan = jarak / waktu;
       
        System.out.println("KECEPATAN : " + (jarak / waktu) + "KM/JAM");
    }
    
}
