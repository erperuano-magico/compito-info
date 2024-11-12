package com.mycompany._4id_amayo_potenzaproj;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @israel amayo 4infd 2024-10-28
 * Questa classe si occupa del calcolo della potenza e della stamp a del risultato 
 */

public class calcolo {
    
//inizializzo la variabile ris(risultato) a 1
public int ris = 1;


    public void calc (){
        
        //creo un oggetto per la classe inizializzazione che mi servira per recuperare le variabili num e pot
       inizializzazione proj = new inizializzazione();
       
      //recupero i valori di num e pot tramite il metodo get_num e get_pot  
      int num=  proj.get_num();
      int pot=  proj.get_pot();   
      
      
//ciclo for che si occupa di fare il calcolo della potenza         
for(int i=0; i < pot; i++){
           
           //calcolo della potenza
            ris= ris*num;
           
    }
//stampa del risultato 
 System.out.println("il risultato della potenza e "+ris);

}
}
