public class DriverEx {
  public static void main(String [] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    driver.drive(bus);
    driver.drive(taxi);

    System.out.println("\n --------- 강제 타입 변환 --------- \n");

//    부모 인터페이스 타입의 변수에 자식 클래스 타입의 객체 저장
    Vehicle vehicle = new Bus();
//    부모 인터페이스의 멤버인 run() 실행
    vehicle.run();
//    checkFare() 메소드는 자식 클래스 타입 전용 멤버이기 때문에 부모 인터페이스 타입의 변수에서 호출할 수 없음
//    vehicle.checkFare();

//    원본이 자식 클래스인 Bus 타입의 객체를 부모 타입의 변수에 저장한 것을 다시 자식 클래스 타입의 변수에 강제 타입 변환으로 저장함
    Bus bus2 = (Bus) vehicle;
//    부모 타입의 멤버인 run() 호출 가능
    bus2.run();
//    자식 타입의 전용 멤버인 checkFare() 사용 가능
    bus.checkFare();


    System.out.println("\n ----- instanceof ----- \n");

//    해당 클래스 사용을 위해서 Driver 클래스 타입의 객체 생성
    Driver driver3 = new Driver();

//    Bus, Taxi 클래스 타입의 객체 생성
    Bus bus3 = new Bus();
    Taxi taxi3 = new Taxi();

//    drive() 메소드는 매개변수로 Vehicle 인터페이스 타입을 사용하므로 매개변수로 Vehicle 인터페이스를 구현한 Bus, Taxi 클래스 타입의 객체를 사용할 수 있음
    driver3.drive(taxi3);
    driver3.drive(bus3);
  }
}





