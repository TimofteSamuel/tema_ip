/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sami
 */
public class IP_Ex1 {
    
    public static void main(String[] args) {
        String filename="/Users/sami/desktop/matrix.txt";
        String linie=null;
        String[][] matrix2=new String[10][10];
        int count=0;
        try{
            FileReader fr=new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            while((linie=br.readLine())!=null){
                for(int i=0;i<linie.length();i++){
                    matrix2[count][i]=Character.toString(linie.charAt(i));
                }
                count++;   
            br.close();
            }   
        }
        catch(FileNotFoundException ex){
            System.out.println("Unabile to open file");
        }
        catch(IOException ex2){
            System.out.println("error reading");
        }
         
        //stelute star =new stelute(lungime,latime);
        stelute star2 = new stelute(matrix2);
        //star2.fromBinToStars();
        star2.afisStars();
    }
    
}
