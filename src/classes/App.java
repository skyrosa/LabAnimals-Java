package classes;

public class App {

	public static void main(String[] args) {
			
		
		System.out.println("------ Cat -------");
			Cat cat = new Cat();
			cat.jump();
			cat.lick();
			
		System.out.println("------ Cow -------");
			Cow cow = new Cow();
			cow.milk();
			cow.shit();
			
		System.out.println("------ Duck -------");
			Duck duck = new Duck();
			duck.fly();
			duck.swim();
			
		System.out.println("------ Bactery -------");
			Bactery bactery = new Bactery();
			bactery.kill();
			bactery.stay();
			
	}

}
