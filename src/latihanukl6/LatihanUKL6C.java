/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl6;

/**
 *
 * @author erisa
 */
public class LatihanUKL6C {
    public static void main (String [] args){
        //Latihan perkalian Matriks
        
        int[][] matriksA = {{6,3},{4,8}};
        int[] matriksB = {1,2};
        int[] hasil = new int[2];
        
        for(int a=0; a<2; a++){
            for(int b=0; b<2; b++){
                for(int c=0; c<1; c++){
                    System.out.print(matriksB[c]);
                    hasil[c]= (matriksA[0][0] * matriksB[0])+(matriksA[0][1] * matriksB[1]);
                }
                System.out.print(matriksA[a][b]+ " ");
                
            }
            System.out.println(" ");
        }
    }
    
}
