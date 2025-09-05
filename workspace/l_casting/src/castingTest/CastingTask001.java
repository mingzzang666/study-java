package castingTest;

class Character{
	public Character() {;}
	
}

public class CastingTask001 {
	
	void prepareSkill (Character Skill) {
		if(Skill instanceof Archer) {
			Archer skill = (Archer) Skill;
			skill.useMultishot();
		}else if(Skill instanceof Warrior) {
			Warrior skill = (Warrior) Skill;
			skill.usePowerSlash();
		}else if(Skill instanceof Mage) {
			Mage skill = (Mage) Skill;
			skill.castFireball();
		}else {
			System.out.println("없는 직업입니다.");
		}
	}

	public static void main(String[] args) {
		
	CastingTask001 skill = new CastingTask001();
	
	Character class1 = new Archer();
	Character class2 = new Warrior();
	Character class3 = new Mage();
//	Character class4 = new ();
	
	skill.prepareSkill(class1);
	skill.prepareSkill(class2);
	
		
	}
	
}
