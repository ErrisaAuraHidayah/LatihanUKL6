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
public class LatihanUKL6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        // Latihan Matriks Pertambahan
        
        int [][] matriksA = {{1,3},{2,4}};
        int [][] matriksB = {{4,2},{3,1}};
        
        int [][] hasil = new int [2][2];
        
        System.out.println("Hasil Pertambahan matriks A dan Matriks B");
        for(int i =0; i<2; i++){
            for(int j=0; j<2; j++){
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println(" ");
        }
    
        
    }
    
}
