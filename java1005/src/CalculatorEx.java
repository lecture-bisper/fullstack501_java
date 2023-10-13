public class CalculatorEx {
  public static void main(String[] args) {
//    메소드 : 특정 목적에 따라 실행되는 소스코드들을 하나의 이름으로 묶어 놓은 것
//    - 함수와 동일한 기능상 동일함
//    - 혼자서 동작할 경우 함수라고 하고, 클래스에 포함되어 있으면 메소드라고 함

//    Calculator 클래스 타입의 변수 선언
//    new 키워드와 Calculator 클래스의 생성자를 호출하여 객체 생성
//    생성된 객체의 주소를 Calculator 클래스 타입의 변수 myCalc에 저장
    Calculator myCalc = new Calculator();
//    메소드 호출
//    필드 사용 방식과 동일함, ()가 붙어 있으면 메소드
    myCalc.powerOn();

//    일반 int 타입의 변수 선언
//    plus 메소드 호출
    int result1 = myCalc.plus(5, 6);
    System.out.println("result1 : " + result1);

    byte x = 10;
    byte y = 4;

    double result2 = myCalc.divide(x, y);
    System.out.println("result2 : " + result2);

    myCalc.powerOff();
  }
}
