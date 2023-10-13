public class Main {
  public static void main(String[] args) {
    System.out.println("\n ----- 단순 if문 사용 ----- \n");

//    단순 if문 : 기존 소스코드의 흐름대로 모두 실행하다가 단순 if문을 만날 경우 조건식의 결과에 따라 추가적으로 실행을 하는 if문
//     - 추가 옵션으로 생각하면 됨
//    사용법 :
//    if (조건식) {
//      조건식이 true일 경우 실행할 소스코드 ...
//    }

//    int 타입의 변수 score 선언과 동시에 정수 데이터 95를 저장
    int score = 95;

//    단순 if문으로 비교
    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    }

    if (score < 90) {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");
    }


//    중국집에 가서 자장면을 먹는 상황
//    자장면 7,000원, 군만두 5,000원
//    가지고 있는 돈이 12,000원 이상이면 군만두를 추가로 먹고,
//    12,000원 미만이면 자장면만 먹음
    int money = 15000;

    System.out.println("중국집에 갑니다.");

    System.out.println("자장면을 주문합니다.");

    if (money >= 12000) {
      System.out.println("군만두를 추가로 주문합니다.");
    }

    System.out.println("주문한 음식을 먹습니다.");


    System.out.println("\n\n");

//    if ~ else : 기존 소스를 실행하다가 if ~ else문을 만나면 조건식의 결과에 따라 무조건 둘 중 하나를 실행하는 방식의 if문
//    사용법 :
//    if (조건식) {
//      조건식의 결과가 true일 경우 실행할 소스코드 ...
//    }
//    else {
//      조건식의 결과가 false일 경우 실행할 소스코드 ...
//    }

    System.out.println("\n ----- if ~ else 문 -----\n");

//    중국집에 가서 음식을 주문 시 자장면/짬뽕을 먹을지 선택

    String food = "자장면";

    System.out.println("중국집에 갔습니다.");

    if (food.equals("자장면")) {
      System.out.println("자장면을 주문합니다.");
    } else {
      System.out.println("짬뽕을 주문합니다.");
    }

    System.out.println("주문한 음식을 맛있게 먹습니다.");


    System.out.println();

    score = 85;

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    } else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");
    }


    System.out.println("\n ----- else if 문 ----- \n");

//    else if : if문의 조건식이 여러개인 if문
//     - else 문은 필요에 따라 생략이 가능함
//     - 조건식을 입력 시 순서대로 입력해야 함
//     - 단순 if문 혹은 if ~ else문이 여러개 있는 것과는 다름
//    사용법 :
//    if (조건식 1) {
//      조건식 1의 결과가 true 일 경우 실행할 소스코드 ...
//    }
//    else if (조건식 2) {
//      조건식 2의 결과가 true 일 경우 실행할 소스코드 ...
//    }
//    else if (조건식 n) {
//      조건식 n의 결과가 true 일 경우 실행할 소스코드 ...
//    }
//    else {
//      모든 조건식의 결과가 false 일 경우 실행할 소스코드 ...
//    }

    score = 75;

    if (score >= 90) {
      System.out.println("점수가 100 ~ 90 점이고, 등급은 A입니다.");
    }
    else if (score >= 80) {
      System.out.println("점수가 89 ~ 80 점이고, 등급은 B입니다.");
    }
    else if (score >= 70) {
      System.out.println("점수가 79 ~ 70 점이고, 등급은 C입니다.");
    }
    else if (score >= 60) {
      System.out.println("점수가 69 ~ 60 점이고, 등급은 D입니다.");
    }
    else {
      System.out.println("점수가 60점 미만이고, 등급은 F입니다.");
    }


    score = 50;

    if (score >= 90) {
      System.out.println("점수 90이상, 등급 A");
    }
    else if (score >= 80) {
      System.out.println("점수 80이상, 등급 B");
    }
    else if (score >= 70) {
      System.out.println("점수 70이상, 등급 C");
    }
    else if (score >= 60) {
      System.out.println("점수 60이상, 등급 D");
    }
    else if (score < 60) {
      System.out.println("점수 60미만, 등급 F");
    }
//    else문 생략, 필요하지 않은 부분은 미출력으로 처리
//    모든 조건식을 다 입력했을 경우


    score = 50;
    String level = "F";

    if (score >= 90) {
      level = "A";
    }
    else if (score >= 80) {
      level = "B";
    }
    else if (score >= 70) {
      level = "C";
    }
    else if (score >= 60) {
      level = "D";
    }

    System.out.println("점수 " + score + "점, 등급 " + level);

//    조건식은 순차적으로 입력해야 함

    System.out.println("\n ----- else if문의 조건식을 순차적으로 입력하지 않을 경우 -----\n");

    score = 85;
    level = "F"; // 등급의 기본값을 F로 설정

//    조건식이 90 비교 후 70 비교를 진행하고 80비교를 진행함
//    문법적으로 오류가 있지는 않음 
//    논리적으로 오류가 있을 수 있음
//    순차적으로 조건식을 만들어야 함
    if (score >= 90) {
      level = "A";
    }
    else if (score >= 70) {
      level = "C";
    }
    else if (score >= 80) {
      level = "B";
    }
    else if (score >= 60) {
      level = "D";
    }

    System.out.println("점수 : " + score + ", 등급 : " + level);


    System.out.println("\n ----- 중첩 if문 사용 ----- \n");

//    중첩 if문 : if문에 안에 if문을 추가로 사용하는 if문

    score = 83;
    level = "F";

    if (score >= 90) {
      if (score >= 95) {
        level = "A+";
      }
      else {
        level = "A";
      }
    }
    else {
      if (score >= 85) {
        level = "B+";
      }
      else {
        level = "B";
      }
    }

    System.out.println("점수 : " + score + ", 등급 : " + level);
  }
}














