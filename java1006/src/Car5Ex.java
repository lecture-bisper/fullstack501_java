public class Car5Ex {

  int speed;

  public void run() {
    System.out.println(speed + "으로 달립니다.");
  }

  public void run2() {
    System.out.println("자동차가 달립니다.");
  }

  public static void run3() {
    System.out.println("자동차가 달립니다.");
  }

  public static void main(String[] args) {

//    객체를 생성
    Car5Ex myCar = new Car5Ex();
//    인스턴스 멤버를 호출
    myCar.speed = 60;
    myCar.run();
    myCar.run2();
//    인스턴스 멤버가 정적 멤버를 사용하는 것에는 문제가 없음
    myCar.run3();

//    run2() 는 인스턴스 메소드임
//    정적 멤버인 main() 메소드에서 인스턴스 메소드인 run2()를 직접 호출할 수 없음
//    run2();
    run3();
  }


}
