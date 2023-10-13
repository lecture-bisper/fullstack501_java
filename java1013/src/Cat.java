//추상 클래스 Animal을 상속받아 구현한 Cat 클래스
public class Cat extends Animal{

//  상속받은 필드 kind와 메소드 breathe()가 존재
  public Cat() {
    this.kind = "포유류";
  }

//  상속받은 추상 메소드를 오버라이딩을 통해서 구현함
//  상속받은 추상 메소드를 오버라이딩하여 구현하지 않을 경우 해당 자식 클래스도 추상 클래스가 되어야 함
  @Override
  public void sound() {
    System.out.println("야옹");
  }
}
