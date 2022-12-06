public class Jugador extends Plantel{ //Para indicar que es una clase hija usamos “extends” seguido del nombre de la clase padre
    
    //Declaramos los atributos de nuestra clase
    private String posicion;
    private int numero;
    
    //Generamos el constructor para inicializar los atributos de nuestra clase.
    public Jugador(String nombre, String apellido, int edad, String posicion, int numero) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.numero = numero;
    }
    
    //Getter y Setter
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Sobrescribimos el método toString para mostrar los atributos de nuestro objeto. 
    @Override
    public String toString(){
        return "\nJugador: " + nombre + " " + apellido + "\nNúmero: " + numero + "\nPosición: " + posicion +
                "\nEdad: " + edad + " años";
    }

}
