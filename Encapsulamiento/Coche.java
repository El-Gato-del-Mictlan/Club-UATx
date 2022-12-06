public class Coche {
    //Declaramos los atributos de nuestro objeto
    private String marca, modelo, color;
    private int nPuertas, kilometraje;
    
    //Generamos el constructor para inicializar los atributos de nuestra clase
    public Coche(String marca, String modelo, String color, int nPuertas, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.nPuertas = nPuertas;
        this.kilometraje = kilometraje;
    }
    
    //Getter y Setter
    
    /*
        Usamos el modificador de acceso public, seguido del tipo de dato e indicamos get para hacer referencia 
        a que queremos obtener el valor. Get es un método vacío así que no le pasamos ningún parámetro y dentro 
        de el solo retornamos el atributo.  
    */
    public String getMarca() {
        return marca;
    }
    /*
        Usamos el modificador de acceso public, seguido del tipo de dato e indicamos set para hacer referencia 
        a que inicializar el valor. Set es un método con parámetros así que no le pasamos el parámetro y dentro 
        hacemos la asignación usando la directiva this.
    */

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
    
    /*
        Sobrescribimos el método toString para adaptarlo a los atributos que queremos mostrar de nuestro objeto. 
        Es de tipo String así que nuestro método debe ser del mismo tipo, así como retornar una cadena de caracteres. 
    */
    @Override
    public String toString(){
        return marca + " " + modelo + ", color: " + color + ", con kilometraje: " + kilometraje + "km.";
    }

}
