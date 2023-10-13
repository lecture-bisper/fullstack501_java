public class DriverEx {

  public static void drive(Vehicle v, String name) {
    v.run();
    System.out.println("운전자는 " + name + "입니다.");
  }

  public static void main(String[] args) {
    Bus b = new Bus();
    Taxi t = new Taxi();
    Vehicle v = new Vehicle();

    drive(b, "홍길동");
    drive(t, "아이유");
    drive(v, "유재석");

//    Driver driver = new Driver();
//
//    Bus bus = new Bus();
//    Taxi taxi = new Taxi();
//
//    driver.drive(bus);
//    driver.drive(taxi);


////    일반적으로 객체 사용 시
//    Vehicle v = new Vehicle();
//    v.run();
//
//    Bus b = new Bus();
//    b.run();
//
//    Taxi t = new Taxi();
//    t.run();
//
////    다형성을 사용 시
//    v.run();
//    v = b;
//    v.run();
//    v = t;
//    v.run();


  }
}











