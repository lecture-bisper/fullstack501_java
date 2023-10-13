public class Calculator {
//  자바는 모두 클래스로 구성되어 있기 때문에 함수가 존재하지 않음
//  함수 대신 클래스의 멤버인 메소드만 존재함

//  메소드 선언
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double divide(int x, int y) {
    double result = x / y;
    return result;
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }
}
