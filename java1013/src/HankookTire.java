public class HankookTire extends Tire{
  public HankookTire(String position, int maxRotation) {
    super(position, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accRotation;

    if (accRotation < maxRotation) {
      System.out.println(position + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("*** " + position + " HankookTire 펑크 ***");
      return false;
    }
  }
}
