/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q123;

/**
 *
 * @author user
 */
public class Q2b {
    
    public static void main(String[] args) {
        Book book=new Book("lili","hapy book",2000);
        Book bookcopy=new Book(book);
        Book bookcloned=book.clone();
        
       
        System.out.println(book.toString());
        System.out.println(bookcopy.toString());
        System.out.println(bookcloned.toString());
    }
    
}
