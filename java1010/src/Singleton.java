// 싱글톤 디자인 패턴으로 만든 클래스
public class Singleton {
//  자기 자신 클래스(Singleton) 타입으로 변수 생성
//  필드에 private 접근 제한자를 사용하여 외부에서 접근 불가
//  static을 사용하여 객체 생성없이 클래스를 통해서 접근 가능
//  클래스 내부에서는 접근제한자와 상관없이 객체 생성 가능함
  private static Singleton singleton = new Singleton();

//  생성자에 private 접근제한자 사용
//  생성자를 호출할 수 없어서 객체 생성이 불가능함
  private Singleton() {

  }

//  getInstance() 메소드의 접근제한자를 public으로 설정하여 외부에서 해당 메소드를 사용할 수 있음
//  반환 타입이 Singleton 타입이므로 Singleton 클래스 내부에서 생성한 Singleton 클래스 타입의 필드 singleton을 외부에서 사용할 수 있게 됨
//  한번 생성한 것을 계속하는 것이기 때문에 모두 같은 주소를 가지고 있음
  public static Singleton getInstance() {
    return singleton;
  }
}
