//사용자 정의 예외 클래스 생성, 예외 클래스 중 최상위 클래스인 Exception를 상속받음
public class BalanceInsfficientException extends Exception {

//  생성자 선언
  public BalanceInsfficientException() {}
//  예외 메시지를 받기 위한 생성자 선언
  public BalanceInsfficientException(String message) {
    super(message);
  }
}
