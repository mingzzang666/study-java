package list.task.gameCharacter;

import java.util.Objects;

public class GameCharacter {
	
	public GameCharacter() {;}
	
	int id;
	String nickname;
	String job;
	int level;
	String guild;
	
	public GameCharacter(GameCharacter gameCharacter) {
		this(gameCharacter.getId(),  gameCharacter.getNickname(), 
				gameCharacter.getJob(), gameCharacter.getLevel(),
				gameCharacter.getGuild());
	}
	
	public GameCharacter(int id, String nickname, String job, int level, String guild) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.job = job;
		this.level = level;
		this.guild = guild;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getGuild() {
		return guild;
	}

	public void setGuild(String guild) {
		this.guild = guild;
	}

	@Override
	public String toString() {
		return "GameCharacter [id=" + id + ", nickname=" + nickname + ", job=" + job + ", level=" + level + ", guild="
				+ guild + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(guild, id, job, level, nickname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameCharacter other = (GameCharacter) obj;
		return Objects.equals(guild, other.guild) && id == other.id && Objects.equals(job, other.job)
				&& level == other.level && Objects.equals(nickname, other.nickname);
	}
	
	
	
	
		



}
