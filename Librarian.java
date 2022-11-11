/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

public class Librarian extends User{
    
    private int lid;

    public void setLid(int lid){
        this.lid = lid;
    }

    public int getLid(){
        return lid;
    }
    
    public void showInfo(){
        System.out.println("Librarian Name : "+getName());
        System.out.println("Librarian ID : "+getLid());
        System.out.println("Librarian Age : "+getAge());
        System.out.println();
    }
    
}
