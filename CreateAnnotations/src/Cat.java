@VeryImportant
public class Cat {
	
	
	@ImportantString
	String name;
	
	
	public Cat(String name) {
		this.name = name;
	}
	
	@RunImmediately(times = 3)
	public void Miaow() {
		System.out.println("Meow");
	}
	
	
	public void Eat() {
		System.out.println("Munch");
	}
	

}
