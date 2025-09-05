package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
//      입력 변수를 선언
      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
//      제목을 저장하는 부분
      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//      보기를 저장하는 부분
      int choice = 0;
//      선택한 번호를 저장하는 부분
      String redMessage = "불같고 열정적이고 적극적이다.";
//      빨간색 메세지를 저장하는 부분
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
//      노란색 메세지를 저장하는 부분
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
//      검은색 메세지를 저장하는 부분
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//      하얀색 메세지를 저장하는 부분
      String errorMessage = "잘못 입력하셨습니다.";
//      에러 메세지를 저장하는 부분
      String resultMessage = "";
//      결과 메세지를 저장하는 부분
      
      System.out.println(title);
//      제목을 출력
      System.out.println(menu);
//      보기를 출력
      
      choice = sc.nextInt();
//      선택한 번호를 입력받는 부분
      
      switch(choice) {
      case 1:
         resultMessage = redMessage;
         break;
      case 2:
         resultMessage = yellowMessage;
         break;
      case 3:
         resultMessage = blackMessage;
         break;
      case 4:
         resultMessage = whiteMessage;
         break;
      default:
         resultMessage = errorMessage;
         break;
      }
//      switch문을 사용하여 결과 메세지에 선택한 번호와 연결된 메세지로 값을 저장 
      
      System.out.println(resultMessage);
//      결과 메세지 출력
      

//      번외
      String animal = "사자";
//      동물 이름을 저장
      
      switch(animal) {
      case "호랑이":
         System.out.println("어흥!");
         break;
      case "사자":
         System.out.println("어흥흥!");
         break;
      }
//      switch문을 사용하여 동물 이름에 해당하는 부분의 메세지 값이 저장되도록 설정
      
//      실수는 switch문에서 사용할 수 없다.
      double number = 3.54;
      
   }
}












