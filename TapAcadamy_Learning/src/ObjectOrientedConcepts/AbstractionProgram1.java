package ObjectOrientedConcepts;

abstract class Bird{
	abstract void fly();
	abstract void eat();
}

abstract class Eagle extends Bird{

	@Override
	void fly() {
		System.out.println("Eagle is flying at the higher heights");
	}
	
}

class SerpentEagle extends Eagle{

	@Override
	void eat() {
		System.out.println("Serpent Eagle hunts over mountains an eats");
	}
	
}

class GoldenEagle extends Eagle{

	@Override
	void eat() {
		System.out.println("Golden Eagle hunts over oceans an eats");
	}
	
}

class Routine{
	static void works(Bird ref) {
		ref.fly();
		ref.eat();
	}
}

public class AbstractionProgram1 {
	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		
		Routine.works(se);
		Routine.works(ge);
		
	}
}
