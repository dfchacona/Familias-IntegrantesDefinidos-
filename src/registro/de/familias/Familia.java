package registro.de.familias;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dieguischa
 */
public class Familia {
    
    private Persona [] integrantes;
    private String apellido; 
    
    public Familia(Persona madre, Persona padre, Persona hijo1, Persona hijo2, String apellido){
        this.integrantes= new Persona[4];
        
        this.integrantes[0]=padre;
        this.integrantes[1]=madre;
        this.integrantes[2]=hijo1;
        this.integrantes[3]=hijo2;
        this.apellido=apellido; 
    }



    public String getApellido() {
        return apellido;
    }
    
    public Persona getPadre() {
        return integrantes[0];
    }
    public Persona getMadre() {
        return integrantes[1];
    }
    public Persona getHijo1() {
        return integrantes[2];
    }
    public Persona getHijo2() {
        return integrantes[3];
    }
    
}
