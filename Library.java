/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

public class Library implements ILibraryOperations{
    Book books[] = new Book[100];
    Teacher teachers[] = new Teacher[100];
    Student students[] = new Student[100];
    Librarian librarians[] = new Librarian[100];
    
    public void insertStudent(Student e){  
        int f=0;
        for(int i=0; i<students.length; i++){
            if(students[i]==null){
                students[i] = e;
                f=1;
                break;
            }
        }
    }
    public void removeStudent(int id){
        int f=0;
        for(int i=0; i<students.length; i++){
            if(students[i].getSid() == id){
                students[i]=null;
                f=1;
                break;
            }
        }
    }
    public void showAllStudent(){
        for(Student s : students){
            if(s!=null){
                s.showInfo();
            }       
        }
    }
    
    
    public void insertTeacher(Teacher t){
        int f=0;
        for(int i=0; i<teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = t;
                f = 1;
                break;
            }
        }
    }
    public void removeTeacher(int id){
        int f=0;
        for(int i=0; i<teachers.length; i++){
            if(teachers[i].getTid() == id){
                teachers[i]=null;
                f=1;
                break;
            }
        }            
    }
    public void showAllTeacher(){
        for(Teacher t : teachers){
            if(t!=null){
                t.showInfo();
            }       
        }
    }
    
    
    public void insertLibrarian(Librarian l){
        int f=0;
        for(int i=0; i<librarians.length; i++) {
            if (librarians[i] == null) {
                librarians[i] = l;
                f = 1;
                break;
            }
        }
    }
    public void removeLibrarian(int id){
        int f=0;
        for(int i=0; i<librarians.length; i++){
            if(librarians[i].getLid() == id){
                librarians[i]=null;
                f=1;
                break;
            }
        }       
    }
    public void showAllLibrarian(){
        for(Librarian l : librarians){
            if(l!=null){
                l.showInfo();
            }       
        }
    }
    
    
    
    
    public void insertBook(Book b){
        int f=0;
        for(int i=0; i<books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                f = 1;
                break;
            }
        }
    }
    public void removeBook(int id){
        int f=0;
        for(int i=0; i<books.length; i++){
            if(books[i].getbId() == id){
                books[i]=null;
                f=1;
                break;
            }
        }  
    }
    public void showAllBook(){
        for(Book b : books){
            if(b!=null){
                b.showInfo();
            }       
        }
    }
    
}
