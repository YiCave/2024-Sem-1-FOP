/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q123;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int posnum=0,negnum=0,zero=0;
        do{
            System.out.println("Please enter a number(X to quit):");
            String input=sc.next();
            if(input.equalsIgnoreCase("X")){
                break;
            }
            
            if(!Character.isDigit(input.charAt(0))){
                System.out.println("Invalid Input, reenter");
                continue;
            }
            
            int num=Integer.parseInt(input);
            if(num>0){
                posnum++;
            }else if(num<0){
                negnum++;
            }else
                zero++;
        
        }while(true);
        
        System.out.println("Positive numbers:"+posnum);
        System.out.println("Negative numbers:"+negnum);
        System.out.println("Zeros:"+zero);
        
    }
}
