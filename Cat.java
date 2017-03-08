
public class Cat implements Pet{
	private float age;
	private String race;

	public Cat(float age, String race){
		this.setAge(age);
		this.setRace(race);
	}
	
	public Cat(){}
	
	@Override
	public void isHealthy() {
		System.out.println("The cat is purchased.");
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
