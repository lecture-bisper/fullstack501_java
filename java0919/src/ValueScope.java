public class ValueScope {
  public static void main(String[] args) {
//    main 메소드의 코드블록에서 선언한 변수
//    main 메소드가 종료되기 전까지는 main 메소드의 어디에서든 사용이 가능
    int val1 = 10;

    System.out.println("main 메소드에서 val1 사용 : " + val1);

    if (true) {
//      if문 안에서 변수 val2 선언
      int val2 = 200;
      System.out.println("if문 안에서 val1 사용 : " + val1);
      System.out.println("if문 안에서 val2 사용 : " + val2);
    }

    System.out.println("if문 밖에서 val1 사용 : " + val1);
//    if문 안에서 선언한 변수이므로 if문 밖에서 접근할 수 없음
//    System.out.println("if문 밖에서 val2 사용 : " + val2);
//
    for (int i = 0; i < 1; i++) {
//      for 문 안에서 변수 val3 선언
      int val3 = 3000;
//      main 메소드 안에서 선언한 변수이므로 main 메소드 전체에서 사용할 수 있음
      System.out.println("for문 안에서 val1 사용 : " + val1);
//      if문 안에서 선언한 변수이므로 if문 밖에서 접근할 수 없음
//      System.out.println("for문 안에서 val2 사용 : " + val2);
//      for 문 안에서 선언한 변수이므로 for문 안에서 사용하는 것은 문제없음
      System.out.println("for문 안에서 val3 사용 : " + val3);
    }

//    main 메소드 안에서 선언한 변수이므로 main 메소드 전체에서 사용 가능
    System.out.println("for문 밖에서 val1 사용 : " + val1);
//    if문 안에서 선언한 변수이므로 if문 밖에서 접근할 수 없음
//    System.out.println("for문 밖에서 val2 사용 : " + val2);
//    for문 안에서 선언한 변수이므로 for문 밖에서 접근할 수 없음
//    System.out.println("for문 밖에서 val3 사용 : " + val3);
  }
}
