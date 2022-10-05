public class Main{
	public static void main(String [] args){
		
		Cat cat = new Cat();

		cat.setName("Millie");
		cat.setAge(12);
		//cat.isDead(false);

		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		//System.out.println(cat.isDead());

	}
}