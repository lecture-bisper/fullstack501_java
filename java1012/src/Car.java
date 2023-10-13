// Tire 클래스를 부품 클래스로 사용하는 클래스
public class Car {
//  클래스 Car와 클래스 Tire는 포함관계임
//  Tire 클래스 타입의 객체 4개 생성
  Tire frontLeftTire = new Tire("앞왼쪽", 6);
  Tire frontRightTire = new Tire("앞오른쪽", 2);
  Tire backLeftTire = new Tire("뒤왼쪽", 3);
  Tire backRightTire = new Tire("뒤오른쪽", 4);

//  run() 메소드 호출 시
  int run() {
    System.out.println("[자동차가 달립니다.]");

    if (frontLeftTire.roll() == false) {
      stop();
      return 1;
    }

    if (frontRightTire.roll() == false) {
      stop();
      return 2;
    }

    if (backLeftTire.roll() == false) {
      stop();
      return 3;
    }

    if (backRightTire.roll() == false) {
      stop();
      return 4;
    }

    return 0;
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }
}
