package quiz;

public class Box {
  private int width;
  private int height;
  private char fillChar;

  public Box() {
    this(10, 1);
  }
  
  public Box(int width, int height) {
    this.width = width; // this. 사용
    this.height = height; // this. 사용
  }

  public void draw() {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(fillChar);
      }
      System.out.println();
    }
  }

  public void fill(char c) {
    this.fillChar = c;
  }

  public static void main(String[] args) {
    Box a = new Box();
    Box b = new Box(20, 3);
    a.fill('*');
    b.fill('%');
    a.draw();
    b.draw();
  }
}









