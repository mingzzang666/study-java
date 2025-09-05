package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Student {
	
	    private String name;
	    private int age;
	    private int score;

	    public Student(String name, int age, int score) {
	        this.name = name;
	        this.age = age;
	        this.score = score;
	    }

	    // getter만 있다고 가정
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public int getScore() { return score; }

	    @Override
	    public String toString() {
	        return name + " (" + age + "세, " + score + "점)";
	    }
	    
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

