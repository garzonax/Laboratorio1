/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Controladores.PersonaJpaController;
import java.util.List;
import javax.persistence.PersistenceException;
import persistence.Persona;

/**
 *
 * @author systemroot
 */
public class JPALabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATestPU");
        EntityManager em = emf.createEntityManager();
       PersonaJpaController controladorPersona = new PersonaJpaController(emf);
       
       
       Persona nuevoPersona = new Persona();
        nuevoPersona.setId(1);
        nuevoPersona.setNombre("Pablo");
        nuevoPersona.setApellido("Lopez");
     //   Persona nuevoUsuario2 = new Persona();
   //     nuevoUsuario2.setId(2);
      //  nuevoUsuario2.setNombre("Andres");
    //    nuevoUsuario2.setApellido("Velasquez");
        
        try {
            controladorPersona.create(nuevoPersona);
         //   controladorUsuario.create(nuevoUsuario2);
        } catch (PersistenceException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
       
        List<Persona> personas;
//        Query q;
//        q=emf.createEntityManager().createNamedQuery("Usuario.findNombreLike");
//        q=em.createNamedQuery("Usuario.findNombreLike");
//        q.setParameter("nombre","A%");
//        usuarios=q.getResultList();
        
        personas = controladorPersona.findPersonaEntities();
        ModeloTablaPersona mTabla = new ModeloTablaPersona(personas);
        Principal p = new Principal(mTabla);
        p.setVisible(true);
        personas.stream().forEach((_item) -> {
            System.out.println(_item);
        });
        emf.close();
       
       
        
        
    }
    
}
