public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(20);
        persona1.setNombre("Carles");
        persona1.setTelefono(653435691);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}


class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    //Edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Telefono

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}