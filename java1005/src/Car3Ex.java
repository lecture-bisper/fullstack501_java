public class Car3Ex {
  public static void main(String[] args) {
//    클래스 Car3 타입의 객체 myCar 생성
    Car3 myCar = new Car3();

//    setGas() 메소드 호출
    myCar.setGas(5);

    boolean gasState = myCar.isLeftGas();

    if (gasState == true) {
      System.out.println("출발 합니다.");
      myCar.run();
    }

//    현재 gas 상태를 true/false로 확인
    if (myCar.isLeftGas() == true) {
      System.out.println("gas를 주입할 필요가 없습니다.");
    }
    else {
      System.out.println("gas를 주입하세요");
    }


  }
}









