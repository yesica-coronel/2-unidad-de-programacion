
    // Clase abstracta 'Vehicle' para demostrar abstracción
public abstract class Vehicle {
    // Atributos comunes para todos los vehículos
    int wheels;
    String fuelType;

    // Método abstracto: debe ser implementado por las clases derivadas
    public abstract void startEngine();
}

// Clase 'Car' que extiende la clase abstracta 'Vehicle'
public class vehicle extends Vehicle {
    public vehicle() {
        this.wheels = 4;
        this.fuelType = "Gasoline";
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");
    }
}

// Clase Principal para ejecutar el código
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase 'Car'
        vehicle myCar = new vehicle();
        System.out.println("The car has " + myCar.wheels + " wheels.");
        myCar.startEngine();
    }
}


