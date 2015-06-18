/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;


import Observador.AgregarDato;
import static Observador.AgregarDato.id1;
import static Observador.AgregarDato.label1;
import static Observador.AgregarDato.sujeto;
import Observador.ClI;
import Observador.Jpa;
import Observador.Observador;
import Observador.Sujeto;
//import Observador.UI1;
import java.util.Scanner;
import persistence.Persona;


/**
 *
 * @author Pablito Garzona
 */
public class Consola implements Observador {
    
    
    
       public Consola(Sujeto sujeto) {
        this.sujeto = sujeto;
                
        main(null);
        
        
        
    }
    public static Sujeto sujeto;
     public static int id1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        String status;
        String status1= new String("conectado");
        String status2= new String("no conectado");
        
        Scanner in = new Scanner(System.in);
        Sujeto sujeto = new Jpa();
        Observador observador1= new ClI(sujeto);   
       // Observador observador2= new UI1(sujeto);
          
        
         sujeto.registrarObservador(observador1);
        //sujeto.registrarObservador(observador2);
          
         // PARTE DE CONSOLA
         
               
         
         
         Persona p= new Persona();
         p.setId(id1);
         System.out.println("BASE DE DATOS");
         System.out.println("Ingrese Nombre");
         p.setNombre(in.next());
         System.out.println("Ingrese Apellido");
         p.setApellido(in.next());
         System.out.println("Ingrese Status");
        status = in.next();
         
         
         if (status.equals(status1))   {
             p.setConectado(true);
          }
         if (status.equals(status2)){
             p.setConectado(false);
         }
             
         
       /* p.setId(id1);
        p.setNombre(texto1.getText());
        p.setApellido(texto2.getText());
        if(RadioBoton1.isSelected()){
            p.setConectado(true); 
        }
        if(RadioBoton2.isSelected()){
            p.setConectado(false); 
        }
        sujeto.Ingresar(p);
        
         */
         
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
