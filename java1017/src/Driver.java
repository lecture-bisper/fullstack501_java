public class Driver {

//  매개변수로 Vehicle 인터페이스 타입을 사용
//  Vehicle 인터페이스를 상속받은 객체는 모두 사용 할 수 있음
  public void drive(Vehicle vehicle) {
//    instanceof 연산자를 사용하여 지정한 변수의 원본이 지정한 클래스 타입인지 확인
    if (vehicle instanceof Bus) {
      Bus bus = (Bus) vehicle;
      bus.checkFare();
    }
    vehicle.run();
  }
}
