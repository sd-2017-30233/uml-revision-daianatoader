
public class Demo {
	public static void main(String[] args){
		try{
		PetFactory pf = new PetFactory();
		
		Pet firstPet = pf.buyPet(true, "Dog");
		firstPet.isHealthy();
		
		Pet secondPet = pf.buyPet(true, "Cat");
		secondPet.isHealthy();
		
		Pet thirdPet = pf.buyPet(false, "Cat");
		thirdPet.isHealthy();
		}catch(Exception e)
		{
			System.out.println("The animal is not healthy.");
		}
	}
}
