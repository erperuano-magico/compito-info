/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class libro {
    private String titolo;
    private String autore;
    private String editore;
    private int anno;
   
    Scanner scan = new Scanner(System.in);
    
    public void inserisci(){
        System.out.println("inserire il titolo del libro");
        titolo= scan.nextLine();
        
        System.out.println("inserire l'autore del libro");
        autore= scan.nextLine();
        
        System.out.println("inserire l'editore del libro");
        editore= scan.nextLine();
        
        System.out.println("inserire l'anno del libro");
        anno= scan.nextInt();
        
        
    }
}
