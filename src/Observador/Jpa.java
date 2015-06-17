/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observador;

import java.util.Collection;
import java.util.Iterator;
import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import persistence.Persona;

/**
 *
 * @author Diaz
 */
public class Jpa implements Sujeto  {
   ArrayList<Persona> personas;
    ArrayList<Observador> Observadores;
    public Jpa() {
        personas = new ArrayList<Persona>();
        Observadores = new ArrayList<Observador>();
    }

    
    
    public void getEstado(){
        notificar();
        
    }
    public void setEstado(){
        notificar();
        
    }

    @Override
    public void registrarObservador(Observador p) {
        System.out.println("Agregando observador");
        Observadores.add(p);
    }

    @Override
    public void notificar() {
        int size = Observadores.size();
        System.out.println(size);
        for (int x = 0; x < Observadores.size(); x++) {
            Observadores.get(x).actualizar();
        }

    }

        
    
}
