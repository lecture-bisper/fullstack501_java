public class KumhoTire extends Tire{
  public KumhoTire(String position, int maxRotation) {
    super(position, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accRotation;

    if (accRotation < maxRotation) {
      System.out.println(position + " KumhoTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("*** " + position + " KumhoTire 펑크 ***");
      return false;
    }
  }
}
