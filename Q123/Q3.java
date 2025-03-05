/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q123;

/**
 *
 * @author user
 */
public class Q3 {
    public static void main(String[] args) {
        
        Guitar g=new Guitar();
        Piano p=new Piano();
    
        Playable[] things={g,p};
        
        for(int i=0;i<things.length;i++){
            things[i].play();
        }
    }
}
