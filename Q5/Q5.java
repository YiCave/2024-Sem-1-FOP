/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Q5 {
    public static void main(String[] args) {
        String[][]datas=new String[4][4];
        int counter=0;
        try{
            BufferedReader input=new BufferedReader(new FileReader("C:\\Users\\user\\OneDrive\\Documents\\NetBeansProjects\\PastYear2024Sem1\\participants.txt"));
            String currentline="";
            
            while((currentline=input.readLine())!=null){
                String[]temp=currentline.split(",");
                int i=0;
                int j=0;
                datas[counter][i++]=temp[j++].replaceAll("\\s+", "");
                datas[counter][i++]=temp[j++].replaceAll("\\s+", "");
                datas[counter][i++]=temp[j++].replaceAll("\\s+", "");
                datas[counter][i]=temp[j].replaceAll("\\s+", "").toLowerCase();
                counter++;
            }
            
            
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("File not readable");
        }
        
        for(String[]data:datas){
            for(String singledata:data){
                System.out.print(singledata+" ");
            }
            System.out.println("");
        }
        
        //then now can easily compare
        
        
    }
    
    public static void checkDuplicate(String[][]datas){
       int j=3;
       boolean isDuplicate=false;
       int duplicated=0;
       String[]duplicatepair=new String[2];
       
       for(int i=0;i<datas.length;i++){
           String  address=datas[i][j];
           for(int k=0;k<datas.length;k++){
               if(address.equalsIgnoreCase(datas[k][j])){
                   isDuplicate=true;
                   duplicated=k;
                   break;
               }
           }
           if(isDuplicate){
               duplicatepair[0]=datas[i][j];
               duplicatepair[1]=datas[i][duplicated];
           }
       }
        
}
}