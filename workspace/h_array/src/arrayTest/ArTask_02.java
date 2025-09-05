package arrayTest;

import java.util.Scanner;

public class ArTask_02 {
   public static void main(String[] args) {
//      1 ~ 10까지 배열에 담고 출력
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      10 ~ 1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < 5; i++) {
//         arData[i] = (5 - i) * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      1 ~ 100까지 배열에 담은 후 홀수만 출력
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      for (int i = 0; i < 50; i++) {
//         System.out.println(arData[i * 2]);
//      }
      
//      (1) 001.png ~ 010.png 를 배열에 담고 출력

//      i / 10 < 1      : 00
//      i / 10 < 10      : 0
//      i / 10 < 100   : 
      
//      String[] arData = new String[10];
//      
//      for (int i = 0; i < 10; i++) {
////         매 반복마다 이전 값을 초기화 해준다.
//         String fileName = "";
//         String zero = "";
//         
////         1의 자리수는 앞에 0을 2개 붙인다.
//         if ((i + 1) / 10 < 1) {
//            zero = "00";
//         } else if ((i + 1) / 10 < 10) {
////            10의 자리수는 앞에 0을 1개 붙인다.
//            zero = "0";
//         }
//         
////         만약 위의 조건식이 모두 false이면 zero에는 초기값인 ""이 들어있다.
////         100의 자리수는 앞에 0을 붙이지 않는다.
//         
////         앞에 붙여야 할 0을 붙여준다.
//         fileName += zero;
////         이미지 번호를 붙여준다.
//         fileName += i + 1;
////         확장자를 붙여준다.
//         fileName += ".png";
////         각 파일의 이름을 배열에 담아준다.
//         arData[i] = fileName;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      (2) 001.png ~ 010.png 를 배열에 담고 출력
//      String[] arData = new String[10];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1 + ".png";
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         switch(arData[i].length()) {
//         case 5:
//            arData[i] = "00" + arData[i];
//            break;
//         case 6:
//            arData[i] = "0" + arData[i];
//            break;
//         }
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      (3) 001.png ~ 010.png 를 배열에 담고 출력
//      String[] arData = new String[10];
//      
//      for (int i = 0; i < 10; i++) {
//         arData[i] = String.format("%03d.png", i + 1);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//      int[] arData = new int[100];
//      int total = 0;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
      
//      for (int i = 0; i < 50; i++) {
//         total += arData[i * 2 + 1];
//      }
      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 0) {
//            total += arData[i];
//         }
//      }
      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 1) {
//            continue;
//         }
//         total += arData[i];
//      }
      
//      System.out.println(total);
      
      
//      A ~ F까지 배열에 담고 출력
//      char[] arData = new char[6];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(65 + i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)((i > 1 ? 66 : 65) + i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//      단, 같은 수는 없다고 가정한다.
//      int[] arData = new int[5];
//      Scanner scanner = new Scanner(System.in);
//      String message = "5개의 정수를 입력하세요.\n예)4 3 2 6 7";
//      
//      int max = 0, min = 0;
//      
//      System.out.println(message);
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = scanner.nextInt();
//      }
//
//      max = arData[0];
//      min = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(max < arData[i]) {
//            max = arData[i];
//         }
//         if(min > arData[i]) {
//            min = arData[i];
//         }
//      }
//      
//      System.out.println(max);
//      System.out.println(min);
      
//      사용자에게 칸 수를 입력받고, 그 칸 수만큼 정수를 다시 입력받는다.
//      입력한 정수들의 평균값을 구한다.
//      int[] arData = null;
//      int length = 0;
//      int total = 0;
//      double average = 0.0;
//      Scanner scanner = new Scanner(System.in);
//      String lengthMessage = "몇 개의 정수를 입력하시나요?";
//      String numberMessage = "개의 정수를 입력해주세요\n예)3 4 1 2";
//      
//      System.out.println(lengthMessage);
//      length = scanner.nextInt();
//      
//      arData = new int[length];
//      
//      System.out.println(length + numberMessage);
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = scanner.nextInt();
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         total += arData[i];
//      }
//      
//      average = (double)total / arData.length;
//      
//      System.out.println(average);
      
      
//      (1) 1~100까지 중 홀수만 배열에 담기
//      (2) 1~100까지 중 짝수만 배열에 담기
//      (3) 두 배열을 합쳐서 1~100까지 배열에 담고 각 요소 출력하기
      int length = 50;
      int[] arOddData = new int[length];
      int[] arEvenData = new int[length];
      int[] arData = new int[length * 2];
      
      for (int i = 0; i < arOddData.length; i++) {
         arOddData[i] = i * 2 + 1;
         arEvenData[i] = (i + 1) * 2;
      }
      
      for (int i = 0; i < arEvenData.length; i++) {
         arData[i * 2 + 1] = arEvenData[i];
      }
      for (int i = 0; i < arOddData.length; i++) {
         arData[i * 2] = arOddData[i];
      }
      
      for (int i = 0; i < arData.length; i++) {
         System.out.println(arData[i]);
      }
   }
}























