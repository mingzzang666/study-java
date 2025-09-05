package classTest;

public class Student1 {
//   학생 번호
   int id;
//   과목
   Subject[] arSubject;
//   총점
   int total;
//   평균
   double average;
   
   public Student1(int id, Subject[] arSubject) {
      this.id = id;
      this.arSubject = arSubject;
      for (int i = 0; i < arSubject.length; i++) {
         this.total += arSubject[i].score;
      }
      this.average = (double)this.total / arSubject.length;
   }
   
   
   
}
