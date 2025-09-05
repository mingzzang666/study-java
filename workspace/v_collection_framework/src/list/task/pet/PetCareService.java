package list.task.pet;

import java.util.ArrayList;

import list.task.DBConnecter;

public class PetCareService {
	
//	모든 이름에 중복은 없음
//	반려동물 추가 
	public void insertPet(Pet pet) {
			DBConnecter.pets.add(new Pet(pet));
	}
	
//	이름으로 동물 종 조회
	public String searchSpecies(String name) {
		for(Pet pet : DBConnecter.pets) {
			if(pet.getName().equals(name)) {
				return pet.getSpecies();
			}
		}return null;
	}
		
//	특정 주인의 모든 반려동물 조회
	public ArrayList<Pet> searchByOwner (String ownerName) {
		ArrayList<Pet> pets = new ArrayList<>();
		for(Pet pet : DBConnecter.pets) {
			if(pet.getOwnername().equals(ownerName)) {
				pets.add(new Pet(pet));
			}
		}
		return pets;
	}	

//	특정 반려동물 나이 1살 증가 

	public boolean increaseAge (String name) {
		for(Pet pet : DBConnecter.pets) {
			if(pet.getName().equals(name)) {
				pet.setAge(pet.getAge() + 1);
				return true;
			}
		}
		return false;
	}
//	특정 종(species)의 반려동물 수 반환
	
	public int countBySpecies (String species) {
		int count = 0;
		
		for(Pet pet : DBConnecter.pets) {
			if(pet.getSpecies().equals(species)) {
				count ++;
		}
	} return count;
	}
		
		

}
