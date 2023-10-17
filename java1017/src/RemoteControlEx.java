public class RemoteControlEx {
  public static void main(String[] args) {
//    인터페이스 타입의 변수 선언
//    인터페이스는 객체 생성이 불가능
    RemoteControl rc;

//    다형성을 통해서 자식 타입의 객체를 부모 타입의 변수에 저장하여 사용
    rc = new TV();
    rc.turnOn();
    rc.setVolume(10);
    rc.setMute(false);
    rc.turnOff();

    rc = new Audio();
    rc.turnOn();
    rc.setVolume(5);
    rc.setMute(true);
    rc.turnOff();

    RemoteControl.changeBattery();
  }
}
