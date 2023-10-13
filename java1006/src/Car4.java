public class Car4 {
  String model;
  int speed;

  public Car4(String model) {
    this.model = model;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void run() {
    for (int i = 10; i <= 50; i += 10) {
//      this 키워드를 생략 가능하지만 명확하게 하기 위해서 this를 추가함
      this.setSpeed(i);
      System.out.println(this.model + "가 달립니다.(속도 : " + this.speed + "km/h)");
    }
  }
}
