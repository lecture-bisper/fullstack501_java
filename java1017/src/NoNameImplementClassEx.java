import java.rmi.Remote;

public class NoNameImplementClassEx {
  public static void main(String[] args) {
//    일반적인 인터페이스 사용법
    System.out.println("----- 일반적인 인터페이스 사용 -----");

    RemoteControl rc = new Audio();
    TV tv = new TV();
    rc = tv;

//    익명 구현객체 사용하기
    System.out.println("\n ----- 익명 구현 객체 사용 -----");
//    인터페이스 타입의 변수에 new 키워드와 기본 생성자를 호출
//    바로 코드블록을 사용하여 인터페이스의 멤버 중 모든 추상 메소드를 구현
//    일반 필드와 일반 메소드 선언도 가능하지만 내부 사용으로 생성해야 함
    RemoteControl rc2 = new RemoteControl() {
      private int volume;

      @Override
      public void turnOn() {
        System.out.println("전원을 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("전원을 끕니다.");
      }

      @Override
      public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
          this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
          this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
          this.volume = volume;
        }
        System.out.println("현재 볼륨은 " + this.volume);
      }
    };
  }
}
