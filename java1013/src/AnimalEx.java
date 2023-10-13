public class AnimalEx {
  public static void main(String[] args) {
//    추상 클래스인 Animal 클래스를 상속받아 구현한 Dog, Cat 클래스의 객체 생성
    Dog dog = new Dog();
    Cat cat = new Cat();
//    상속받은 추상 메소드를 구현하여 실행
    dog.sound();
    cat.sound();

    System.out.println("---------------------");

//    추상 클래스로 객체는 생성할 수 없지만 추상 클래스 타입으로 변수 생성은 가능함
    Animal animal = null;
//    다형성을 활용하여 부모인 추상 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장하여 부모의 멤버를 호출하면 저장된 자식 객체를 사용할 수 있음
    animal = dog;
    animal.sound();
    animal = new Cat();
    animal.sound();

    System.out.println("---------------------");

//    강제 타입 변환을 통해서 원본이 자식 클래스 타입인 객체를 다시 자식 클래스 타입의 변수에 저장할 수 있음
    Cat cat2 = (Cat) animal;
    cat2.sound();

    System.out.println("---------------------");

    animalSound(new Dog());
    animalSound(cat2);
  }

  public static void animalSound(Animal animal) {
    animal.sound();
  }
}










