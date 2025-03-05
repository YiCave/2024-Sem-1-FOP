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
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int input=sc.nextInt();
        
        double sum=0;
        for(int i=1;i<=input;i++){
            sum+=(double)1/i;
        }
        
        System.out.println("The final computed number is "+sum);
    }
}
