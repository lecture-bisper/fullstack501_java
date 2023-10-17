public class Car {
//  부모인 인터페이스 타입의 변수 선언
//  해당 변수에 자식 객체를 저장
  Tire frontLeftTire = new HankookTire();
  Tire frontRightTire = new HankookTire();
  Tire backLeftTire = new HankookTire();
  Tire backRightTire = new HankookTire();

  public void run() {
    frontLeftTire.roll();
    frontRightTire.roll();
    backLeftTire.roll();
    backRightTire.roll();

    System.out.println("-----------------------");
  }
}
