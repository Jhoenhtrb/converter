/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatact;

/**
 *
 * @author Villagonzalo_CPE
 */
public class Converter {
       public static void main (String args[]) {
       java.util.Scanner input =new java.util.Scanner(System.in);
        System.out.println("J's Converter");
       System.out.println(   "1.C to F"
                            + " 2.F to C"
                            + " 3.K to F"
                            + " 4.K to C"
                            + " 5.C to K"
                            + " 6.F to K"  );     
       System.out.println("Choose conversion:");
               int a= input.nextInt();
               
               if (a==1) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println(((b*9/5)+32) + " Fahrenheit ");
               }
               if (a==2) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println(((b-32)*5/9) + " Celcius ");
               }
               if (a==3) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println((((b-273.15)*1.8)+32) + " Fahrenheit ");
               }
               if (a==4) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println((b-273.15) + " Celcius ");
               }
               if (a==5) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println((b+273.15) + " Kelvin ");
               }
               if (a==6) {
                   System.out.println("Enter Temp");
                           double b = input.nextInt();
                           System.out.println((((b-32)*5/9)+273.15) + " Kelvin ");
               }

    
}
}
