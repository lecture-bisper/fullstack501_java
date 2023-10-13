public class Calculator3 {
//  필드 선언
  int num1;
  int num2;
  int result;
  
//  생성자 선언
//  기본 생성자를 선언하지 않을 경우 컴파일러가 자동으로 기본 생성자를 추가함
//  사용자가 생성자를 1개라도 추가할 경우 컴파일러는 기본 생성자를 추가하지 않음
  public Calculator3(int setNum1, int setNum2, int setResult) {
    num1 = setNum1;
    num2 = setNum2;
    result = setResult;
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
