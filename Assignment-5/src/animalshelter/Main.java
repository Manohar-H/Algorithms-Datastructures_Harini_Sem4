package src.animalshelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Misty"));
        shelter.enqueue(new Dog("Rocky"));
        shelter.enqueue(new Cat("Whiskers"));

        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName()); // Buddy
        System.out.println("Dequeue Dog: " + shelter.dequeueDog().getName()); // Rocky
        System.out.println("Dequeue Cat: " + shelter.dequeueCat().getName()); // Misty
        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName()); // Whiskers
    }
}