/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Animal {
    // Kelas Animal

    public void makeNoise() {
        System.out.println("Talk");
    }
}

// Kelas Dog yang mewarisi Animal
class Dog extends Animal {
    @Override
    public void makeNoise() { // Overriding method
        System.out.println("Bark");
    }
}

// Kelas Main untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Objek Animal
        Animal animal = new Animal();
        animal.makeNoise(); // Output: Talk
        
        // Objek Dog
        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark
        
        // Polimorfisme: Referensi Animal tetapi objek Dog
        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Output: Bark (Polimorfisme)
        
        // instanceof digunakan untuk pengecekan tipe
        if (animal instanceof Animal)
            System.out.println("animal is Animal"); // Akan dieksekusi
        
        if (dog instanceof Animal)
            System.out.println("dog is Animal"); // Akan dieksekusi
        
        if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal"); // Akan dieksekusi
        
        if (animal instanceof Dog)
            System.out.println("animal is Dog"); // Tidak akan dieksekusi (animal bukan objek Dog)
    }
}

    

