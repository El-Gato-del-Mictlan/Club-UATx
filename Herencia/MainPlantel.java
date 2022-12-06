//Importamos las librerías necesarias 
import java.util.ArrayList;
import java.util.Scanner;

public class MainPlantel {
    
    //Al declarar objetos fuera del main estos deben ser estáticos. 
    //Usamos ArrayList porque no vamos a definirle un tamaño fijo a nuestro array. 
    static ArrayList<Plantel> CuerpoTecnico = new ArrayList(); //Para Plantel
    static ArrayList<Jugador> equipo = new ArrayList(); //Para Jugadores

    static Scanner sc = new Scanner(System.in); //Declaración de Scanner
    
    public static void main(String[] args) {
        ingresarEquipo(); //Metódo para ingresar algún jugador o directivo. 
        mostarDT(); //Método para mostrar a la directiva.
        mostrarJugadores(); //Método para mostrar jugadores.
    }
    
    //Metódo para ingresar algún jugador o directivo. 
    public static void ingresarEquipo(){
        int tipo; //Auxiliar para definir que se va a ingresar (directivo o jugador)
        boolean dtAsignado = false; //Bandera para saber si el DT ya fue asignado. 
        
        //Ciclos para llenado de datos
        do {

            do {
                System.out.println("1-> Asignar DT  2->Fichar Jugador 0->Fin"); //Solicitamos la opción a realizar
                tipo = sc.nextInt(); //Se lee la opción
            }while (tipo < 0 || tipo > 2); //Se hace la comparación para ver que sea un valor valido

            if (tipo != 0){ //Si se seleccionó una opción valida ingresará a la sentencia
                switch (tipo){ //Se compara la variable para asignarle un caso
                    case 1: //Asignar DT
                        if (dtAsignado == true) //Se compara si es que ya se asigno un director técnico
                            System.out.println("Ya asignaste un DT"); //Mensaje de que ya fue asignado
                        else {
                            ingresarTecnico(); //Se llama al metodo para llenar los datos correspondientes
                            dtAsignado = true; //Se cambia la bandera a verdadero 
                        }
                        break; //break para que se detenga en switch
                    case 2:
                        ingresarJugadores(); //Se llama al metodo para llenar los datos correspondientes
                        break; //break para que se detenga en switch
                }
            }
        }while (tipo != 0); //Se compara que no se haya solicitado fin del programa
    }
    
    //Método para ingresar a la directiva  
    public static void ingresarTecnico(){
        //Declaración de variables auxiliares para llenar los datos 
        String nombre, apellido, cargo;
        int edad;

        sc.nextLine(); //Se limpia el scanner para evitar errores
        
        //Solicitud de datos
        System.out.println("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el apelllido: ");
        apellido = sc.nextLine();
        System.out.println("Ingresa el cargo: ");
        cargo = sc.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();
        
        //Se crea un objeto de tipo plantrel y le pasamos como argumentos lo que está en nuestras variables auxiliares.
        Plantel staff = new Plantel(nombre,apellido,cargo,edad);
        //Añadimos el objeto staff a nuestra ArrayList correspondiente 
        CuerpoTecnico.add(staff);
    }
    
    //Método para ingresar a los jugadores  
    public static void ingresarJugadores(){
        //Declaración de variables auxiliares para llenar los datos 
        String nombre, apellido, posicion;
        int edad, num;

        sc.nextLine(); //Se limpia el scanner para evitar errores
        
        //Solicitud de datos
        System.out.println("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el apelllido: ");
        apellido = sc.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();
        
        sc.nextLine(); //Se limpia el scanner para evitar errores
        
        System.out.println("Ingresa la posición: ");
        posicion = sc.nextLine();
        System.out.println("Ingresa el número: ");
        num = sc.nextInt();
        
        //Se crea un objeto de tipo jugador y le pasamos como argumentos lo que está en nuestras variables auxiliares.
        Jugador jugador = new Jugador(nombre,apellido,edad,posicion,num);
        //Añadimos el objeto equipo a nuestra ArrayList correspondiente 
        equipo.add(jugador);
    }
    
    //Método para mostrar a la directiva.
    public static void mostarDT(){
        //Recorremos el ArrayList con ayuda de un Forech
        for (Plantel d:CuerpoTecnico){
            //La variable d es la que va a recorrer nuestro Array e imprimimos los datos con ayuda del método toString
            System.out.println(d.toString());
        }
    }
    
    //Método para mostrar jugadores.
    public static void mostrarJugadores(){
        //Recorremos el ArrayList con ayuda de un Forech
        for (Jugador j:equipo){
            //La variable j es la que va a recorrer nuestro Array e imprimimos los datos con ayuda del método toString
            System.out.println(j.toString());
        }
    }
}
