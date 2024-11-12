/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany._4id_amayo_potenzaproj;

/**
 *
 * @israel amayo 4infd 2024-10-28
 * consegna:
 * creare un programma che chieda due valori all'utente e poi esegua il calcolo della potenza
 */
public class potenzaproj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo un oggetto per la classe inizializzazione che gestira l'intput dell'utente
        inizializzazione proj = new inizializzazione();
        
        //creo un oggetto per la classe calcolo che gestira appunto  il calcolo della potenza
        calcolo potenza1= new calcolo ();
        
        // richiamo il metodo scanner1 che inizializzera le varibili tramite l'input dell'utente 
         proj.scanner1();
         
         // richiamo il metodo calc che fara il calcolo della potenza e ne stampera il risultato  
         potenza1.calc();
     
        
    }
    
}
