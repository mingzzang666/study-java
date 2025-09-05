package classTest;

public class User {
	int id;
	String name;
	int age;
	
	Exercise[] arExercise;
	int total;

	public User(int id, String name, int age, Exercise[] arExercise) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.arExercise = arExercise;
		
		for (int i = 0; i < arExercise.length; i++) {
			total += arExercise[i].calorie;
		}
	}
	
	
}
