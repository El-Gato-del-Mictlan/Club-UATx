import java.util.Scanner;

public class MainComputadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computadora computadora = new Computadora();

        System.out.println("Ingresa la Marca: ");
        computadora.setMarca(scanner.nextLine());

        System.out.println("Ingresa el modelo: ");
        computadora.setModelo(scanner.nextLine());

        System.out.println("Ingresa el procesador: ");
        computadora.setProcesador(scanner.nextLine());

        System.out.println("Ingresa la cantidad de RAM: ");
        computadora.setRam(scanner.nextInt());

        System.out.println("Ingresa la cantidad de almacenamiento: ");
        computadora.setAlmacenamiento(scanner.nextInt());

        System.out.println(computadora.toString());
    }
}
