package codigoTarea;

//el extends es la palabra reservada que indica al compilador que la clase Alumno es una clase derivada de Persona, la cual es la clase base 
public class Alumno extends Persona {
    
    //atributo de la clase 
    String matricula;
    
    //constructor de alumno que recibe 5 parametros 
    public Alumno(String matricula, String nombre, String apellido, String direccion, String telefono, int edad) {
        super(nombre, apellido, direccion, telefono, edad);
        this.matricula = matricula;
    }

    //metodo con el cual se llenan los datos de los alumnos
    public void llenarDatos() {
        System.out.println("Cual es la matricula del alumno?");
        matricula = ent.next();
        System.out.println("Cual es el nombre del alumno?");
        nombre = ent.next();
        System.out.println("Cual es el apellido del alumno?");
        apellido = ent.next();
        System.out.println("Cual es la direccion del alumno?");
        direccion = ent.next();
        System.out.println("Cual es el telefono del alumno?");
        telefono = ent.next();
        System.out.println("Cual es la edad del alumno?");
        edad = ent.nextInt();
        System.out.println("\n");
    }


    //metodo en el cual se muestran los datos de los alumnos 
    public void mostrarDatos() {
        System.out.println("Matricula: " + matricula
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDireccion: " + direccion
                + "\nTelefono: " + telefono
                + "\nEdad: " + edad);
    }

    //sobreescritura
    //@Override es la anotación para decirle al compilador que se debe de hacer la sobreescritura del metodo a continuación...
    @Override
    public void pensar() {
        System.out.println("Soy un alumno y pienso en las tareas y en los promedios de las materias"); //forma de pensar de un alumno
    }
}