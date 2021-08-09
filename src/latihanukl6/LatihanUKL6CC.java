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
public class LatihanUKL6CC {
    public static void main (String [] args){
        
        //Mencoba kembali Latihan 6C
        int [][] matriksA ={{6,3},{4,8}};
        int [][] matriksB ={{1},{2}};
        int [][] matriksC = new int [matriksA.length][matriksB[0].length];
        
        //matriksA[bA][kA] * matriksB[bB][kB] = matriksC [bA][kB]
        //matriksA.length -> baris matriksA
        //matriksB[0].length -> index ke - 0 = kolom matriksB
        
        for(int barisA=0; barisA < matriksA.length; barisA++){
            for(int kolomB=0; kolomB < matriksB[0].length; kolomB++ ){
                for(int c =0; c < matriksB.length; c++){
                    matriksC[barisA][kolomB] += matriksA[barisA][c] * matriksB[c][kolomB];
                }
                System.out.print(matriksC[barisA][kolomB] + " ");
                
            }
            System.out.println(" ");
        }
    }
    
}
