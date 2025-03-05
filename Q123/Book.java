/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q123;

/**
 *
 * @author user
 */
public class Book implements Cloneable {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String a,String b, int c){
        this.title=a;
        this.author=b;
        this.yearPublished=c;
    }
    
    public Book(Book bookori){
        this.copy(bookori);
    }
    
    @Override
    public Book clone(){
        
        try{
        Book clonedbook=(Book)super.clone();
        clonedbook.author=this.author;
        clonedbook.title=this.title;
        clonedbook.yearPublished=this.yearPublished;
         return clonedbook;
        }catch(CloneNotSupportedException e){
            System.out.println("Object not cloneable");
        }
       
        return null;
    }
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public int yearPublished(){
        return this.yearPublished;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setAuthor(String author){
        this.author=author;
    }
    
    public void setYP(int yp){
        this.yearPublished=yp;
    }
    
   
    public void copy(Book bookori){
        
        setAuthor(bookori.getAuthor());
        setTitle(bookori.getTitle());
        setYP(bookori.yearPublished());
        
        
    }
    
    public String toString(){
        return "Author"+this.author+"\nTitle:"+this.title+"\nYear Published:"+this.yearPublished;
    }
}
