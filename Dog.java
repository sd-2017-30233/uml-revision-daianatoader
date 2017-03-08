
public class Dog implements Pet{
	private float age;
	private String race;
	public Dog(float age, String race){
		this.setAge(age);
		this.setRace(race);
	}
	public Dog() {
	}
	@Override
	public void isHealthy() {
		System.out.println("The dog is purchased.");
		
	}
	
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

}
