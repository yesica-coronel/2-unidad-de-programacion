
    // Clase Persona
class Persona {
    private int documento;
    private String nombre;
    private int edad;

    // Constructor
    public Persona(int documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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
        this.edad = edad;
    }
}

// Clase Paciente (hereda de Persona)
class Paciente extends Persona {
    private double peso;
    private double estatura;
    private double imc;

    // Constructor
    public Paciente(int documento, String nombre, int edad, double peso, double estatura) {
        super(documento, nombre, edad);
        this.peso = peso;
        this.estatura = estatura;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    // Método para calcular el IMC
    public void calIMC() {
        this.imc = peso / (estatura * estatura);
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un paciente
        Paciente paciente = new Paciente(12345, "Juan Pérez", 25, 70.5, 1.75);

        // Calcular el IMC
        paciente.calIMC();

        // Mostrar información del paciente
        System.out.println("Documento: " + paciente.getDocumento());
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Peso: " + paciente.getPeso() + " kg");
        System.out.println("Estatura: " + paciente.getEstatura() + " m");
        System.out.println("IMC: " + paciente.getImc());
    }
}


