
import java.util.Scanner;

//Ejemplo de Atributos y Métodos

public class Persona {

    Scanner sc = new Scanner(System.in);
    
    //Atributos

    String Nombre;
    int Edad;
    String CURP;
    String Empleo;
    boolean Casado;
    
    //Métodos

    public void Trabajo() {
        System.out.println("Soy " + Nombre + " y mi trabajo es " + Empleo + "\n");
    }

    public void Caminar() {
        System.out.println("Soy " + Nombre + " y estoy caminando. \n");
    }

    public void PedirDatos() {
        System.out.print("Ingrese su Nombre:");
        Nombre = sc.nextLine();
        System.out.print("Ingrese su Edad:");
        Edad = sc.nextInt();
        System.out.print("Ingrese su CURP:");
        sc.nextLine();
        CURP = sc.nextLine();
        System.out.print("Ingrese su Empleo:");
        Empleo = sc.nextLine();
        System.out.print("Es casd@?:");
        Casado = sc.nextBoolean();
    }

    public void MostrarDatos() {
        System.out.println("\nNombre:" + Nombre);
        System.out.println("Edad:" + Edad);
        System.out.println("CURP:" + CURP);
        System.out.println("Empleo:" + Empleo);
        System.out.println("Es casd@?:" + Casado);
    }
}
