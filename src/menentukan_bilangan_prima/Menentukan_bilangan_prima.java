/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukan_bilangan_prima;
import java.util.Scanner;
/**
 *
 * @author Dankyun
 */
public class Menentukan_bilangan_prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bil, cek=0;
        
        System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN PRIMA ATAU BUKAN");
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();
   
        System.out.println("----------------------------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            } 
        }
        
        if (cek==1){
            System.out.println(bil+" adalah bilangan prima");
        }else {
            System.out.println(bil+" bukan bilangan prima");
        }  
   }
}
    

