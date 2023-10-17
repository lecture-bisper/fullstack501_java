//부모 인터페이스 InterA, InterB를 상속받는 자식 인터페이스 InterC 선언
//인터페이스는 다중 상속을 지원함
public interface InterC extends InterA, InterB{
  
//  InterA와 InterB에서 상속받은 추상 메소드 methodA, methodB가 존재함
  
//  인터페이스 InterC의 전용 멤버인 추상 메소드 선언
  public abstract void methodC();
}
