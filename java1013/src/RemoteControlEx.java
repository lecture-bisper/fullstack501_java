public class RemoteControlEx {
  public static void main(String[] args) {
//    인터페이스도 추상 클래스와 같이 객체를 생성할 수 없음
//    인터페이스도 추상 클래스와 같이 변수 생성은 가능함
    RemoteControl rc;

//    사용하는 방식은 동일하지만 부모 타입의 변수에 저장된 객체에 따라 출력되는 결과가 달라짐
    rc = new Audio();
    rc.turnOn();
    rc.setVolume(10);
    rc.setMute(true);
    rc.turnOff();

    rc = new TV();
    rc.turnOn();
    rc.setVolume(10);
    rc.setMute(true);
    rc.setMute(false);
    rc.setVolume(5);
    rc.turnOff();
  }
}
