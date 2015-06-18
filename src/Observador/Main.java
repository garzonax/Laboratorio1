/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observador;

/**
 *
 * @author Diaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sujeto sujeto = new Jpa();
        Observador observador1= new ClI(sujeto);   
        Observador observador2= new UI1(sujeto);
          
        
        sujeto.registrarObservador(observador1);
        sujeto.registrarObservador(observador2);
        
        
    }
    
}
