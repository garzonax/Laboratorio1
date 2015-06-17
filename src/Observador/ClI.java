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
public class ClI implements Observador{
    public static Sujeto sujeto;

    public ClI(Sujeto sujeto) {
        this.sujeto = sujeto;
        main(null);
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
    }

    @Override
    public void actualizar() {
        System.out.println("conexion");
    }
    
}
