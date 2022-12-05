public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Mitsubishi","Evolution","Morado",5,75000);
        System.out.println(coche1.getColor());
        System.out.println(coche1.toString());

        coche1.setMarca("Subaru");
        coche1.setModelo("WRX");
        coche1.setColor("Azul");
        coche1.setnPuertas(3);
        coche1.setKilometraje(45000);
        System.out.println(coche1.toString());

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
