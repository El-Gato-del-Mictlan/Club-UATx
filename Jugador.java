public class Jugador extends Plantel{
    private String posicion;
    private int numero;

    public Jugador(String nombre, String apellido, int edad, String posicion, int numero) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.numero = numero;
    }

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

    @Override
    public String toString(){
        return "\nJugador: " + nombre + " " + apellido + "\nNúmero: " + numero + "\nPosición: " + posicion +
                "\nEdad: " + edad + " años";
    }

}
