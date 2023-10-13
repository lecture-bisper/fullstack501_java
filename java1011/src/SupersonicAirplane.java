//자식 클래스, Airplane 클래스를 상속받음
public class SupersonicAirplane extends Airplane {
//  상수 선언
  public static final int NORMAL = 1;
  public static final int SUPERSONIC = 2;

  public int flyMode = NORMAL;

//  상속받은 메소드는 takeOff(), land(), fly() 이지만, takeOff(), land()는 상속받은 그대로 사용
  
//  fly() 메소드는 오버라이딩을 통해서 내용 수정
  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속 비행합니다.");
    }
    else {
//      부모 클래스의 멤버인 fly() 메소드 호출
      super.fly();
    }
  }
}
