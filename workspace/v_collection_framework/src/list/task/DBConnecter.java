package list.task;

import java.util.ArrayList;

import list.task.food.Food;
import list.task.fruit.Fruit;
import list.task.gameCharacter.GameCharacter;
import list.task.movie.Movie;
import list.task.pet.Pet;
import list.task.product.Product;
import list.task.user.User;

public class DBConnecter {
	
	protected DBConnecter() {;}
	
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	public static ArrayList<Food> foods = new ArrayList<Food>();
	public static ArrayList<Product> products = new ArrayList<Product>();
	public static ArrayList<Pet> pets= new ArrayList<Pet>();
	public static ArrayList<Movie> movies = new ArrayList<Movie>();
	public static ArrayList<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();
}
