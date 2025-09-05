package classTest;

class book {
	String title;

	String author;
	public book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void printInfo(){
		System.out.println(title + ", " + author);
	}
	
	
	
}
public class ClassTask001 {
		public static void main(String[] args) {
			
	book book1 = new book("자바의 정석", "남궁석");

			book1.printInfo();
		}
}
