class AnimalSounds {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        while (scanner.hasNextLine()) {
            var Animal = scanner.next();

        switch (Animal) {
            case "Dog" -> System.out.println("Woof");
            case "Cat" -> System.out.println("Meow");
            case "Sheep" -> System.out.println("Baa");
            case "Cow" -> System.out.println("Moo");
            case "Lion" -> System.out.println("Roar");
            case "Pig" -> System.out.println("Oink");
            case "Duck" -> System.out.println("Quack");
            default -> System.out.println("?");
        }
    }
        scanner.close();
    }
}
