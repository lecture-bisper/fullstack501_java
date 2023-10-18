public class BoxEx {
  public static void main(String[] args) {

    System.out.println("\n----- 제네릭 미사용 -----\n");

    Box box = new Box();

//    Box 클래스에서 데이터를 저장하기 위한 필드가 Object 타입의 변수 이므로 자동 타입 변환으로 모든 데이터를 저장함
    box.set("홍길동");
//    Box 클래스에 저장한 데이터를 출력 시 강제 타입 변환이 필요함
    String name = (String) box.get();
    System.out.println(name);

    box.set(new Apple());
    Apple apple = (Apple) box.get();
    System.out.println(apple);

    int num1 = 100;
    box.set(num1);
    int number = (int) box.get();
    System.out.println(number);

    System.out.println("\n----- 제네릭 사용 -----\n");


    Box2<String> box21 = new Box2<String>();
    box21.set("hello");
    String name21 = box21.get();
    System.out.println(name21);
//    box21.set(1000);

    Box2<Integer> box22 = new Box2<>();
    box22.set(10000);
    int number22 = box22.get();
    System.out.println(number22);
//    box22.set("아이유");

    Box2<Apple> box23 = new Box2<>();
    box23.set(new Apple());
    Apple apple23 = box23.get();
    System.out.println(apple23);

  }
}












