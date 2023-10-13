import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchEx {
  public static void main(String [] args) {
    System.out.println("\n ----- switch ~ case 문 사용하기 ----- \n");

//    switch ~ case : if문과 같은 조건문
//     - 위에서 부터 아래로 case문을 하나씩 비교함
//     - 순차적으로 비교값을 설정해야함
//     - 각각의 case문 끝에 있는 break문을 생략하면 안됨
//     - break를 생략 시 break를 만날때까지 아래에 있는 case문을 실행함
//     - 모든 case문과 일치하지 않을 경우 default문이 실행됨
//     - default문은 생략이 가능함 (모든 조건을 case문에 입력 시, 사용자가 의도적으로 실행하지 않을 경우)
//    사용법 :
//    switch (비교값) {
//      case 조건값1 :
//        비교값이 조건값1과 동일할 경우 실행할 소스코드 ...
//        break;
//      case 조건값2 :
//        비교값이 조건값2와 동일할 경우 실행할 소스코드 ...
//        break;
//      case 조건값n :
//        비교값이 조건값n과 동일할 경우 실행할 소스코드 ...
//        break;
//      default:
//        비교값이 모든 조건값과 일치하지 않을 경우 실행할 소스코드 ...
//        break;

//    Math : 자바에서 제공하는 수학관련 클래스
//    Math.random() : 0.0 ~ 0.9까지의 임의의 숫자를 출력
//    int num = (int)(Math.random() * 6) + 1;
    int num = 2;

    switch (num) {
      case 1:
        System.out.println("1번이 나왔습니다.");
        break;

      case 2:
        System.out.println("2번이 나왔습니다.");
        break;

      case 3:
        System.out.println("3번이 나왔습니다.");
        break;

      case 4:
        System.out.println("4번이 나왔습니다.");
        break;

      case 5:
        System.out.println("5번이 나왔습니다.");
        break;

      default:
        System.out.println("6번이 나왔습니다.");
        break;
    }


    System.out.println();

//    LocalDate : 자바 8버전 이후로 제공되는 날짜 관련 클래스
//    LocalDate.now() : 현재 시간을 기준으로 현재 날짜를 알려줌
//    LocalDate date = LocalDate.now();
    LocalDate date = LocalDate.of(2023, 9, 23);
//    DayOfWeek : 자바에서 제공하는 열거형으로 날짜를 기준으로 한주의 요일을 알려줌
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    int day = dayOfWeek.getValue(); // 지정한 날짜의 요일을 숫자로 출력, 1 ~ 7

    System.out.println("현재 요일 값 : " + day);

    switch (day) {
//      case 1:
//        System.out.println("월요일 입니다.");
//        break;
//
//      case 2:
//        System.out.println("화요일 입니다.");
//        break;

      case 1:
      case 2:
        System.out.println("월화 드라마 하는 날");
        break;

      case 3:
        System.out.println("수요일 입니다.");
        break;

      case 4:
        System.out.println("목요일 입니다.");
        break;

      case 5:
        System.out.println("금요일 입니다.");
        break;

      case 6:
      case 7:
        System.out.println("주말입니다.");
        break;

//      case 6:
//        System.out.println("토요일 입니다.");
//        break;
//
//      case 7:
//        System.out.println("일요일 입니다.");
//        break;

//      default:
//        System.out.println("주말입니다.");
//        break;
    }


//    switch ~ case 문은 else if문으로 100% 대체가 가능함
//    if문은 조건식의 범위를 기준으로 결과값을 true인지 false인지 판단함
//    if문은 범용적으로 사용하기에 좋음
//    switch ~ case 문은 값을 기준으로 case 문의 값과 동일한지 판단함
//    switch ~ case 문은 고정된 값을 비교 시 사용하기에 좋음

    System.out.println("\n ----- else if문으로 대체하기 ----- \n");

    if (day == 1) {
      System.out.println("오늘은 월요일입니다.");
    }
    else if (day == 2) {
      System.out.println("오늘은 화요일입니다.");
    }
    else if (day == 3) {
      System.out.println("오늘은 수요일입니다.");
    }
    else if (day == 4) {
      System.out.println("오늘은 목요일입니다.");
    }
    else if (day == 5) {
      System.out.println("오늘은 금요일입니다.");
    }
    else {
      System.out.println("오늘은 주말입니다.");
    }
  }
}











