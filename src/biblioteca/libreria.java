/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class libreria {
    int scelta;
    libro new_libro = new libro();
    Scanner scan = new Scanner(System.in);
    ArrayList<libro> lista = new ArrayList<libro>();
    public void opzioni(){
        OUTER:
        do{
            System.out.println("inserire una fra le seguenti opzioni:");
             System.out.println("1 per aggiungere un libro");
              System.out.println("2 per cancellare un libro ");
               System.out.println("3 per visualizzare i libri");
                System.out.println("4 per uscire dal programma");
                scelta= scan.nextInt();
                
                
                switch(scelta){
                    case 1:
                        new_libro.inserisci();
                        lista.add(new_libro);
                        
                        break;
                        
                    case 2:
                        lista.remove(0);
                        break;
                                
                    case 3: 
                        int cont=lista.size();
                        if(cont!=0){
                        for (int i=0; i<cont ; i++){
                            System.out.println(lista.get(i));
                        }
                        }else
                            System.out.println("la libreria e vuota");
                        break;
                    case 4:
                        break;
                                      
                    default:
                        System.out.println("inserire una delle 4 opzioni");
                }
                    
                
                
        }while(scelta != 4);
        
    }
}
