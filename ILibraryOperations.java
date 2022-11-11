/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


public interface ILibraryOperations {
    void insertStudent(Student e);
    void removeStudent(int id);
    void showAllStudent();
    
    void insertTeacher(Teacher t);
    void removeTeacher(int id);
    void showAllTeacher();
    
    void insertLibrarian(Librarian l);
    void removeLibrarian(int id);
    void showAllLibrarian();
    
    void insertBook(Book b);
    void removeBook(int id);
    void showAllBook();
}
