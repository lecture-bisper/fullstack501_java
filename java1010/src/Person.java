public class Person {
//  final을 사용한 필드, 선언과 동시에 데이터 입력
  final String nation = "Korea";
//  final을 사용한 필드
  final String ssn;
//  일반 필드
  String name;

  public Person(String ssn, String name) {
//    final 필드에 생성자를 통해서 초기값 설정
    this.ssn = ssn;
    this.name = name;
  }
}
