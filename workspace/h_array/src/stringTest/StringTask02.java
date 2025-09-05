package stringTest;

import java.util.Scanner;

public class StringTask02 {
			public static void main(String[] args) {
//					한 반에 5명의 학생이 있습니다. 각 학생의 점수를 입력받고, 다음을 출력하는 프로그램을 작성하세요.

//					전체 학생 점수 출력
//					총점
//					평균
//					최고점과 최저점
//					최고점을 받은 학생의 번호(여러 명일 경우 모두 출력)
				
				Scanner sc = new Scanner(System.in);
				
				int[] arData = new int[5];
				String totalmessage = "";
				int total = 0;
//				int average = 0;
				int[] highScoreStudents = new int[5];
				int highScoreCount = 0;
				String highStudents = "";
				
				arData[0] = sc.nextInt();
				int highScore = arData[0];
				int lowScore = arData[0];
				highScoreStudents[0]= 1;
				highScoreCount = 1;
				totalmessage = "" + arData[0]; 
				total += arData[0];
				System.out.println("학생 1의 점수: " + arData[0]);
				
				
				for (int i = 1; i < arData.length; i++) {
					arData[i] = sc.nextInt();
					System.out.println("학생 " + (1 + i) + "의 점수: " + arData[i]);
					total += arData[i];
					totalmessage = totalmessage + " " + arData[i]; 
					
					if (highScore < arData[i]) {
						highScore = arData[i];
						highScoreCount = 1;
						highScoreStudents[0] = i + 1;
					}else if(arData[i] == highScore){
						highScoreStudents[highScoreCount] = i + 1;
						highScoreCount++;
					}
					if (lowScore > arData[i]) {
						lowScore = arData[i];
					}
				
				}
				System.out.println("전체 학생의 점수: " + totalmessage);
				System.out.println("총점: " + total);
				System.out.println("평균: " + (double)total / arData.length);
				System.out.println("최고점: " + highScore);
				System.out.println("최저점: " + lowScore);
				for (int i = 0; i < highScoreCount; i++) {
					highStudents += highScoreStudents[i] + " ";
				}
				System.out.println("최고점을 받은 학생의 번호: " + highStudents);
				
				
				
				
					
			}

}
