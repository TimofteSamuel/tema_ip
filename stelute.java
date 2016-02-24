/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_ex1;
import java.io.*;
/**
 *
 * @author sami
 */
public class stelute {
    final private int lungime_matrice;
    final private int latime_matrice;
    private String[][] matrix;
    
    public stelute(int var1,int var2){
        lungime_matrice=var1;
        latime_matrice=var2;
        matrix=new String[lungime_matrice][latime_matrice];
    }
    public stelute(String[][] v){
        this.matrix=v;
        lungime_matrice=v.length;
        latime_matrice=v[0].length;
    }
    
    public void read_matrix(){
        String filename="/Users/sami/desktop/matrix.txt";
        String linie=null;
        String[][] matrix2=new String[100][100];
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
    }
    
    public void fromBinToStars(){
        for(int i=0;i<lungime_matrice;i++){
            for(int j=0;j<latime_matrice;j++){
                int result = matrix[i][j].compareTo("0");
                if(result == 0){
                      matrix[i][j] = " ";
                }
                if(result != 0){
                    matrix[i][j] = "*";
                }
            }
        }
    }
    
    public void afisStars(){
        for(int i=0;i<lungime_matrice;i++){
            for(int j=0;j<latime_matrice;j++){
                 System.out.print(this.matrix[i][j]);
                 System.out.print(" ");
            }
             System.out.println("");
        }
    }
    
}
