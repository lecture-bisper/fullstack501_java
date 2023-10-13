// 부모 클래스인 Tire 클래스를 상속
public class HankookTire extends Tire{

//  부모 클래스인 Tire 클래스의 생성자가 매개변수를 2개 가지는 생성자밖에 없음
  public HankookTire(String location, int maxRotation) {
//    자식 클래스의 생성자에서 부모 클래스의 생성자 호출
    super(location, maxRotation);
  }

//  부모 클래스에서 상속받은 메소드를 오버라이딩
  @Override
  public boolean roll() {
    ++accumulatedRotation;

    if (accumulatedRotation < maxRotation) {
      System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " HankookTire 펑크 *****");
      return false;
    }
  }
}
