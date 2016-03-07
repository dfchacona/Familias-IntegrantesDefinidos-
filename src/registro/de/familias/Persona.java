/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.de.familias;

/**
 *
 * @author dieguischa
 */
public class Persona {
    private String nombre; 
    private String apellido; 
    private String rol; 
    private String sexo; 
    private int edad; 

    public Persona(String nombre, String apellido, String sexo, String rol, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
