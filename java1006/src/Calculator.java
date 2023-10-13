public class Calculator {
//  생성자 : 클래스 이름과 동일한 이름을 가지고 있는 메소드
//  - 객체가 생성될 때 객체의 필드를 초기화하는 역할을 함
//  특징 : 1. 클래스 이름과 동일한 이름을 가지고 있음
//  2. 생성자는 일반 메소드와 달리 반환 타입이 없음 (return 키워드 사용 불가)
//  3. 객체 생성 시 new 키워드를 통해서만 호출됨 (객체 외부에서 따로 호출할 수 없음)
//  역할 : 1. new 키워드를 통해서 호출되어 객체를 생성함
//  2. 객체의 필드를 초기화
//  3. 메소드를 실행하여 객체의 필드를 초기화

//  기본 생성자 : 매개변수가 없는 형태의 생성자를 기본 생성자라고 함
//  - 사용자가 생성자를 하나도 선언하지 않았을 경우 컴파일러가 자동으로 기본 생성자를 추가함 (내용이 완전히 비어있는 기본 생성자를 추가함)

//  필드 선언
  int num1;
  int num2;
  int result;

//  메소드 선언
  public void outputResult() {
    System.out.println("결과 : " + result);
  }

  public void sum() {
    result = num1 + num2;
    System.out.println("num1 + num2");
  }

//  필드의 기본값을 설정하는 메소드
  public void defaultSetup() {
    num1 = 0;
    num2 = 0;
    result = 0;
  }
}









