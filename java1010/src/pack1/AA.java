package pack1;

//클래스의 접근제한자는 public, 사용에 제한이 없음
public class AA {
//  필드 선언
  public String publicField = "접근제한자가 public인 필드";
  String defaultField = "접근제한자가 default인 필드";
  private String privateField = "접근제한자가 private인 필드";

//  생성자 선언
  public AA() {

  }

  AA(String text) {

  }

  private AA(int test) {

  }

//  메소드 선언
  public void publicMethod() {
    System.out.println("접근제한자가 public인 메소드");
  }

  void defaultMethod() {
    System.out.println("접근제한자가 default인 메소드");
  }

  private void privateMethod() {
    System.out.println("접근제한자가 private인 메소드");
  }

  public void print() {
    System.out.println(privateField);
    privateMethod();
  }
}






