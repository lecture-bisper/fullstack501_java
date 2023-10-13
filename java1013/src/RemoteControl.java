public interface RemoteControl {
//  인터페이스 : 추상 클래스와 비슷한 기능 가지고 있는 데이터 타입
//  인터페이스는 자신의 객체를 생성할 수 없음
//  자식 클래스가 상속받아서 객체를 생성해야 함
//  인터페이스는 선언 시 키워드가 'interface' 임
//  인터페이스를 상속받을 경우 'implements' 키워드를 사용함
//  인터페이스는 다중 상속이 가능함
//  인터페이스의 멤버는 정적 필드, 정적 메소드, 추상 메소드, 디폴트 메소드로 구성되어 있음

//  인터페이스의 정적 필드
//  - 인터페이스의 멤버 필드로 사용되고, 기본값으로 public static final이 지정되어 있음 (생략해도 상관없음)
//  인터페이스명.필드명 으로 직접 접근이 가능함
//  정적 타입이기 때문에 데이터를 공유함
//  상수이기 때문에 static 초기화 블록 사용 불가

  int MAX_VOLUME = 10;
  public static int MIN_VOLUME = 0;
  static int CURR_VOLUME = 5;

//  인터페이스의 추상 메소드
//  - 추상 클래스의 추상 메소드와 동일한 추상 메소드
//  - 자식 클래스에서 추상 메소드를 상속받아 오버라이딩을 통해서 구현하여 사용해야 함
//  - public abstract 가 기본값이기 때문에 생략해도 자동으로 추가 됨

  public abstract void turnOn(); // 접근제한자, abstract 를 모두 입력
  public void turnOff(); // abstract 키워드를 생략
  void setVolume(int volume); // 접근제한자, abstract 를 모두 생략

//  디폴트 메소드
//  - 자바 8에서 추가된 인터페이스의 멤버
//  - 일반 메소드와 동일한 메소드 (코드 블록이 존재함)
//  - default 키워드는 필수로 붙여야 함
//  - 기본적으로 public 접근제한자를 사용함 (생략해도 자동 추가)
//  - 인터페이스의 기능 확장을 위해서 추가 됨

  public default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 처리 합니다.");
    }
    else {
      System.out.println("무음 해제 합니다.");
    }
  }

//  정적 메소드
//  - 자바 8에서 추가된 인터페이스의 멤버
//  - 기본적으로 public 접근제한자를 사용함 (생략해도 자동 추가)
  public static void changeBattery() {
    System.out.println("건전지를 교환합니다.");
  }
}













