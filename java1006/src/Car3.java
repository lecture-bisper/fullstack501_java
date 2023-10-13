public class Car3 {
  String company = "기아자동차";
  String model;
  String color;
  int maxSpeed;

//  this : 클래스 내에서 객체 자기 자신을 의미하는 키워드
//  - 클래스 내에서 자기 자신의 멤버에 접근하기 위한 키워드
//  - 매개변수와 필드의 이름이 같을 경우 컴파일러는 어떤 것이 매개변수이고, 어떤 것이 필드인지 구별하지 못하기 때문에 각각의 필드와 매개변수를 명확하게 하기 위해서 사용함
//  - 매개변수와 필드의 이름이 같지 않을 경우 this 생략 가능

//  this(매개변수) : 하나의 생성자가 생성자 오버로딩으로 만들어진 다른 생성자를 호출하기 위한 명령어
//  - this()는 반드시 생성자의 첫번째 실행줄이어야 함

//  생성자 오버로딩을 통해서 필드를 초기화 할 경우 비슷한 소스코드가 중복됨
//  this()를 사용하여 소스코드의 중복을 제거할 수 있음
  public Car3() {
//    this.model = "모닝";/**/
//    this.color = "오렌지";
//    this.maxSpeed = 170;
//    this("모닝", "오렌지", 170);
    this("모닝");
  }

  public Car3(String model) {
//    this.model = model;
//    this.color = "오렌지";
//    this.maxSpeed = 170;
//    this(model, "오렌지", 170);
    this(model, "오렌지");
  }

  public Car3(String model, String color) {
//    this.model = model;
//    this.color = color;
//    this.maxSpeed = 170;
    this(model, color, 170);
  }

  public Car3(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }


}









