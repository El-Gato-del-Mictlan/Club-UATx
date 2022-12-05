import java.util.ArrayList;
import java.util.Scanner;

public class MainPlantel {

    static ArrayList<Plantel> CuerpoTecnico = new ArrayList();
    static ArrayList<Jugador> equipo = new ArrayList();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ingresarEquipo();
        mostarDT();
        mostrarJugadores();
    }

    public static void ingresarEquipo(){
        int tipo;
        boolean dtAsignado = false;

        do {

            do {
                System.out.println("1-> Asignar DT  2->Fichar Jugador 0->Fin");
                tipo = sc.nextInt();
            }while (tipo < 0 || tipo > 2);

            if (tipo != 0){
                switch (tipo){
                    case 1:
                        if (dtAsignado == true)
                            System.out.println("Ya asignaste un DT");
                        else {
                            ingresarTecnico();
                            dtAsignado = true;
                        }
                        break;
                    case 2:
                        ingresarJugadores();
                        break;
                }
            }
        }while (tipo != 0);
    }

    public static void ingresarTecnico(){
        String nombre, apellido, cargo;
        int edad;

        sc.nextLine();
        System.out.println("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el apelllido: ");
        apellido = sc.nextLine();
        System.out.println("Ingresa el cargo: ");
        cargo = sc.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();

        Plantel staff = new Plantel(nombre,apellido,cargo,edad);
        CuerpoTecnico.add(staff);
    }

    public static void ingresarJugadores(){
        String nombre, apellido, posicion;
        int edad, num;

        sc.nextLine();
        System.out.println("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el apelllido: ");
        apellido = sc.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa la posición: ");
        posicion = sc.nextLine();
        System.out.println("Ingresa el número: ");
        num = sc.nextInt();

        Jugador jugador = new Jugador(nombre,apellido,edad,posicion,num);
        equipo.add(jugador);
    }

    public static void mostarDT(){
        for (Plantel d:CuerpoTecnico){
            System.out.println(d.toString());
        }
    }

    public static void mostrarJugadores(){
        for (Jugador j:equipo){
            System.out.println(j.toString());
        }
    }
}
