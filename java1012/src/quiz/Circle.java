package quiz;

public class Circle {
//  접근제한자가 private인 필드, 외부에서 접근 불가, Getter/Setter을 활용하여 접근해야 함
  private int radius;

//  같은 멤버이기 때문에 사용 가능
  public Circle(int radius) {
    this.radius = radius;
  }

//  같은 멤버이기 때문에 사용 가능, 외부에서 사용할 수 있도록 우회 접근을 대신해 줌
  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}
