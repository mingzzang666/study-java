package list.task.movie;

import java.util.Objects;

public class Movie {
	
	public Movie() {;}
	
		private String title;
		private String genre;
		private String director;
		private int reservationCount;

		public Movie(String title, String genre, String director, int reservationCount) {
			this.title = title;
			this.genre = genre;
			this.director = director;
			this.reservationCount = reservationCount;
		}
		
		public Movie(Movie movie) {
			this(movie.getTitle(),movie.getGenre(),movie.getDirector(),movie.getReservationCount());
		}

		public String getTitle() {
			return title;
		}

		public String getGenre() {
			return genre;
		}

		public String getDirector() {
			return director;
		}

		public int getReservationCount() {
			return reservationCount;
		}

		public void setReservationCount(int reservationCount) {
			this.reservationCount = reservationCount;
		}

		@Override
		public String toString() {
			return "Movie [title=" + title + ", genre=" + genre + ", director=" + director + ", reservationCount="
					+ reservationCount + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(director, genre, reservationCount, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			return Objects.equals(director, other.director) && Objects.equals(genre, other.genre)
					&& reservationCount == other.reservationCount && Objects.equals(title, other.title);
		}
		
		
}
