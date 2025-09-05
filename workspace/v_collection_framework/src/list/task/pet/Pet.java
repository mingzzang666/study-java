package list.task.pet;

import java.util.Objects;

public class Pet {
	
	public Pet() {;}

	private String name;
	private String species;
	private int age;
	private String ownername;
	
	public Pet(Pet pet) {
		this(pet.getName(), pet.getSpecies(), pet.getAge(), pet.getOwnername());
	}
	
	public Pet(String name, String species, int age, String ownername) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		this.ownername = ownername;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", species=" + species + ", age=" + age + ", ownername=" + ownername + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, ownername, species);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(ownername, other.ownername)
				&& Objects.equals(species, other.species);
	}
	
	
	
}
