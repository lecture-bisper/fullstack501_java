public class Calculator2 {
//  필드 선언
  int num1;
  int num2;
  int result;

//  생성자 선언
  public Calculator2() {
//    생성자를 사용한 기본값 설정
//    num1 = 10;
//    num2 = 20;
//    result = 0;
    defaultSetup();
  }

  //  메소드 선언
  public void outputResult() {
    System.out.println("결과 : " + result);
  }

  public void sum() {
    result = num1 + num2;
    System.out.println("num1 + num2");
  }

  public void defaultSetup() {
    num1 = 10;
    num2 = 20;
    result = 0;
  }
}
