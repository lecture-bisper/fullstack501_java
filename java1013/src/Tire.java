public class Tire {
  public int maxRotation;
  public int accRotation;
  public String position;

  public Tire(String position, int maxRotation) {
    this.position = position;
    this.maxRotation = maxRotation;
  }

  public boolean roll() {
    ++accRotation;

    if (accRotation < maxRotation) {
      System.out.println(position + " Tire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("*** " + position + "Tire 펑크 ***");
      return false;
    }
  }
}






