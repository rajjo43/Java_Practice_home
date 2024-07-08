package self_study;

abstract class Animal{
	Animal(){
		System.out.println("All Animals....");
	}
	abstract void sound();
}

class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Cat is mewing");
		
	}
	
}

public class Abstract_Class {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c = new Cat();
		d.sound(); c.sound();

	}

}
