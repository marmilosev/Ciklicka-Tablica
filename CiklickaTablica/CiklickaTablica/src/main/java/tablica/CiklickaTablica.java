/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class CiklickaTablica {

    public static void main(String[] args) {

        int i = Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
        int[][] matrica = new int[i][j];
        int n = 1;
        int suma = i * j;
        int donjiRed = i - 1;
        int gornjiRed = 0;
        int lijeviStupac = 0;
        int desniStupac = j - 1;

        while (n <= suma) {
            //donji red
            for (int k = desniStupac; k >= lijeviStupac; k--) {
                matrica[donjiRed][k] = n++;
            }
            donjiRed--;
            
            if(n >= suma){
                break;
            }
            
            //lijeviStupac
            for (int k = donjiRed; k >= gornjiRed; k--) {
                matrica[k][lijeviStupac] = n++;
            }
            lijeviStupac++;
            
            if(n >= suma){
                break;
            }

            //gornjiRed
            for (int k = lijeviStupac; k <= desniStupac; k++) {
                matrica[gornjiRed][k] = n++;
            }
            gornjiRed++;
            
            if(n >= suma){
                break;
            }

            //desniStupac
            for (int k = gornjiRed; k <= donjiRed; k++) {
                matrica[k][desniStupac] = n++;
            }
            desniStupac--;
           
        }
        //ispis matrice
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(matrica[k][l] + "\t");
            }
            System.out.println();
        }

//        while (n <= suma){
//            //gornji red
//            for(int k = lijeviStupac; k <= desniStupac; k++){
//                matrica[gornjiRed][k] = n++;
//            }
//            gornjiRed++;
//            
//            //desni stupac
//            for(int k = gornjiRed; k <= donjiRed; k++){
//                matrica[k][desniStupac] = n++;
//            }
//            desniStupac--;
//           
//            //donji red
//            for(int k = desniStupac; k >= lijeviStupac; k--){
//                matrica[donjiRed][k] = n++;
//            }
//            donjiRed--;
//            
//            //lijevi stupac
//            for(int k = donjiRed; k >= gornjiRed; k--){
//                matrica[k][lijeviStupac] = n++;
//            }
//            lijeviStupac++;
//            
//        }
//        
//        //ispis matrice
//        for(int k = 0; k < i; k++){
//            for(int l = 0; l < j; l++){
//                System.out.print(matrica[k][l] + "\t");
//            }
//            System.out.println();
//        }
    }
}
