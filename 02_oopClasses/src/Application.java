import javax.sound.midi.Soundbank;

import exercise.Clock;
import live.Barkable;
import live.Dog;

public class Application {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Bello");
		
		System.out.println(myDog.toString());
		
		myDog.bark();
		
		myDog.eat();
		
		System.out.println(myDog.toString());
		
		if (myDog instanceof Dog) {
			System.out.println("myDog is an instance of Dog");
		}
		if (myDog instanceof Object) {
			System.out.println("myDog is an instance of Object");
		}
		if (myDog instanceof Barkable) {
			System.out.println("myDog is an instance of Barkable");
		}
		
		
		Barkable barkable = new Dog("Hasso");
		barkable.bark();
		System.out.println(barkable);
		
		Dog hasso = (Dog) barkable;
		System.out.println(hasso);
		hasso.eat();
		
		
		Clock clock = new Clock();
		System.out.println(clock);
		clock.tick();
		
		clock = new Clock(13, 24);
		System.out.println(clock);
		clock.tick();
		System.out.println(clock);
		
		clock.setAlarm(2, 34);
		
		for (int i = 0; i < 1500; i++) {
			clock.tick();
			System.out.println(clock);
		}

	}

}
