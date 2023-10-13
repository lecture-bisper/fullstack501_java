public class CalculatorEx {
  public static void main(String [] args) {
    System.out.println("\n ----- 생성자로 기본값 미설정 ----- \n ");
    Calculator cal1 = new Calculator();

//    필드에 값을 저장하지 않고 연산
    cal1.sum();
    cal1.outputResult();

//    필드에 값을 지정하고 연산
    cal1.num1 = 100;
    cal1.num2 = 200;
    cal1.sum();
    cal1.outputResult();

//    객체의 필드를 모두 기본값으로 되돌림
    cal1.num1 = 0;
    cal1.num2 = 0;
    cal1.result = 0;
    
//    초기화된 필드를 가지고 다시 연산
    cal1.num1 = 1000;
    cal1.num2 = 2000;
    cal1.sum();
    cal1.outputResult();

//    초기화용 메소드로 필드 초기화
    cal1.defaultSetup();
    System.out.println("결과 : " + (cal1.num1 + cal1.num2));

    System.out.println("\n ----- 생성자로 기본값 설정 ----- \n ");
    Calculator2 cal2 = new Calculator2();

    cal2.sum();
    cal2.outputResult();

    cal2.num1 = 100;
    cal2.num2 = 200;
    cal2.sum();
    cal2.outputResult();

    System.out.println("\n ----- 다른 형태의 생성자 사용 시 ----- \n");

    Calculator3 cal3 = new Calculator3(10, 20, 0);
    cal3.sum();
    cal3.outputResult();

  }
}











