package quiz;

public class Rect {
//  필드 선언
  private int width;
  private int height;
  
//  너비와 높이를 매개변수로 가지는 생성자 선언
  public Rect(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
//  필드 width 와 height를 서로 곱하여 사각형의 넓이를 구하는 메소드
  public int getArea() {
    return width * height;
  }
}
