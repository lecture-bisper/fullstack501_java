package quiz;

import java.util.Scanner;

public class PhoneManager {
  public static void main(String[] args) {
//    사용자 키보드 입력을 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

//    저장할 데이터 수, Phone 클래스의 배열 크기를 설정
    System.out.print("인원수 >> ");
    int count = sc.nextInt();

// 입력받은 count를 이용하여 Phone 클래스 타입의 배열 선언, 배열 크기 설정
    Phone[] phoneBook = new Phone[count];
    
//    사용자에게 입력 받을 이름과 전화번호를 저장할 변수 선언
    String name = ""; // 빈 문자열로 초기화
    String tel = "";

//    반복문을 사용하여 Phone 클래스 타입의 배열 크기만큼 사용자 정보 받아오기
    for (int i = 0; i < phoneBook.length; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
      name = sc.next();
      tel = sc.next();
//      클래스 타입의 배열을 선언 시 해당 배열의 요소는 비어있음
//      배열의 요소에는 null이 들어가 있으며, 해당 index에 new 생성자()를 통해서 객체를 생성하여 입력해야 함
      phoneBook[i] = new Phone(name, tel);
    }

    System.out.println("저장되었습니다.");

//    배열안에 있는 내용을 연속적으로 검색하여 출력하기 위해서 무한 루프를 사용함
    while (true) {

      System.out.print("검색할 이름 >> ");
      name = sc.next();

//      배열의 내용과 사용자가 입력한 이름이 일치하는지 여부를 저장할 변수
      boolean flag = false;

//      사용자 입력 내용이 exit 와 같으면 프로그램 종료
      if (name.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      else {
//        사용자가 입력한 내용과 배열안의 내용이 일치하는지 전체 검색
        for (int i = 0; i < phoneBook.length; i++) {
//          getName() : Phone 클래스의 name 필드의 Getter 메소드
//          equals() : 문자열이 같은지 확인하는 메소드
          if (phoneBook[i].getName().equals(name)) {
//            같을 경우 화면에 메시지 출력
            System.out.println(phoneBook[i].getName() + "의 번호는 " + phoneBook[i].getTel() + "입니다.");
//            변수에 사용자 입력 내용과 배열에 저장된 내용이 같다는 의미로 논리값 입력 
            flag = true;
            break; // for문 즉시 종료
          }
          else {
//            배열과 사용자 입력 내용이 같지 않을 경우 false 입력
            flag = false;
          }
        }

//        flag 변수를 확인하여 값이 false 이면 사용자가 입력한 내용과 배열의 모든 내용이 일치하지 않음
        if (flag == false) {
          System.out.println(name + "이 없습니다.");
        }
      }
    }
  }
}







