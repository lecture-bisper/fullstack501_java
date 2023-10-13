// 추상 클래스 Phone 을 상속받은 SmartPhone 클래스
public class SmartPhone extends Phone{

  public SmartPhone(String owner) {
    super(owner);
  }

  public void internetSearch() {
    System.out.println("인터넷을 검색합니다.");
  }
}
