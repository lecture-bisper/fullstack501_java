public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.run();

    myCar.frontRightTire = new KumhoTire();
    myCar.frontLeftTire = new KumhoTire();

    myCar.run();

    System.out.println("\n ------------------------ \n");

    Car2 car = new Car2();

    car.run();

    car.tires[0] = new KumhoTire();
    car.tires[1] = new KumhoTire();

    car.run();
  }
}
