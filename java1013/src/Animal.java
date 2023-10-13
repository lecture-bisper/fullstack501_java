// 추상 클래스로 선언한 Animal 클래스
public abstract class Animal {
//  일반적인 필드
  public String kind;

//  일반적인 메소드
  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

//  추상 메소드
//  메소드의 선언부만 존재
//  메소드의 실행부인 코드블록이 존재하지 않음
//  반드시 자식 클래스에서 오버라이딩을 통해 구현해야 함
//  추상 메소드가 존재 시 해당 클래스는 반드시 추상 클래스로 선언해야 함
  public abstract void sound();
}






