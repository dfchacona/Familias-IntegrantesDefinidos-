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
    
    public Familia(){
        this.integrantes= new Persona[4];
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        System.out.println("Ingrese el apellido: ");
        String apellido= lectura.next();
        System.out.println("Ingrese el nombre del padre: ");
        String nombre= lectura.next();
        System.out.println("Ingrese la edad del padre: ");
        int edad= lectura.nextInt();
        Persona padre= new Persona(nombre, apellido,"Masculino", "Padre", edad);
        System.out.println("Ingrese el nombre de la madre: ");
        nombre= lectura.next();
        System.out.println("Ingrese la edad de la madre: ");
        edad= lectura.nextInt();
        Persona madre= new Persona(nombre, apellido,"Femenino", "Madre", edad);
        System.out.println("Ingrese el nombre del hijo: ");
        nombre= lectura.next();
        System.out.println("Ingrese la edad del hijo: ");
        edad= lectura.nextInt();
        System.out.println("Ingrese el genero del hijo");
        String genero=lectura.next();
        Persona hijo1= new Persona(nombre, apellido, genero, "Hijo", edad);
        System.out.println("Ingrese el nombre del hijo: ");
        nombre= lectura.next();
        System.out.println("Ingrese la edad del hijo: ");
        edad= lectura.nextInt();
        System.out.println("Ingrese el genero del hijo");
        genero=lectura.next();
        Persona hijo2= new Persona(nombre, apellido, genero, "Hijo", edad);
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
