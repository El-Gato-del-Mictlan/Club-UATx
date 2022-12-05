package Ejercicio1;

//Ejercicio 1: Constructores.

public class Cuenta {
    //Atributos
    
    String titular;
    double cantidad;
    
    //Constructores

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular) {
        this.titular = titular;        
    }
    
    //Métodos
    
    public void ingresar(double cantidad){
        if (cantidad < 0) {
            System.out.println("Error: Cantidad ingresada invalida.");
        }else{
            this.cantidad += cantidad;
        }        
    }
    
    public void retirar(double cantidad){
        this.cantidad -= cantidad;
        if (this.cantidad < 0){
            this.cantidad = 0;
        }       
    }
    
    public void mostrarDatos(){
        System.out.println("Titular: " + titular);
        System.out.printf("Fondos: $ %.2f", cantidad);
        System.out.println();
    }
    
}
