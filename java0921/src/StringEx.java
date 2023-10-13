public class StringEx {
  public static void main(String [] args) {
//    String : 자바에서 제공하는 문자열을 저장하기 위한 데이터 타입
//    - 클래스 타입으로 만들어져 있음
//    - 클래스 타입이지만 워낙 많이 사용하기 때문에 사용의 편의성을 위해서 기본 데이터 타입처럼 사용할 수 있도록 설계되었음
//    - new 키워드를 사용하여 생성할 수 있음
//    - 클래스 타입이기 때문에 문자열 사용을 도와주는 여러가지 메소드가 존재함
//    - 대입 연산자를 사용한 문자열 변수 선언과 new 키워드를 사용한 문자열 변수 선언은 사용하는 방식은 동일하지만 메모리 상에서 동작하는 형태가 다름

//    사용법 : 선언
//    String 변수명; // 문자열 변수 선언만 함
//    String 변수명 = "문자열 데이터"; // 문자열 변수 선언 및 데이터 저장
//    String 변수명 = new String("문자열 데이터"); // 문자열 변수 선언 및 데이터 저장

//    사용법 : 사용
//    변수명 = "문자열 데이터"; // 미리 선언한 변수에 문자열 저장
//    메소드명(변수명); // 미리 선언한 변수의 문자열 데이터 출력하기

    System.out.println("\n ----- String 사용하기 ----- \n");

//    str1, str2 형태를 일반적으로 많이 사용함
//    String 타입은 워낙 많이 사용하기 때문에 기본 타입처럼 사용할 수 있도록 설계
    String str1;
    str1 = "자바";
    String str2 = "자바";
    String str3 = new String("자바");

    System.out.println("변수 str1 : " + str1);
    System.out.println("변수 str2 : " + str2);
    System.out.println("변수 str3 : " + str3);


    System.out.println("\n ----- 기본타입 형태로 사용할 때와 객체 형태로 사용 시다른 점 ----- \n");


    String sVal1 = "java";
    String sVal2 = "java";
    String sVal3 = new String("java");
    String sVal4 = new String("java");

//    String 타입은 원래 클래스 타입이기 때문에 new 키워드를 사용하는 것이 기본
//    String 타입은 사용의 편의성을 위해서 기본 데이터 타입처럼 사용하도록 설계
//    동일한 코드 블럭 내에서 String 타입의 변수를 2개 이상 선언하고, 동일한 문자열을 대입연산자( = )를 통해서 데이터를 입력 시 두 String 타입의 변수는 동일한 String 타입의 객체 주소를 참조함
//    new 키워드를 사용하여 String 타입의 변수를 생성 시 메모리 영역에 새로 데이터 공간을 생성함
//    new 키워드 사용 시 String 타입의 변수에 저장된 실제 문자열을 같더라도 메모리 상의 주소가 다르기 때문에 서로 다르다고 표현함
    if (sVal1 == sVal2) {
      System.out.println("sVal1과 sVal2는 같다.");
    }
    else {
      System.out.println("sVal1과 sVal2는 다르다.");
    }

    if (sVal1 == sVal3) {
      System.out.println("sVal1과 sVal3는 같다.");
    }
    else {
      System.out.println("sVal1과 sVal3는 다르다.");
    }

    if (sVal3 == sVal4) {
      System.out.println("sVal3과 sVal4는 같다.");
    }
    else {
      System.out.println("sVal3과 sVal4는 다르다.");
    }

//    equals() : 자바에서 제공하는 문자열을 비교하기 위한 메소드
//    - 동일한 문자열일 경우 true, 다른 문자열일 경우 false를 출력
    if (sVal1.equals(sVal3)) {
      System.out.println("sVal1의 문자열과 sVal3의 문자열은 같다.");
    }
    else {
      System.out.println("sVal1의 문자열과 sVal3의 문자열은 다르다.");
    }
  }
}


















