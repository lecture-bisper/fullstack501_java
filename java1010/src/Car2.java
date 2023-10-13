public class Car2 {
//  필드의 접근제한자를 private으로 설정
//  해당 필드에 외부에서 직접적으로 접근할 수 없음
  private int speed;
  private boolean stop;

//  필드 speed에 대해서 Getter 선언
//  getSpeed() 메소드는 Car2 의 멤버이므로 같은 Car2의 멤버인 speed 필드에 접근가능
  public int getSpeed() {
    return speed;
  }

//  필드 speed에 대해서 Setter 선언
//  setSpeed() 메소드는 Car2의 멤버이므로 같은 Car2의 멤버인 speed 필드에 접근가능
  public void setSpeed(int speed) {
//    필드 사용 시 매개변수로 받은 값을 확인하고 필드를 사용함
    if (speed < 0) {
      this.speed = 0;
    }
    else {
      this.speed = speed;
    }
  }

  public boolean isStop() {
    return stop;
  }

//  Setter를 실행하여 한번 호출에 여러가지 작업을 진행할 수 있음
  public void setStop(boolean stop) {
    this.speed = 0;
    this.stop = stop;
  }
}







