//인터페이스 RemoteControl, Searchable 을 동시에 상속받은 자식 클래스
public class SmartTV implements RemoteControl, Searchable {
  private int volume;

//  부모인 RemoteControl과 Searchable 에서 상속해 준 추상 메소드를 모두 오버라이딩해야 함
  @Override
  public void turnOn() {
    System.out.println("스마트 TV 전원을 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 TV 전원을 끕니다.");
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
    System.out.println("현재 스마트 TV 볼륨 : " + volume);
  }

//  Searchable 인터페이스에서 상속받은 추상 메소드
  @Override
  public void search(String url) {
    System.out.println(url + "사이트를 검색합니다.");
  }
}
