public class Computadora {
    
    //Declaramos los atributos de nuestro objeto.
    private String marca, modelo, procesador;
    private int ram, almacenamiento;
    
    //Generamos el constructor para inicializar los atributos de nuestra clase.
    public Computadora(String marca, String modelo, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    
    //Creamos un constructor vacío para poder crear objetos sin la necesidad de pasarle algún argumento.
    public Computadora(){

    }
    
    //Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    //Sobrescribimos el método toString para adaptarlo a los atributos que queremos mostrar.
    @Override
    public String toString(){
        return marca + " " + modelo + " \nProcesador: " + procesador + "\nRAM " + ram + "GB,\nAlmacenamiento: " +
                almacenamiento + "\n";
    }
}
