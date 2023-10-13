// 실행용 클래스로 선언
public class CarEx {
//  실행용 클래스이므로 main 메소드가 존재함
  public static void main(String[] args) {

//    라이브러리 클래스인 Car 클래스를 사용하여 객체 생성
//    Car 클래스 타입의 변수 myCar를 선언과 동시에 new 키워드를 실행하여 Car 클래스의 생성자를 호출하고 메모리에 등록된 객체의 주소를 받아와서 Car 클래스 타입의 변수 myCar에 주소를 저장
    Car myCar;
//    new 키워드를 사용하여 객체를 생성하지 않았기 때문에 Car 클래스에서 제공하는 필드에 접근할 수 없음
//    System.out.println(myCar.company);
    myCar = new Car();

//    생성된 Car 클래스 타입의 객체 myCar의 필드값을 출력
    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색깔 :" + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

//    기존에 설정된 필드값을 수정
    myCar.speed = 60;
    System.out.println("수정된 속도 : " + myCar.speed);

    System.out.println("\n ----- 필드 사용 ----- \n");
    System.out.println("일반 변수 사용 시 ----- \n");
    String company = "KGM";
    String model; // 변수 초기화 안함
    int maxSpeed = 250;
    int speed; // 변수 초기화 안함

    System.out.println(company);
//    System.out.println(model); // 초기화되지 않은 변수 사용 시 오류 발생
    System.out.println(maxSpeed);
//    System.out.println(speed); // 초기화되지 않은 변수 사용 시 오류 발생

    System.out.println("필드 사용 시 ----- \n");

    Car myCar2 = new Car();
    System.out.println(myCar2.company);
    System.out.println(myCar2.model);
    System.out.println(myCar2.maxSpeed);
    System.out.println(myCar2.speed);

    Car2 myCar3 = new Car2();
    System.out.println(myCar3.speed);
    myCar3.method();
    System.out.println(myCar3.speed);

    System.out.println("\n --------------------- \n");
//    같은 클래스를 사용하여 new 키워드로 객체를 생성하더라도 서로 다른 메모리 주소를 사용함
//    각각의 객체끼리는 필드의 데이터를 공유하지 않음
//    객체 생성 시 서로 메모리가 달라지기 때문에 서로 완전히 다른 영역에 존재함
//    각각의 '객체명.필드명' 형태로 사용해야 데이터를 정확히 저장하고 사용할 수 있음

//    동일한 클래스 Car2 타입의 객체를 2개 선언
    Car2 c1 = new Car2();
    Car2 c2 = new Car2();

    System.out.println("\n ----- 각각의 필드 값 출력 -----");
    System.out.println("c1의 speed : " + c1.speed);
    System.out.println("c2의 speed : " + c2.speed);

    System.out.println("\n ----- 각각의 필드 값 수정 -----\n ");
    c1.speed = 100;
    c2.speed = 200;
    System.out.println("c1의 speed : " + c1.speed);
    System.out.println("c2의 speed : " + c2.speed);

  }
}










