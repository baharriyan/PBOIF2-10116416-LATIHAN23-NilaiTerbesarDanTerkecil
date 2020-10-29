/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116416.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Riyan bahar
 * nim: 10116416
 * PBOIF2
 */
public class PBOIF210116416LATIHAN23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner (System.in);
        System.out.print("Masukan nama Petugas : ");
        String namaPetugas = input.next();
        System.out.println("Masukan banyak nilai mashasiswa : ");
        int banyakMhs= input.nextInt();
        
//       deklarasi array
        int[] nilaiMhs = new int[banyakMhs];
        
        for (int i = 1; i<=banyakMhs; i++){
            System.out.println("Masukan nilai mahasiswa ke- " +i+" : ");
            nilaiMhs[i-1] = input.nextInt();
        }
        System.out.println("");
        System.out.println("=========Nilai Mahasiswa=========");
        for(int k=1; k<=banyakMhs; k++){
            System.out.println("Nilai Mahasiswa ke - " +k+":"+nilaiMhs[k-1]);                       
        }
        System.out.println("");
            int nilaiMax= nilaiMhs[0];
            int nilaiMin= nilaiMhs[0];
            for (int j =0; j<=banyakMhs-1; j++){
                if(nilaiMhs[j]> nilaiMax){
                    nilaiMax = nilaiMhs[j];
                } else if (nilaiMhs[j]<nilaiMin){
                            nilaiMin = nilaiMhs[j];
		  }
            }
        

        
        //output
        System.out.println("");
        System.out.println("Maka Nilai Terbesar adalah " +nilaiMax);
        System.out.println("Maka Nilai Terkecil adalah " +nilaiMin);
        System.out.println("Developed by riyanbahar");
    }
    
}
