public class CarEx {
  public static void main(String[] args) {
    System.out.println("----- Getter/Setter 미사용 -----\n");

    Car1 c1 = new Car1();

//    속도 변경
    c1.speed = -50;
    System.out.println("현재 속도 : " + c1.speed);

    c1.speed = 50;

    System.out.println("현재 속도 : " + c1.speed);

//    멈춤
    c1.stop = true;
    c1.speed = 0;
    System.out.println("차량 멈춤 : " + c1.stop);
    System.out.println("현재 속도 : " + c1.speed);

    System.out.println("\n----- Getter/Setter 사용 -----\n");

    Car2 c2 = new Car2();

//    잘못된 속도 변경
    c2.setSpeed(-50);
    System.out.println("현재 속도 : " + c2.getSpeed());

//    올바른 속도 변경
    c2.setSpeed(50);
    System.out.println("현재 속도 : " + c2.getSpeed());

//    차량 멈춤
    if (c2.isStop() != true) {
      c2.setStop(true);
    }

    System.out.println("현재 속도 : " + c2.getSpeed());
  }
}
















