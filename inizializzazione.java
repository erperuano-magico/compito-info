package com.mycompany._4id_amayo_potenzaproj;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @israel amayo 4infd 2024-10-28
 * Questa e la claase che si occupa di gestire l'intput dell'utente 
 */
public class inizializzazione {
    //dichiaro le variabili num e pot che andranno inizializzate dall'utente
    public int num;
    public int pot;
    
    //creo il metodo get_num per ottenere il valore di num
    public int get_num(){
           
        return num;
    }
    
    //creo il metodo get_pot per ottenere il valore pot
    public int get_pot(){
        
        return pot;
    }
    
    
    public void scanner1 () {
        
        //creazione dell'ogetto per lo scan
        Scanner POTENZA = new Scanner(System.in);
        
        //chiedo all'utente di dare un valore alle variabili num e pot
       System.out.println("inserire il valore del numero e della sua potenza");
          
        //inizializzazione delle variabili da parte dell'utente 
        num = POTENZA.nextInt();
        pot = POTENZA.nextInt();
    }
}
