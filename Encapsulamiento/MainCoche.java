public class Main {
    public static void main(String[] args) {
        //Creación de un objeto de tipo coche.
        Coche coche1 = new Coche("Mitsubishi","Evolution","Morado",5,75000);
        
        System.out.println(coche1.getColor()); //Imprimimos el color de nuestro coche1.
        System.out.println(coche1.toString()); //Con ayuda del método toString imprimimos los atributos de nuestro objeto.

        coche1.setMarca("Subaru"); //Asignamos una nueva marca
        coche1.setModelo("WRX"); //Asignamos un nuevo módelo
        coche1.setColor("Azul"); //Asignamos un nuevo color
        coche1.setnPuertas(3);  //Asignamos un nuevo número de puertas
        coche1.setKilometraje(45000); //Asignamos un nuevo kilometraje. 
        System.out.println(coche1.toString()); //Con ayuda del método toString imprimimos los atributos de nuestro objeto.
        
        
        //Accediendo a los atributos de nuestro objeto sin hacer uso del principio de encapsulamiento. 
        /*Coche coche1 = new Coche();
        coche1.marca = "Mitsubishi";
        coche1.modelo = "Evolution";
        coche1.color = "Morado";
        coche1.nPuertas = 5;
        coche1.kilometraje = 75000;

        System.out.println(coche1.marca + " " + coche1.modelo + " " + coche1.color + " con " + coche1.kilometraje +
                "km");*/
    }
}
