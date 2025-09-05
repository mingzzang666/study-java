package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
	
    public static void main(String[] args) {
		
//    점수가 90점 이상인 학생 수 구하기
    	Student[] arStudents = {
    		new Student("홍길동", 14, 80),
    		new Student("가나다", 14, 90),
    		new Student("다라마", 15, 95),
    		new Student("아자차", 15, 70)
    	};
//     ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(arStudents));
//     students.stream().filter(student -> student.getScore() >= 90).forEach(System.out :: println);

     //    모든 학생의 평균 점수 구하기
     
     ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(arStudents));
   }

//    가장 점수가 높은 학생 찾기
//    점수순으로 정렬된 이름 목록 반환
//    이름에 "김"이 포함된 학생 목록 출력
//    모든 학생의 점수를 5점씩 증가시킨 새 리스트 만들기
//    나이가 20세 이상인 학생의 평균 점수 구하기
    
}
