package quiz;

public class StaticTest {
  public static void main(String[] args) {
//    Circle 타입의 객체 생성
    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

    boolean res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기가 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기가 다름");
    }

    CircleManager.copy(pizza, waffle);
//    두 객체가 같은지 다시 확인
    res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기 다름");
    }
  }
}
