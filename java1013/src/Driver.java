public class Driver {
//  메소드 drive()는 매개변수로 Bus와 Taxi 클래스의 부모 클래스인 Vehicle 클래스의 변수를 사용하고 있음
//  drive() 메소드의 매개변수에 입력할 수 있는 객체는 Vehicle 클래스의 객체, Bus 클래스의 객체, Taxi 클래스의 객체가 됨
  public void drive(Vehicle vehicle) {
    vehicle.run();
  }
}
