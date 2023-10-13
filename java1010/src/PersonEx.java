public class PersonEx {
  public static void main(String[] args) {
    Person p1 = new Person("123456-1234567", "홍길동");

    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

//    필드의 값 수정
//    nation, ssn 필드는 final 필드이기 때문에 수정 불가
//    p1.nation = "usa";
//    p1.ssn = "987654-9876543";
    p1.name = "gildong hong";

    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);
  }
}
