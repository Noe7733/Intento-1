package codigoTarea;

//el extends es la palabra reservada que indica al compilador que la clase Maestro es una clase derivada de Persona, la cual es la clase base
public class Maestro extends Persona {

    //ATRIBUTOS DE LA CLASE 
    double cant, cant2, cant3, res;
    String noPlaza;
    Double pagoS;
    int pagoQ;
    float pagoM;

    //CONSTRUCTOR
    public Maestro(String noPlaza, String nombre, String apellido, String direccion, String telefono, int edad) {
        super(nombre, apellido, direccion, telefono, edad);
        this.noPlaza = noPlaza;
    }
    
    //metodo con el cual se llenan los datos de los maestros 
    public void llenarDatos() {
        System.out.println("\n");
        System.out.println("Cual es la plaza del maestro?");
        noPlaza = ent.next();
        System.out.println("Cual es el nombre del maestro?");
        nombre = ent.next();
        System.out.println("Cual es el apellido del maestro?");
        apellido = ent.next();
        System.out.println("Cual es la direccion del maestro?");
        direccion = ent.next();
        System.out.println("Cual es el telefono del maestro?");
        telefono = ent.next();
        System.out.println("Cual es la edad del maestro?");
        edad = ent.nextInt();
        System.out.println("\n");
    }

    //AQUI SE MUESTRAN LOS DATOS DE LOS MAESTROS 
    public void mostrarDatos() {
        System.out.println("Matricula: " + noPlaza
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDireccion: " + direccion
                + "\nTelefono: " + telefono
                + "\nEdad: " + edad);
    }
    //SOBRECARGA DE METODOS... en esta parte hice la sobrecaga de tres metodos sueldo, la sobrecarga a como lo entiendo es el poder tener 
    //mas de un metodo con el mismo nombre, pero si tenemos metodos con los mismos nombres, marca error, ahí es donde entra la sobrecarga, 
    //se debe de tener los metodos iguales, pero deben de recibir diferentes parametros, eso es la sobrecarga, Java en la sobrecarga no diferencia 
    //entre los tipos de retorno, es decir, void, int, etc...
    //se hace la diferencia por medio de la cantidad de parametros y los diferentes tipos de datos, inclusive, los identificadores pueden ser los mismos
    //pero debe de cambiar el tipo de dato.

    //sueldo con pago semanal
    public void sueldo(Double pagoS) {
        System.out.println("Cuantos dias trabajó el maestro?");
        cant = ent.nextInt();
        res = cant * pagoS;
        System.out.println("El respectivo pago es de: " + res);
    }

    //sueldo con pago quincenal
    public void sueldo(int pagoQ) {
        System.out.println("Cuantas quincenas trabajó el maestro?");
        cant = ent.nextInt();
        System.out.println("Cuantas horas trabajó?");
        cant2 = ent.nextInt();
        res = (cant2 * cant) * pagoQ;
        System.out.println("el pago correspondiente es de: " + res);
    }

    //sueldo con pago mensual
    public void sueldo(float pagoM) {
        System.out.println("Cuantas horas trabajó el maestro?");
        cant = ent.nextInt();
        System.out.println("cuantos meses trabajó?");
        cant2 = ent.nextInt();
        System.out.println("de cuanto es la cuota de permanencia?");
        cant3 = ent.nextInt();
        res = ((cant * cant2) * pagoM) - cant3;
        System.out.println("el pago correspondiente es de: " + res);
    }

    //sobreescritura
    //@Override es la anotación para decirle al compilador que se debe de hacer la sobreescritura del metodo a continuación...
    @Override
    public void pensar() {
        System.out.println("Soy un maestro y pienso en fechas de hacer examenes, en las tareas por dejar y cuando cobraré"); //forma en  la que piensa un maestro
    }
}
