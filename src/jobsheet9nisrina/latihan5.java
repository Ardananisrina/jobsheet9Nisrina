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
public class latihan5 {
    public static void terbesar(double x, double y, double z)
    {
      System.out.print("menentukan bilangan terbesar");
    }
    public static void main(String[] args){
        System.out.println("menentukan bilangan terbesar");
      Scanner inputan = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      System.out.print("masukkan bilangan I :");
      int bilanganI = inputan.nextInt();
      
      System.out.print("masukkan bilangan II :");
      int bilanganII = inputan.nextInt();
      
      System.out.print("masukkan bilangan III :");
      int bilanganIII = inputan.nextInt();
      
      if(bilanganI > bilanganII && bilanganI > bilanganIII) {System.out.println(bilanganI + " adalah bilangan terbesar");
      }else if(bilanganII > bilanganI && bilanganII > bilanganIII) {System.out.println(bilanganII + " adalah bilangan terbesar");
      }else if(bilanganIII > bilanganI && bilanganIII > bilanganII) {System.out.println(bilanganIII + " adalah bilangan terbesar");
      }
  
    }
    
}
