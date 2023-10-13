// 추상 클래스로 선언한 Phone 클래스
// 클래스 abstract 키워드 사용 시 추상 클래스가 됨
public abstract class Phone {

  public String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("휴대폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("휴대폰 전원을 끕니다.");
  }
}
