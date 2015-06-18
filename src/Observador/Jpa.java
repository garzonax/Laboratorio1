/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observador;

import Controladores.PersonaJpaController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistence.Persona;

/**
 *
 * @author Diaz
 */
public class Jpa implements Sujeto  {
    List<Persona> personas;
    ArrayList<Observador> Observadores;
    EntityManagerFactory emf;
    EntityManager em;
    PersonaJpaController controladorPersona;
    public Jpa() {
        personas = new ArrayList<Persona>();
        Observadores = new ArrayList<Observador>();
        emf = Persistence.createEntityManagerFactory("JPATestPU");
        em = emf.createEntityManager();
        controladorPersona = new PersonaJpaController(emf);

    }

    
    
    public void getEstado(){
        notificar();
        
    }
    public void setEstado(Persona persona){
        try {
            controladorPersona.create(persona);
        } catch (Exception ex) {
            Logger.getLogger(Jpa.class.getName()).log(Level.SEVERE, null, ex);
        }
        notificar();
        
    }
    public int getid(){
       return controladorPersona.getPersonaCount();
    }

    @Override
    public void registrarObservador(Observador p) {
        Observadores.add(p);
    }

    @Override
    public void notificar() {
        int size = Observadores.size();
        for (int x = 0; x < Observadores.size(); x++) {
            Observadores.get(x).actualizar();
        }

    }

        
    
}
