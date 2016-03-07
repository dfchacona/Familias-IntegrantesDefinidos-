/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.de.familias;
import java.util.*;
/**
 *
 * @author dieguischa
 */
public class RegistroDeFamilias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int eleccion=1;
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        HashMap<String, Familia> familias= new HashMap<String, Familia>();
       do{
        System.out.println("Ingrese: "
                + "\n1. Para registrar familia"
                + "\n2. Para ubicar familia por apellido"
                + "\n3. Para ubicar un miembro de familia"
                + "\n0 Para terminar el programa");
        eleccion= lectura.nextInt();
        switch (eleccion){
            case(1):
            Familia f1= new Familia();
            familias.put(f1.getApellido(), f1);
            break;
            
            case(2):
            System.out.println("Ingrese apellido que desea ubicar: ");
            String apellido=lectura.next();
            f1=familias.get(apellido);
            if(f1!=null){
            System.out.println("Padre: \nNombre: "+f1.getPadre().getNombre()+"\nEdad:"+f1.getPadre().getEdad());
            System.out.println("Madre: \nNombre: "+f1.getMadre().getNombre()+"\nEdad:"+f1.getMadre().getEdad());
            System.out.println("Hijo 1: \nNombre: "+f1.getHijo1().getNombre()+"\nEdad:"+f1.getHijo1().getEdad()+"\nGenero: "+f1.getHijo1().getSexo());
            System.out.println("Hijo 2: \nNombre: "+f1.getHijo2().getNombre()+"\nEdad:"+f1.getHijo2().getEdad()+"\nGenero: "+f1.getHijo2().getSexo());
            }else{
                System.out.println("Familia inexistente");
            }
            break;
            case(3):
            System.out.println("Ingrese apellido de la familia: ");
            apellido=lectura.next();
            f1=familias.get(apellido);
            if(f1!=null){
            System.out.println("Ingrese nombre del integrante que desea ubicar: ");
            String nombre=lectura.next();
            if(f1.getPadre().getNombre().equals(nombre)){
            System.out.println("Integrante solicitado: \nNombre: "+f1.getPadre().getNombre()+"\nEdad:"+f1.getPadre().getEdad());
            System.out.println("Esposa: \nNombre: "+f1.getMadre().getNombre()+"\nEdad:"+f1.getMadre().getEdad());
            System.out.println("Hijo 1: \nNombre: "+f1.getHijo1().getNombre()+"\nEdad:"+f1.getHijo1().getEdad()+"\nGenero: "+f1.getHijo1().getSexo());
            System.out.println("Hijo 2: \nNombre: "+f1.getHijo2().getNombre()+"\nEdad:"+f1.getHijo2().getEdad()+"\nGenero: "+f1.getHijo2().getSexo());
            }else{
                if(f1.getMadre().getNombre().equals(nombre)){
                 System.out.println("Integrante solicitado: \nNombre: "+f1.getMadre().getNombre()+"\nEdad:"+f1.getMadre().getEdad());
                 System.out.println("Esposo: \nNombre: "+f1.getPadre().getNombre()+"\nEdad:"+f1.getPadre().getEdad());
                 System.out.println("Hijo 1: \nNombre: "+f1.getHijo1().getNombre()+"\nEdad:"+f1.getHijo1().getEdad()+"\nGenero: "+f1.getHijo1().getSexo());
                 System.out.println("Hijo 2: \nNombre: "+f1.getHijo2().getNombre()+"\nEdad:"+f1.getHijo2().getEdad()+"\nGenero: "+f1.getHijo2().getSexo());   
                }else{
                  if(f1.getHijo1().getNombre().equals(nombre)){
                 System.out.println("Integrante solicitado: \nNombre: "+f1.getHijo1().getNombre()+"\nEdad:"+f1.getHijo1().getEdad()+"\nGenero: "+f1.getHijo1().getSexo());     
                 System.out.println("Madre: \nNombre: "+f1.getMadre().getNombre()+"\nEdad:"+f1.getMadre().getEdad());
                 System.out.println("Padre: \nNombre: "+f1.getPadre().getNombre()+"\nEdad:"+f1.getPadre().getEdad());
                 System.out.println("Hermano(a): \nNombre: "+f1.getHijo2().getNombre()+"\nEdad:"+f1.getHijo2().getEdad()+"\nGenero: "+f1.getHijo2().getSexo());   
                }else{
                     if(f1.getHijo2().getNombre().equals(nombre)){
                 System.out.println("Integrante Solicitado: \nNombre: "+f1.getHijo2().getNombre()+"\nEdad:"+f1.getHijo2().getEdad()+"\nGenero: "+f1.getHijo2().getSexo());
                 System.out.println("Madre: \nNombre: "+f1.getMadre().getNombre()+"\nEdad:"+f1.getMadre().getEdad());
                 System.out.println("Padre: \nNombre: "+f1.getPadre().getNombre()+"\nEdad:"+f1.getPadre().getEdad());
                 System.out.println("Hermano(a): \nNombre: "+f1.getHijo1().getNombre()+"\nEdad:"+f1.getHijo1().getEdad()+"\nGenero: "+f1.getHijo1().getSexo());   
                } 
                  else{
                          System.out.println("Integrante Inexistente");
                          } 
                }
                }}}else{
                System.out.println("Familia inexistente");
            }    
                
            break;
        }
        }while (eleccion!=0);
    }
    
}
