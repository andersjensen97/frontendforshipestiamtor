
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomnessTest {

    public static void main(String[] args) throws IOException {
        int[] rolls = new int[6];
        Random random = new Random();

        for (int i = 0; i < 9999999; i++) {
            int roll = random.nextInt(6) + 1;
            rolls[roll - 1]++;
        }

        FileWriter writer = new FileWriter("RandomnessTestResults.csv");

        for (int i = 0; i < rolls.length; i++) {
            writer.write("Die " + (i + 1) + ": " + rolls[i] + "\n");
        }

        writer.close();
        
        System.out.println("Results of randomness tests:");
        for (int i = 0; i < rolls.length; i++) {
            System.out.println("Die " + (i + 1) + ": " + rolls[i]);
        }

    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        animal.makeSound();  // Dynamic binding, calls Dog's makeSound at runtime
    }
}
