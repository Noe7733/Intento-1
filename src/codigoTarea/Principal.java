package codigoTarea;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {//firma del metodo main 
        int x, opc; //variables a usar 
        Scanner entrada = new Scanner(System.in);
        int a;
        //3 objetos y cada objeto es un alumno
        //a los objetos se les instancia con el constructor de Alumno que recibe 5 parametros
        Alumno alum1 = new Alumno("B200100", "Noe", "Guillen", "Los coquitos", "9621006472", 18);
        Alumno alum2 = new Alumno("B545122", "Eduardo", "Orozco", "Indeco", "9624568975", 18);
        Alumno alum3 = new Alumno("B785100", "Erick", "Ortiz", "CDMX", "96145210356", 18);

//.............................................................................................................
        //3 objetos y cada objeto es un maestro
        //a los objetos se les instancia con el constructor de Maestro que recibe 5 parametros
        Maestro prof1 = new Maestro("DFCDHF", "Leonardo", "Aguilar", "La cañada", "962456585", 37);
        Maestro prof2 = new Maestro("DERTGB", "Todoroki", "Shoto", "UA", "3551561695", 20);
        Maestro prof3 = new Maestro("DPLOIM", "All", "Migth", "UA", "254321522", 40);

        do {//inicio del do while
            System.out.println("*****\t MENU PRINCIPAL \t*****");
            System.out.println("1) Ingresar alumnos " + " 2) Ingresar maestros " + "3) Implementación de sobrecarga " + "4) Implementación de sobreescritura " + "5) Datos iniciales " + "6) Salir ");
            System.out.println("Opción elegida: ");
            opc = entrada.nextInt();

            switch (opc) {//inicio del switch
                case 1:
                    //llamada al metodo llenarDatos
                    alum1.llenarDatos();
                    alum2.llenarDatos();
                    alum3.llenarDatos();
                break;

                case 2:

                    //llamada al metodo llenarDatos
                    prof1.llenarDatos();
                    prof2.llenarDatos();
                    prof3.llenarDatos();
                break;

                case 3:
                    //sistema de pago prof1
                    System.out.println("TIPOS DE CONTRATO:\t 1) SEMANAL, 2) QUINCENAL, 3)MENSUAL\n");
                    System.out.println("El maestro " + prof1.nombre + ", ¿Que tipo de contrato tiene?");
                    x = entrada.nextInt();
                    switch (x) {
                        case 1:
                            prof1.sueldo(100D); //llamada al metodo sueldo pero que recibe un double
                            break;
                        case 2:
                            prof1.sueldo(100);
                            break;
                        case 3:
                            prof1.sueldo(100f);
                        break;
                    }

                    //sistema de pago prof2
                    System.out.println("TIPOS DE CONTRATO:\t 1) SEMANA, 2) QUINCENAL, 3)MENSUAL\n");
                    System.out.println("El maestro " + prof2.nombre + ", ¿Que tipo de contrato tiene?");
                    x = entrada.nextInt();
                    switch (x) {
                        case 1:
                            prof1.sueldo(100D);
                            break;
                        case 2:
                            prof1.sueldo(100);
                            break;
                        case 3:
                            prof1.sueldo(100f);
                        break;
                    }

                    //sistema de pago prof3
                    System.out.println("TIPOS DE CONTRATO:\t 1) SEMANA, 2) QUINCENAL, 3)MENSUAL\n");
                    System.out.println("El maestro " + prof3.nombre + ", ¿Que tipo de contrato tiene?");
                    x = entrada.nextInt();
                    switch (x) {
                        case 1:
                            prof1.sueldo(100D);
                            break;
                        case 2:
                            prof1.sueldo(100);
                            break;
                        case 3:
                            prof1.sueldo(100f);
                        break;
                    }//fin switch de prof3
                break;//break del case 3

                case 4:
                    int opc2;//variable creada para el switch
                    do {//inicio del do while
                        System.out.println("IMPLEMENTACIÓN DE LA SOBREESCRITURA...");
                        System.out.println("\n");
                        System.out.println("Deseas ver la forma de pensar de un(a):\n 1)Persona \n 2)Alumno \n 3)Maestro \n 4)Salir");
                        System.out.println("\n");
                        opc2 = entrada.nextInt();//lectura de datos desde teclado 
                        switch (opc2) {//inicio del switch de opc2
                            case 1:
                                System.out.println("\n");
                                Persona persona = new Persona("Eleazar", "gomez", "montenegro", "9624567810", 39);//objeto creado para mostrar el metodo
                                //pensar de una persona 
                                System.out.print("Forma de pensar de una persona: ");
                                persona.pensar();
                                System.out.println("\n");
                            break;

                            case 2:
                                System.out.println("\n");
                                System.out.print("Forma de pensar de un alumno: ");
                                alum1.pensar(); //llamada al metodo pensar de un alumno, utilizando un objeto anteriormente creado
                                System.out.println("\n");
                            break;

                            case 3:
                                System.out.println("\n");
                                System.out.print("Forma de pensar de un maestro: ");
                                prof1.pensar();//llamada al metodo pensar de un maestro, utilizando un objeto anteriormente creado
                                System.out.println("\n");
                            break;
                        }//fin de switch de opc2        
                    } while (opc2 != 4);//fin de do while
                break;

                case 5:
                    //muestra de datos de alumnos y maestros
                    System.out.println("\n");
                    System.out.println("\tALUMNOS...\n");
                    alum1.mostrarDatos();
                    System.out.println("\n");
                    alum2.mostrarDatos();
                    System.out.println("\n");
                    alum3.mostrarDatos();
                    System.out.println("\n");
                    System.out.println("\tMAESTROS...\n");
                    prof1.mostrarDatos();
                    System.out.println("\n");
                    prof2.mostrarDatos();
                    System.out.println("\n");
                    prof3.mostrarDatos();
                    System.out.println("\n");
                break;

                case 6:
                    System.out.println("Good byeee...\n");
                    System.out.println("Gracias por usar nuestro sistema:)\n");//mensajes de despedida 
                break;

                default:
                    System.out.println("\n");
                    System.out.println("Seleccionar una opción de las anteriores, de favor\n");
                break;
            } //fin del switch
        } while (opc != 6); //fin dle do while
        //mientras opc sea diferente a 6, se repetirá indefinidas veces, cuando sea 6, saldrá de la ejecución

        //CORCHETES DE LA CLASE Y EL MAIN
    }
}
/*
[x] = listo...
tarea:
alta de 3 alumnos[x]
alta de tres maestros[x]
sobrecarga en maestros[x]
sobreescritura en ambas clases[x]
muestra de datos[x]*/
