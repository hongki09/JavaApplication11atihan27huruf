/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11atihan27huruf;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan27Huruf {
    static String inputan;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        inputan = value.nextLine();
        
        System.out.println();
        System.out.println("====== Hasil Formatting ======");
        System.out.println("Huruf Besar : "+inputan.toUpperCase());
        System.out.println("Huruf Kecil : "+inputan.toLowerCase());
        
        // TODO code application logic here
    }
    
}