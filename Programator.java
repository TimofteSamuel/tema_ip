/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_ex1a;

/**
 *
 * @author sami
 */
public class Programator {
    Angajat angajat;
    boolean java;
    boolean cpp;
    boolean c;
    
    Programator(String nume,String prenume,int varsta,String limbaj1,String limbaj2, String limbaj3){
        this.angajat.nume = nume;
        this.angajat.prenume = prenume;
        this.angajat.varsta = varsta;
        
        if(limbaj1 == "java" || limbaj2 == "java" || limbaj3=="java"){
            this.java = true;
        }
        if(limbaj1 == "cpp" || limbaj2 == "cpp" || limbaj3=="cpp"){
            this.cpp = true;
        }
        if(limbaj1 == "c" || limbaj2 == "c" || limbaj3=="c"){
            this.c = true;
        }
    }
    public int knowsC(){
        if(this.c == true){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int knowsCpp(){
        if(this.cpp == true){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int knowsJava(){
        if(this.c == true){
            return 1;
        }
        else {
            return 0;
        }
    }
}
