public class Plantel {
    
    //Declaramos los atributos de nuestra clase 
    //Usamos protected para que la clase hija pueda acceder a los atributos de la clase padre sin la necesidad de usar Get o Set.
    protected String nombre, apellido, cargo;
    protected int edad;
    
    //Generamos el constructor para inicializar los atributos de nuestra clase.
    public Plantel(String nombre, String apellido, String cargo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
    }
    
    //Generamos el constructor para crear objetos de la clase hija (jugador), es uno nuevo porque no le pasamos un atributo.
    public Plantel(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    @Override
    public String toString(){
        return "\nCuerpo técnico: \nCargo: " + cargo + "\n" + nombre + " " + apellido + "\nEdad: " + edad + " años";
    }
}
