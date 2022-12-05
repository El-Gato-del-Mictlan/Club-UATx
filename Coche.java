public class Coche {
    private String marca, modelo, color;
    private int nPuertas, kilometraje;

    public Coche(String marca, String modelo, String color, int nPuertas, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.nPuertas = nPuertas;
        this.kilometraje = kilometraje;
    }

    //Getter y Setter
    /*public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getnPuertas(){
        return nPuertas;
    }

    public void setnPuertas(int nPuertas){
        this.nPuertas = nPuertas;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }*/

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString(){
        return marca + " " + modelo + ", color: " + color + ", con kilometraje: " + kilometraje + "km.";
    }

}