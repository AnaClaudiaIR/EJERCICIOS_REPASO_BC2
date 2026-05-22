public class PersonaEjercicio7 {
    private String nombre;
    private int edad;

    public PersonaEjercicio7(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0){
            System.out.println("La edad no puede ser menor a 1.");
        } else {
            this.edad = edad;
        }
    }

    public String saludar(){
        return "Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.";
    }
}
