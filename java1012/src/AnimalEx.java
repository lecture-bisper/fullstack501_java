import java.awt.*;

public class AnimalEx {
  public static void main(String[] args) {

//    부모 클래스인 Animal 클래스 타입의 객체 생성
    Animal animal = new Animal();
    
//    자식 클래스 타입의 객체 생성
    Cat cat = new Cat();
    Dog dog = new Dog();

//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장
//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장 시 자동 타입 변환이 발생함
    animal = cat;
    animal = dog;
    
//    자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 저장하면 오류 발생
//    cat = animal;
//    자식 클래스인 Cat 클래스 타입의 변수에 같은 자식 클래스인 Dog 클래스 타입의 객체를 저장하면 오류 발생
//    cat = dog;
  }
}
