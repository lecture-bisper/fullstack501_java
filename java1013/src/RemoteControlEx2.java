public class RemoteControlEx2 {
  public static void main(String[] args) {

//    익명 구현 객체
//    인터페이스의 모든 추상 메소드를 구현해야 함
    RemoteControl rc = new RemoteControl() {
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
        System.out.println("현재 볼륨 : " + this.volume);
      }
    };
  }
}
