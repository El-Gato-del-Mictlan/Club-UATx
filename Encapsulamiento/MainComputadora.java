import java.util.Scanner;

public class MainComputadora {
    public static void main(String[] args) {
        //Se instancia un scanner para poder leer datos por teclado.
        Scanner scanner = new Scanner(System.in);
        
        //Se instancia un objeto de tipo computadora haciendo uso del constructor vacío. 
        Computadora computadora = new Computadora();

        System.out.println("Ingresa la Marca: "); //Solicitamos la marca
        //Por medio de nuestro objeto accedemos al método setMarca y le pasamos lo que ingrese el usuario por medio del scanner.
        computadora.setMarca(scanner.nextLine()); 

        System.out.println("Ingresa el modelo: "); //Solicitamos el modelo
        //Por medio de nuestro objeto accedemos al método setModelo y le pasamos lo que ingrese el usuario por medio del scanner.
        computadora.setModelo(scanner.nextLine());  

        System.out.println("Ingresa el procesador: "); //Solicitamos el procesador
        //Por medio de nuestro objeto accedemos al método setProcesador y le pasamos lo que ingrese el usuario por medio del scanner.
        computadora.setProcesador(scanner.nextLine());

        System.out.println("Ingresa la cantidad de RAM: "); //Solicitamos la cantidad de RAM
        //Por medio de nuestro objeto accedemos al método setRAM y le pasamos lo que ingrese el usuario por medio del scanner.
        computadora.setRam(scanner.nextInt());

        System.out.println("Ingresa la cantidad de almacenamiento: "); //Solicitamos la cantidad de ROM
        //Por medio de nuestro objeto accedemos al método setAlmacenamiento y le pasamos lo que ingrese el usuario por medio del scanner.
        computadora.setAlmacenamiento(scanner.nextInt());
        
        //Imprimimos los datos de nuestro objeto con ayuda del método toString
        System.out.println(computadora.toString());
    }
}
