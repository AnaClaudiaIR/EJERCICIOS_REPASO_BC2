public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String saludar(){
        return "Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.";
    }
}
