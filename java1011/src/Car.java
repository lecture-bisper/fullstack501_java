// 부모 클래스
public class Car {
//  필드 선언
  public int speed;

//  메소드 선언
  public void speedUp() {
    speed += 1;
  }

  private void speedDown() {
    speed -= 1;
  }

//  final 메소드로 선언
//  해당 메소드는 오버라이딩 불가
  public final void stop() {
    System.out.println("차를 멈춥니다.");
    speed = 0;
  }
}
