
package com.alfredoB.AB.Interface;

import com.alfredoB.AB.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // traer una lista de personas
    public List<Persona> getPersona();
    
    // guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por Id
    public void  deletePersona(Long id);
    
    //buscar una persona por Id
    public Persona findPersona(Long id);
}
