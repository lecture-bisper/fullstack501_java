public class CarEx {
  public static void main(String[] args) {
    Car car = new Car();

    for (int i = 0; i <= 5; i++) {
//      Car 클래스의 멤버 중 run() 메소드를 실행하여 각 위치의 타이어를 1회전 시키고 펑크가 발생한 위치를 받아옴
      int pbPosition = car.run();

      if (pbPosition != 0) {
        System.out.println(car.tires[pbPosition - 1].position + " Hankook Tire로 교체");
        car.tires[pbPosition - 1] = new HankookTire(car.tires[pbPosition - 1].position, 15);
      }
      System.out.println("------------------------------");
    }
  }
}
