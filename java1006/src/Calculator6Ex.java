public class Calculator6Ex {
  public static void main(String[] args) {
//    정적 멤버 : 클래스의 멤버 중에서 static 키워드를 사용한 멤버
//    - 필드, 메소드에 static 키워드를 사용하여 정적 멤버로 선언
//    - 객체 생성 없이 클래스를 통해서 직접 접근이 가능
//    - 데이터를 서로 공유하고 있음
    
//    정적 멤버를 활용
//    정적 멤버는 클래스이름을 통하여 접근할 수 있음
    double result1 = 10 * 10 * Calculator6.pi;
    int result2 = Calculator6.plus(10, 5);
    int result3 = Calculator6.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result2 : " + result3);

    System.out.println("\n ----- 정적 멤버와 인스턴스 멤버의 차이 -----\n");

    Numbers num1 = new Numbers();
    Numbers num2 = new Numbers();

    num1.instanceNum1 = 10;
    num1.instanceNum2 = 20;

    num2.instanceNum1 = 1000;
    num2.instanceNum2 = 2000;

    System.out.println("num1의 필드 값 : " + num1.instanceNum1);
    System.out.println("num1의 필드 값 : " + num1.instanceNum2);
    System.out.println("num2의 필드 값 : " + num2.instanceNum1);
    System.out.println("num2의 필드 값 : " + num2.instanceNum2);

    Math.random();
    num1.staticNum1 = 100;
    num1.staticNum2 = 200;

    num2.staticNum1 = 30000;
    num2.staticNum2 = 40000;

    System.out.println("num1의 정적 필드 값 : " + num1.staticNum1);
    System.out.println("num1의 정적 필드 값 : " + num1.staticNum2);
    System.out.println("num2의 정적 필드 값 : " + num2.staticNum1);
    System.out.println("num2의 정적 필드 값 : " + num2.staticNum2);

    System.out.println("Numbers 정적 필드 값 : " + Numbers.staticNum1);
    System.out.println("Numbers 정적 필드 값 : " + Numbers.staticNum2);


  }
}
