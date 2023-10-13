public class Car2 {
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

//  생성자를 여러개 사용하는 것을 생성자 오버로딩이라고 함
  public Car2() {

  }

  public Car2(String model) {
    this.model = model;
  }

  public Car2(String m, String c) {
    model = m;
    color = c;
  }

  public Car2(String m, String c, int ms) {
    model = m;
    color = c;
    maxSpeed = ms;
  }

}










