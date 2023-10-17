public class Car2 {
  Tire[] tires = {
      new HankookTire(),
      new HankookTire(),
      new HankookTire(),
      new HankookTire()
  };
//  Tire[] tires = new Tire[4];
//
//  public Car2() {
//    tires[0] = new HankookTire();
//    tires[1] = new HankookTire();
//    tires[2] = new HankookTire();
//    tires[3] = new HankookTire();
//  }

  public void run() {
    for (Tire tire : tires) {
      tire.roll();
    }
  }
}
