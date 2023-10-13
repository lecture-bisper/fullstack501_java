public class SportCarEx {
  public static void main(String[] args) {
    Car car = new Car();
    car.speed = 10;
    car.speedUp();
    car.speedUp();
    System.out.println("현재 속도 : " + car.speed);
    car.stop();

    System.out.println("-----------------");

    SportCar sportCar = new SportCar();
    System.out.println("현재 속도 : " + sportCar.speed);
    sportCar.speedUp();
    sportCar.speedUp();
    System.out.println("현재 속도 : " + sportCar.speed);
    sportCar.stop();
  }
}
