package Alumno;

import java.util.Scanner;

//Ejemplo de Constructores

public class Alumno {
    Scanner sc = new Scanner(System.in);
    
    //Atributos
    
    String Nombre;
    int Grado;
    char Grupo;
    String Matrícula;
    Double Promedio;

    //Constructor vacio.
    public Alumno() {
        Nombre = "Pepito";
        Grado = 3;
        Grupo = 'A';
        Matrícula = "ASASDASF";
        Promedio = 8.7;
    }
    
    //Constructor 2.
    public Alumno(String a, int b) {
        Nombre = a;
        Grado = b;
        
        Grupo = 'A';
        Matrícula = "ASASDASF";
        Promedio = 8.7;
    }   
    
    //Contructor 3.
    public Alumno(String Nombre, int Grado, char Grupo, String Matrícula, Double Promedio) {
        this.Nombre = Nombre;
        
        this.Grado = Grado;
        this.Grupo = Grupo;
        this.Matrícula = Matrícula;
        this.Promedio = Promedio;
    }
    
    //Métodos
    
    public void PedirDatos() {
        System.out.print("Ingrese su Nombre: ");
        Nombre = sc.nextLine();
        System.out.print("Ingrese su Grado: ");
        Grado = sc.nextInt();
        System.out.print("Ingrese su Grupo: ");
        sc.nextLine();
        Grupo = sc.nextLine().charAt(0);
        System.out.print("Ingrese su Matrícula: ");
        Matrícula = sc.nextLine();
    }
    
    public void PedirCalificaciones(){
        double a,b,c,d,e;
        
        System.out.print("Ingrese la primera califiacion: ");
        a = sc.nextInt();
        System.out.print("Ingrese la segunda califiacion: ");
        b = sc.nextInt();
        System.out.print("Ingrese la tercera califiacion: ");
        c = sc.nextInt();
        System.out.print("Ingrese la cuarta califiacion: ");
        d = sc.nextInt();
        System.out.print("Ingrese la quinta califiacion: ");
        e = sc.nextInt();
        
        Promedio = (a+b+c+d+e)/5;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: " + Nombre);        
        System.out.println("Grado: " + Grado);        
        System.out.println("Grupo: " + Grupo);                
        System.out.println("Matrícula: " + Matrícula);        
        System.out.printf("Promedio: %.2f",Promedio);
        System.out.println("\n");
    }

}
