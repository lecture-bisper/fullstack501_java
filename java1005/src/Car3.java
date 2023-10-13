public class Car3 {
//  필드 선언
  int gas;

//  메소드 선언
//  매개변수로 int 타입의 데이터를 받아서 필드에 저장
  void setGas(int gas) {
    this.gas = gas;
  }

//  현재 gas 필드 값을 확인하여 true/false를 반환
  boolean isLeftGas() {
    if (gas == 0) {
      System.out.println("gas 가 없습니다.");
      return false;
    }

    System.out.println("gas가 있습니다.");
    return true;
  }

//  while문을 통해서 무한 반복하면서 필드 gas의 값을 화면에 출력하고 gas의 값을 감소 시킴
  void run() {
//    while문의 조건식 자체가 true이므로 결과도 true가 되어 무한 반복으로 동작함
    while (true) {
//      필드 gas의 현재 값이 0보다 큰지 작은지 확인
      if (gas > 0) {
//        gas가 0보다 클 경우 gas의 현재값 출력 후 gas의 값 1 감소
        System.out.println("달립니다. (gas잔량 : " + gas + ")");
        gas -= 1;
      }
      else {
//        gas가 0보다 작거나 같을 경우 현재값 출력 후 메소드 종료
        System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
//        return 키워드 뒤에 값이 없으므로 결과값을 반환하지 못하고 현재 메소드만 종료함
//        메소드가 종료되면 현재 메소드 내부에서 동작하는 while문도 자동으로 종료됨
        return;
      }
    }
  }
}










