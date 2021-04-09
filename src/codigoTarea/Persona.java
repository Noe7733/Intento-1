package codigoTarea;

import java.util.Scanner;

//esta es la clase de la cual se hace la herencia(y se hace uso del extends) hacia la clase Alumno y Maestro 
public class Persona {

    //atributos
    Scanner ent = new Scanner(System.in);//sccaner aqui,para que las clases derivadas igual tengan un scanner y así evitar crear un scanner en cada clase
    String nombre, apellido, direccion, telefono;
    int edad;

    //constructor de una persona, el cual recibe 5 parametros
    public Persona(String nombre, String apellido, String direccion, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    //SOBREESCRITURA... En esta clase se crea un metodo llamado pensar, el cual es la forma general en la que piensa una persona(sin importar la profesión o oficio, 
    //si es hombre o mujer), este metodo se heredará a Alumno y Maestro, los cuales ya se especifican la ocupación y es ahí donde se sobrecarga el metodo 
    //base, pensar(), es ahí donde ocurre la magia...
    //metodo pensar, con el cual se hace la sobreescritura con la herencia hacia las demas clases
    public void pensar() {
        System.out.println("Soy una persona y pienso en mis actividades del trabajo y del hogar"); //forma de pensar de una persona
    }

}