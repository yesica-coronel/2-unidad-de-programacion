
    // Clase base 'Animal'
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

// Clase derivada 'Dog' que extiende 'Animal'
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

// Clase Principal para ejecutar el código
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Llamada a métodos de la clase base y derivada
        genericAnimal.makeSound();
        myDog.makeSound();
    }
}


