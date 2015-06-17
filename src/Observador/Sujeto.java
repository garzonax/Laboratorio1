/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observador;

import java.util.List;
import persistence.Persona;

/**
 *
 * @author Diaz
 */
public interface Sujeto {
    
    public void registrarObservador(Observador p);
    public void notificar();
    
}
