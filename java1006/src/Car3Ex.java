public class Car3Ex {
  public static void main(String[] args) {
    System.out.println("\n ----- 기본 생성자 사용 ----- \n");
    Car3 c1 = new Car3();
    System.out.println("c1.company : " + c1.company);
    System.out.println("c1.model : " + c1.model);
    System.out.println("c1.color : " + c1.color);
    System.out.println("c1.maxSpeed : " + c1.maxSpeed);

    System.out.println("\n ----- 매개변수 1개인 생성자 사용 ----- \n");
    Car3 c2 = new Car3("K3");
    System.out.println("c2.company : " + c2.company);
    System.out.println("c2.model : " + c2.model);
    System.out.println("c2.color : " + c2.color);
    System.out.println("c2.maxSpeed : " + c2.maxSpeed);


    System.out.println("\n ----- 매개변수 2개인 생성자 사용 ----- \n");
    Car3 c3 = new Car3("K5", "흰색");
    System.out.println("c3.company : " + c3.company);
    System.out.println("c3.model : " + c3.model);
    System.out.println("c3.color : " + c3.color);
    System.out.println("c3.maxSpeed : " + c3.maxSpeed);

    System.out.println("\n ----- 매개변수 3개인 생성자 사용 ----- \n");
    Car3 c4 = new Car3("K7", "검정색", 200);
    System.out.println("c4.company : " + c4.company);
    System.out.println("c4.model : " + c4.model);
    System.out.println("c4.color : " + c4.color);
    System.out.println("c4.maxSpeed : " + c4.maxSpeed);
  }
}
