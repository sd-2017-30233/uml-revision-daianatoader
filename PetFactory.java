
public class PetFactory {
	public Pet buyPet(boolean healthy, String animal){
		if(healthy == false)
			return null;
		if(healthy == true && animal.equalsIgnoreCase("dog"))
			return new Dog();
		if(healthy == true && animal.equalsIgnoreCase("cat"))
			return new Cat();
		return null;
	}
}
