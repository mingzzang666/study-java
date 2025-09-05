package list.task.movie;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Theater {
	//	감독 별 평균 예매 수
	
	public double getAverageReservationByDirector(String director) {
		int sum = 0;
		int count = 0;

		for (Movie movies : DBConnecter.movies) {
			if (movies.getDirector().equals(director)) {
				sum += movies.getReservationCount();
				count++;
			}
		}
		return (double) sum / count;
	}
	
	//	영화 제목으로 찾은 해당 영화가 예매수 100 이상이면 "인기 영화", 아니면 "비인기 영화"
	
	public boolean isPopularMovie(String title) {
		for (Movie movies : DBConnecter.movies) {
			if(movies.getTitle().equals(title)) {				
				return movies.getReservationCount() >= 100;
			}
		}	
		return false;
	}
	
	//예매 수가 특정 수 이상인 영화 목록 조회하기

	public ArrayList<Movie> getMoviesAboveReservation(int number){
		ArrayList<Movie> result  = new ArrayList<>();
		for(Movie movies : DBConnecter.movies) {
			if(movies.getReservationCount() >= number) {
				result.add(new Movie(movies));
			}
		}
		return result;
	}
	
	//	특정 키워드가 제목에 포함된 영화 수 반환
	
	public int countMoviesByTitleKeyword(String keyword) {
		int count = 0;
		for(Movie movies : DBConnecter.movies) {
			if(movies.getTitle().contains(keyword)) {
				count++;
			}
		}
		return count;
	}
	
//		등록된 영화 중 가장 긴 제목의 영화 찾기
	
	public Movie getLongestTitleMovie() {
		Movie longestMovie = DBConnecter.movies.get(0);	
		for(Movie movies : DBConnecter.movies) {
			if(movies.getTitle().length() > longestMovie.getTitle().length()) {
				longestMovie = movies;
			}
		}
		return new Movie(longestMovie);
	}
	
	
	
}	
	
	

