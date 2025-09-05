package castingTask;

//문제 1: 도서관 도서 관리 시스템
//도서관에 다양한 종류의 책(소설, 잡지, 만화)을 관리

//Book 클래스:
//필드: title, author
//메서드: void describe() → "일반 도서입니다."

//Novel, Magazine, ComicBook 클래스는 Book 상속

//각각 describe()를 오버라이딩하여 고유 설명 출력
//ComicBook 클래스에는 void readPage(int page) 메서드 추가
//"만화책 X페이지를 읽었습니다." 출력
//Book[] 배열에 다양한 도서를 저장 (업캐스팅)
//모든 책에 대해 describe() 호출
//만화책인 경우만 다운캐스팅하여 readPage(5) 호출

class Book {
		public Book() {;}
		
		String title;
		String author;
		
		public Book(String title, String author) {
			super();
			this.title = title;
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		void describe() {
			System.out.println("일반 도서입니다.");
		}
}

	class Novel extends Book{
		@Override
		void describe() {
			System.out.println("소설입니다.");
		}
		public Novel(String title, String Author) {
			super(title, Author);
		}
	}
	
	class Magazine extends Book{
		@Override
		void describe() {
		System.out.println("잡지입니다.");
		}
		public Magazine(String title, String Author) {
			super(title, Author);
		}
	}
	
	class ComicBook extends Book{
		@Override
		void describe() {
			System.out.println("만화책입니다.");
		}
		public ComicBook(String title, String Author) {
			super(title, Author);
		}
		void readPage (int page) {
			System.out.println("만화책 " + page +"페이지를 읽었습니다.");
		}
	}
		public class Task1{
		public static void main(String[] args) {
			
			 Book[] books = {
					new Novel("소설1", "가나다"),
					new Magazine("소설2","다라마"),
					new ComicBook("소설3", "바사아")
					};
			
			for (int i = 0; i < books.length; i++) {
				 Book book = books[i];
				book.describe();
				
				if(book instanceof ComicBook) {
					((ComicBook)book).readPage(5);
				}
				
				System.out.println();
			}
		}
		
		
			
		}