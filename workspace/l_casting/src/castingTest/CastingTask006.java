package castingTest;

import java.util.Scanner;

//Book 클래스 (부모 클래스)
//필드: title(String), price(int)
//메소드:
//printInfo() – 제목과 가격을 출력
//
//EBook 클래스 (Book 상속)
//추가 필드: fileSize(double, MB 단위)
//printInfo()를 오버라이딩하여 파일 크기도 출력
//
//Main 클래스 기능
//사용자에게 도서 수 입력받기
//각 도서마다 일반 도서인지 전자책인지 선택
//
//책 정보를 입력받아 Book[] 배열에 저장 (업캐스팅 사용)
//저장된 모든 도서 정보 출력
//가장 비싼 책의 제목 출력
//배열에서 Book 타입을 EBook으로 다운캐스팅하여 전자책만 따로 출력

class Book {
		public Book() {;}
		
		String title;
		int price;
	
		
		public Book(String title, int price) {
			super();
			this.title = title;
			this.price = price;
		}
		
		void printInfo() {
			System.out.println("제목: " + title + "\n가격" + price);
		}
		
}

class Ebook extends Book {
		public Ebook() {;}
		double filesize;
		
		
		public Ebook(String title, int price, double filesize) {
			super();
			this.filesize = filesize;
		}


		@Override
		void printInfo() {
			super.printInfo();
			System.out.println("\n파일 크기: " + filesize + "MB");
			
		}
}

public class CastingTask006 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("도서의 개수를 입력해주세요.");
				int count = Integer.parseInt(sc.nextLine());
				Book[] books = new Book[count];
				
				
				for (int i = 0; i < books.length; i++) {
					System.out.println("[" + (i + 1) + "번째 도서의 타입은 무엇입니까? (일반도서 / 전자책)]");
					String type = sc.nextLine();
					System.out.println("제목: ");
					String title = sc.nextLine();
					System.out.println("가격: ");
					int price = Integer.parseInt(sc.nextLine());
					
				
					if(type.equals("일반도서")) {
						books[i] = new Book(title, price);
						
					}else if(type.equals("전자책")) {
						System.out.println("파일 크기(MB): ");
						double filesize = Double.parseDouble(sc.nextLine());
						books[i] = new Ebook(title,price,filesize);
						
					}else {
						System.out.println("존재하지 않는 타입입니다.");
						i--;
					}
				}
				
				
				
		}

}
