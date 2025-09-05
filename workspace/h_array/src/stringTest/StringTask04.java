package stringTest;

import java.util.Scanner;

public class StringTask04 {
			public static void main(String[] args) {
//					사용자로부터 학생 10명의 점수를 입력받고, 
//					각 점수를 기준으로 아래와 같이 등급을 분류하여 출력.
//					- 90점 이상 : A
//					- 80 ~ 89 : B
//					- 70 ~ 79 : C
//					- 60 ~ 69 : D
//					- 60점 미만 : F
//					모든 학생의 점수와 등급 출력, 각 등급별 인원 수 출력하기
				
				Scanner sc = new Scanner(System.in);
				
				int[] arScores = new int[10];
				char[] arGrade = {'A', 'B', 'C', 'D', 'F'};
				char[] arStudentGrades = new char[10];
				int[] arGradeCount = new int[5];
				System.out.println("학생 10명의 점수를 입력하세요.");
				
				for (int i = 0; i < arScores.length; i++) {
						arScores[i] = sc.nextInt();
						
							if(arScores[i] >= 90) {
									arStudentGrades[i] = arGrade[0];
									arGradeCount[0]++;
									
							}else if(arScores[i] >= 80) {
									arStudentGrades[i] = arGrade[1];
									arGradeCount[1]++;
									
							}else if(arScores[i] >= 70) {
									arStudentGrades[i] = arGrade[2];
									arGradeCount[2]++;
		
							}else if(arScores[i] >= 60) {
									arStudentGrades[i] = arGrade[3];
									arGradeCount[3]++;
								
							}else {
									arStudentGrades[i] = arGrade[4];
									arGradeCount[4]++;
							}
//						System.out.println(studentsGrade);
					}
				
					for (int i = 0; i < arScores.length; i++) {
							System.out.println(i + 1 + "번 학생: " + arScores[i] + "점");
							System.out.println("등급: " + arStudentGrades[i]);						
					}
					
					for (int i = 0; i < arGradeCount.length; i++) {
							System.out.println(arGrade[i] + "등급: " + arGradeCount[i] + "명");
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

}
