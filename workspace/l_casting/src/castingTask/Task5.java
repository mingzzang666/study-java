package castingTask;

//문제 5: 게임 캐릭터 전투 시뮬레이션
//게임 캐릭터의 다양한 행동을 오버라이딩하고, 고유 스킬을 다운캐스팅으로 실행

//Character 클래스:
//필드: name, level
//메서드: void attack() → "기본 공격"

//하위 클래스: Warrior, Archer, Wizard

//각 클래스에서 attack() 오버라이딩
//Wizard 클래스에는 castSpell(String spellName) 메서드 추가
//Character[] 배열에 캐릭터 저장
//반복문으로 attack() 호출
//Wizard 객체일 경우 다운캐스팅 후 castSpell("파이어볼") 호출

class Character{
	public Character() {;}
	
	String name;
	int level;
	
	public Character(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	void attack() {
		System.out.println("기본 공격!");
	}
}
class Warrior extends Character{

	public Warrior(String name, int level) {
		super(name, level);
	}
	@Override
	void attack() {
		System.out.print("전사 ");
		super.attack();
	}
}
class Archer extends Character{

	public Archer(String name, int level) {
		super(name, level);
	}
	@Override
	void attack() {
		System.out.print("궁수 ");
		super.attack();
	}
}
class Wizard extends Character{
	
	public Wizard(String name, int level) {
		super(name, level);
	}
	@Override
	void attack() {
		System.out.print("마법사 ");
		super.attack();
	}
	void castSpell(String spellName) {
		System.out.println(spellName);
	}
}
public class Task5 {
		public static void main(String[] args) {
				Character[] arCharacter = {
						new Archer("궁수123", 50),
						new Wizard("zl존법사", 80),
						new Warrior("고기방패", 30),
						new Wizard("초보입니다", 99)
				};
			for (int i = 0; i < arCharacter.length; i++) {
					Character character = arCharacter[i];
					character.attack();
					
					if(character instanceof Wizard) {
						((Wizard)character).castSpell("파이어볼");
					}
			}	
			System.out.println();
		}
}





