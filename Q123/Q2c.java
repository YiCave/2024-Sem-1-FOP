/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q123;

/**
 *
 * @author user
 */
public class Q2c {
    
    public static void main(String[] args) {
        int age=18;
        try{
            computeAge(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    static String computeAge(int age)throws InvalidAgeException{
        String abc="";
      if(age<18){
          throw new InvalidAgeException("U ARE UNDERAGE");
      }else if(age>=18){
          abc="U are good";
      }
      return abc;
    }
}
