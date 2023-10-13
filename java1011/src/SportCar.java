public class SportCar extends Car {

  @Override
  public void speedUp() {
    speed += 10;
  }

//  부모 클래스에서 상속받은 메소드만 오버라이딩할 수 있음
//  speedDown() 메소드는 부모 클래스에서 접근제한자가 private으로 설정되어 상속받지 못했음
//  speedDown()은 자식 클래스인 SportCar 클래스에서 직접 생성한 메소드가 됨
//  @Override
  private void speedDown() {
    speed -= 10;
  }

//  부모 클래스에서 stop() 메소드를 상속받았기 때문에 사용은 가능함
//  stop() 메소드가 final로 지정되어 있기 때문에 오버라이딩이 불가능함
//  @Override
//  public void stop() {
//    System.out.println("스포츠카를 멈춤");
//    speed = 0;
//  }
}
