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
public class LatihanUKL6D {
    public static void main (String [] args){
        
        int [][] matriksA ={{6,3,2},{4,2,3}};
        int [][] matriksB = {{1,2},{2,3},{3,1}};
        int [][] hasil = new int[matriksA.length][matriksB[0].length];
        
        for(int barisA = 0; barisA < matriksA.length; barisA++){
            for(int kolomB =0; kolomB < matriksB[0].length; kolomB++){
                for(int c =0; c < matriksB.length; c++){
                    
                hasil [barisA][kolomB] += matriksA[barisA][c]* matriksB[c][kolomB];
                    
                }
                System.out.print(hasil[barisA][kolomB]+ " ");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
