package mainexer;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Animal cat = new Cat(); // Meow
        Animal dog = new Dog(); // The animal emitted a sound
        Animal animal = new Animal(); // The animal emitted a sound

        cat.emitSound();
        dog.emitSound();
        animal.emitSound();

	}

}
