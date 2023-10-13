// 부모 클래스로 사용되는 Calculator 클래스
public class Calculator {

//  자식 클래스에게 상속되는 메소드
  double areaCircle(double r) {
    System.out.println("Calculator 객체의 areaCircle() 실행");
    return 3.14159 * r * r;
  }

  int multi(int x, int y) {
    System.out.println("Calculator 객체의 multi() 실행");
    return x * y;
  }
}
