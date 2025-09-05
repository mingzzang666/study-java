package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면
   
   public static void main(String[] args) {
      Bank[][] arrBank = new Bank[3][100];
//   이차원배열을 활용해서 세개 은행 고객을 관리하는 DB를 담을 배열 선언
      int[] arCount = new int[arrBank.length];
//   고객 수를 저장할 arCount 배열 선언
      String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };
//   은행의 이름을 arBankName 배열에 저장함

      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
//   시작 화면 메세지 저장
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
//   메뉴 화면 메세지 저장
      Scanner sc = new Scanner(System.in);

      int bankNumber = 0, choice = 0, myBankNumber = 0;
//   각 은행의 고유 번호, 고객의 선택 번호, 나의 은행 번호를 담을 변수 선언
      String account = null, password = null, phone = null, name = null;
//   계좌번호, 비밀번호, 핸드폰번호, 이름을 담을 변수 선언
      Bank user = null;
//   Bank 자료형 사용자 변수 선언
      int money = 0, withdrawMoney = 0, temp = 0;
//   잔액, 출금액, 출금 희망액(현재 잔액과 수수료 포함 금액을 비교하기 위함)을 담을 변수 선언
      Random random = new Random();
//   난수(계좌번호)를 생성할 변수 선언
      int passwordCheck = 0, phoneCheck = 0;
//   비밀번호, 휴대폰번호를 확인할 변수 선언

      String accountMessage = "계좌번호: ";
      String nameMessage = "예금주: ";
      String passwordMessage = "비밀번호(4자리): ";
      String phoneMessage = "핸드폰번호(- 제외): ";
      String depositMessage = "입금액: ";
      String withdrawMessage = "출금액: ";
      String errorMessage = "다시 시도해주세요.";
      String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
      
      while(true) {
         System.out.println(message);
         bankNumber = sc.nextInt();
//      처음 입력한 값(1,2,3을 은행 번호로 지정)
         
         if(bankNumber == 4) {
            break;
         }
//      처음 입력한 값이 4(나가기)일 경우 반복문 탈출
         
         bankNumber--;
//      인덱스 번호는 0부터 시작하므로 이를 활용하기 위해 위의 값에서 -1을 해줌
         
         while(true) {
            System.out.println(menu);
            choice = sc.nextInt();
//         메뉴 화면에서 번호를 입력받음
            
            if(choice == 6) {
               break;
            }
//         만약 6번(은행 선택 메뉴로 돌아가기)이 입력되었다면, 반복문 탈출
            
            switch(choice) {
            case 1: // 계좌 개설
               
               Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};
//            신한은행, 국민은행, 카카오뱅크의 각 정보를 하나로 관리하기 위해
//            Bank 자료형을 가진 배열로 선언
               
               while(true) {
                  account = String.valueOf(random.nextInt(900000) + 100000);
//               계좌번호 = 900000개의 난수에 +100000을 더해 100000 ~ 999999의 난수를 생성
                  account = bankNumber + account;
//               계좌번호 = 은행 고유 번호 + 위에서 생성된 난수
                  
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {
                     break;
                  }
               }
//              계좌번호 중복검사를 실시하여 값이 존재하지 않을 경우 = 중복이 아닐 경우
//          	 break로 반복문 탈출
               
               System.out.println(nameMessage);
               name = sc.next();
//            예금주의 이름을 입력받음
               
               while(true) {
                  System.out.println(passwordMessage);
//               비밀번호 메세지 출력
                  password = sc.next();
//               비밀번호 = 입력받은 수
                  passwordCheck = 0;
//               비밀번호 체크 값 초기화(아래에서 저장된 값으로 인해 오류가 나는 것을 방지하기 위함)
                  
                  if(password.length() == 4) {
//                	  비밀번호의 자릿수가 4일 경우에만 실행
                     for (int i = 0; i < password.length(); i++) {
                        char c = password.charAt(i);
//                     비밀번호의 길이만큼 반복문을 사용하여 입력한 값을 문자형 변수 c에다가 담음
                        if(c >= 48 && c <= 57) {
                           passwordCheck++;
                        }
//                     만약 c의 값이 48 ~ 57 사이의 수(0~9)일 경우
//                     비밀번호 체크의 값을 1증가시킴
                     }
                  }
                  
                  if(passwordCheck == 4) {
                     break;
                  }
               }
//               		그렇게 증가된 값이 4일 경우에(체크가 완료되면) 반복문 탈출 
               
               while(true) {
                  System.out.println(phoneMessage);
//               핸드폰 번호 메세지 출력
                  phone = sc.next();
//               핸드폰 번호를 받아옴
                  phoneCheck = 0;
//               받아온 핸드폰 번호를 체크한 값을 초기화 시켜줌
                  
                  phone = phone.replaceAll("-", "");
//               핸드폰 번호 = "-"(하이픈)이 들어가면 ""(공백)으로 대체해줌
                  
                  if(phone.length() == 11) {
//                	 핸드폰 번호의 길이가 11자리일 경우에만 실행
                     for (int i = 0; i < phone.length(); i++) {
//                  핸드폰 번호의 길이만큼 반복문 실행
                        char c = phone.charAt(i);
                        if(c >= 48 && c <= 57) {
                           phoneCheck++;
//                     입력한 핸드폰 번호의 값을 문자형 변수 c에 담아 48~57(숫자 0~9)의 값인지 확인,
//                       맞으면 핸드폰 체크의 값을 올려줌.   
                        }
                     }
                     
                     if(phoneCheck == 11) {
//                    	 핸드폰 체크의 값이 11일 경우에만 실행
                        if(Bank.checkPhone(arrBank, arCount, phone) == null) {
                           break;
//                     핸드폰번호 중복검사를 실행하여 값이 null일 경우(중복이 아닐 경우) 반복문 탈출
                        }
                     }
                  }
               }
               
               user = arBank[bankNumber];
//            사용자가 선택한 은행 번호를 arBank에 담아서 해당 은행의 정보를 불러옴
               
               user.setAccount(account);
               user.setName(name);
               user.setPassword(password);
               user.setPhone(phone);
//            설정한 값들에 user 변수로 접근하여 값을 불러옴
               
               arrBank[bankNumber][arCount[bankNumber]++] = user;
//            arrBank[][] 배열에 선택한 은행 번호(ex) 1번 = 인덱스 0)를 넣고
//            현재 해당 은행 고객수 (arCount[]) 번호에 저장된 값을 넣어줌.
//            arrBank[1][arCount[1]++] = user; 여기서 arCount[]의 값을 넣으면 다음 인덱스 번호가 되므로
//            자연스럽게 다음 배열에 현재 고객의 정보를 저장함.
//            
               
               System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
//            은행의 이름[은행번호] 배열로 은행의 이름 + 가입 환영 메세지 출력
               System.out.println("고객님의 소중한 계좌번호: " + account);
//            계좌번호를 알려줄 메세지 출력
               break;
//            정상 출력 된 경우 반복문 종료
            case 2: // 입금 하기
               System.out.println(accountMessage);
               account = sc.next();
//            계좌 번호를 입력할 메세지 출력 후 입력받음
               
               System.out.println(passwordMessage);
               password = sc.next();
//            비밀번호를 입력할 메세지 출력 후 입력받음
               
               user = Bank.login(arrBank, arCount, account, password);
//            고객 = Bank 자료형으로 접근하여 해당 정보를 불러옴
               
               if(user != null) {
//            고객이 null이 아닐 경우 실행
                  myBankNumber = user.getAccount().charAt(0) - 48;
//               나의 은행 번호 = 고객의 계좌번호의 첫번째 숫자를 추출해서 값을 저장
                  if(myBankNumber == bankNumber) {
//                	  나의 은행 번호가 현재 은행 번호와 동일할 경우에만 실행
                     System.out.println(depositMessage);
//                   입금 메세지 출력
                     money = sc.nextInt();
//                   입금할 금액을 입력받음
//                 
                     
                     if(money > 0) {
//                   입금할 금액이 0원보다 클 때만 실행
                        user.deposit(money);
//                     입력받은 금액을 입금 금액으로 설정하고 deposit 메소드를 사용하여 해당 금액을
//                     고객의 원래 보유 금액에 더해줌
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
//                     현재 잔액 출력
                     }else {
                        System.out.println(errorMessage);
                     }
//                    0원보다 같거나 작을 경우 에러 메세지 출력
                  }else {
                     System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
                  }
//                	나의 은행 번호가 현재 은행 번호와 동일하지 않을 경우 실행
//                 나의 은행 이름 + 은행에서만 입금 서비스를 ~ 출력
                  
//                  현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//                  그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//                  if(bankNumber == 0) {
//                     if(user instanceof Shinhan) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(money);
//                     }
//                  }else if(bankNumber == 1) {
//                     if(user instanceof Kookmin) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(money);
//                     }
//                  }else if(bankNumber == 2) {
//                     if(user instanceof Kakao) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(money);
//                     }
//                  }
               } else {
                  System.out.println(loginFailMessage);
//               유저가 null일 경우 로그인 실패 메세지 출력
               }
               break;
            case 3: // 출금 하기
               System.out.println(accountMessage);
               account = sc.next();
//             계좌번호 메세지 출력
//             계좌번호를 받아옴
               
               System.out.println(passwordMessage);
               password = sc.next();
//             비밀번호 메세지 출력
//             비밀번호 받아옴
               
               user = Bank.login(arrBank, arCount, account, password);
//            Bank 자료형으로 로그인 메소드를 접근하여 고객의 정보를 담음
               
               if(user != null) {
//            	   고객이 null이 아닐 경우(존재할 경우) 실행
                  System.out.println(withdrawMessage);
//                출금 메세지 출력
                  withdrawMoney = sc.nextInt();
//                출금 값은 = 입력받아옴
                  
                  temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
//               임시값 temp = kookmin의 객체라면 수수료에 1.5를 곱해서 50% 수수료로 출금액 저장, 
//               아니라면 그냥 출금액 저장
                  
                  if(withdrawMoney > 0) {
//                	  출금액이 0원보다 클 경우 실행
                     if(temp <= user.getMoney()) {
//                  임시값이 손님이 가진 잔액보다 작거나 같을 경우
                        user.withdraw(withdrawMoney);
//                  출금액을 입력하여 출금 메소드 실행 후 현재 손님의 값 저장
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
//                  현재 잔액을 출력
                        
                     }else {
                        System.out.println(errorMessage);
                     }
//					 임시값이 손님이 가진 잔액보다 클 경우 에러 메세지 출력
                     
                  }else {
                     System.out.println(errorMessage);
                  }
//                  출금액이 0원보다 크지 않을경우 에러 메세지 출력
               } else {
                  System.out.println(loginFailMessage);
               }
//               고객이 null일경우 로그인 실패 메세지 출력
               break;
            case 4: // 잔액 조회
               System.out.println(accountMessage);
               account = sc.next();
//            계좌번호 메세지를 출력 후 계좌번호를 입력받음.
               
               System.out.println(passwordMessage);
               password = sc.next();
//            비밀번호 메세지를 출력 후 비밀번호를 입력받음.
               
               user = Bank.login(arrBank, arCount, account, password);
//           로그인 메소드를 사용하여 회원 조회
               if(user != null) {
//            현재 고객이 null(값이 없다)이 아닐 경우 실행
                  System.out.println("현재 잔액: " + user.showBalance() + "원");
               }
               break;
//            현재 고객의 잔액을 출력
//            반복문 탈출
               
            case 5: // 계좌번호 찾기
               System.out.println(phoneMessage);
               phone = sc.next();
//            핸드폰 메세지 출력 후 핸드폰번호 입력받음
               
               System.out.println(passwordMessage);
               password = sc.next();
//            비밀번호 메세지 출력 후 비밀번호 입력받음
               
               user = Bank.checkPhone(arrBank, arCount, phone);
//            핸드폰 중복검사 메소드를 이용하여 현재 고객의 정보를 가져옴
               if(user != null) {
//            	   고객의 정보가 null(값이 없다)이 아닐 경우
                  while(true) {
                     account = String.valueOf(random.nextInt(900000) + 100000);
//                  계좌번호 = 난수를 생성하여 값을 저장
                     account = bankNumber + account;
                     if(Bank.checkAccount(arrBank, arCount, account) == null) {
                        break;
//                  계좌번호 = 은행 번호 + 계좌번호
                     }
//                  계좌번호 중복검사를 실행하여 값이 null일 경우(중복이 없을 경우)
//                  반복문 탈출
                  }
                  
                  user.setAccount(account);
//               현재 고객의 계좌번호를 저장
                  System.out.println("고객님의 소중한 계좌번호: " + account);
//               계좌번호를 출력
               }else {
                  System.out.println(errorMessage);
//                null일 경우 에러 메세지를 출력
                  
               }
               break;
//              반복문 탈출
               
               default:
                  System.out.println(errorMessage);
//               정해진 숫자 외에 다른 값을 입력하는 경우 에러 메세지 출력
                  break;
//               반복문 탈출 (종료)
            }
            
         }
      }
   }
}


