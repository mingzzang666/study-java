package list.task.gameCharacter;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Game {
	
	//	특정 직업의 캐릭터 목록 조회
	
	public ArrayList<GameCharacter> searchCharacterList(String job) {
		ArrayList<GameCharacter> characterList = new ArrayList<>();
		for(GameCharacter gameCharacters : DBConnecter.gameCharacters) {
			if(gameCharacters.job.equals(job)) {
				characterList.add(new GameCharacter(gameCharacters));
			}
		}
		return characterList;
	}
	//	전체 캐릭터 중 최고 레벨 캐릭터 반환
	
		public GameCharacter findHighLevelCharacter() {
			
			GameCharacter highLevel = DBConnecter.gameCharacters.get(0);
			
			for(GameCharacter gameCharacters : DBConnecter.gameCharacters) {
				if(gameCharacters.getLevel() > highLevel.getLevel()) {
					highLevel = gameCharacters;
				}
			}
			return new GameCharacter(highLevel);
			}
			
	//	레벨 평균 구하기
		
		public double calculateAverageLevel() {
			int total = 0;
			for(GameCharacter gameCharacters : DBConnecter.gameCharacters) {
				total += gameCharacters.getLevel();
			}
			
			return (double) total / DBConnecter.gameCharacters.size();
		}
	//	동일한 닉네임이 있는지 확인
		
		public boolean checkNickname(String nickname) {
			for(GameCharacter gameCharacters : DBConnecter.gameCharacters) {
				if(gameCharacters.nickname.equals(nickname)) {
					return false;
				}
			}return true;
		}
		
	//	캐릭터 레벨 순 정렬된 리스트 반환(내림차순)
		
//		public ArrayList<GameCharacter> getSortedList() {
//			ArrayList<GameCharacter> copyList = new ArrayList<>();
//			for(GameCharacter gameCharacters : DBConnecter.gameCharacters) {
//				copyList.add(new GameCharacter(gameCharacters));
//			}
//			
////			Collections.sort(copyList);
//		} 
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

}
