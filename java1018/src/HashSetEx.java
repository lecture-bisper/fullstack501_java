import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
  public static void main(String[] args) {

//    부모인 Set 타입으로 변수를 생성하고 자식 클래스인 HashSet 타입으로 객체 생성, 사용하는 데이터 타입은 String으로 지정
    Set<String> set = new HashSet<String>();

//    add()를 사용하여 데이터를 5개 입력
    set.add("Java");
    set.add("JDBC");
    set.add("Servlet/JSP");
//    HashSet 타입은 데이터의 중복 저장을 허용하지 않음
    set.add("Java"); // 중복 데이터가 있기 때문에 입력과 동시에 자동 제거
    set.add("iBatis");

    int size = set.size();
    System.out.println("총 객체 수 : " + size);

//    Set 타입으로 저장된 데이터를 Iterator 타입의 데이터로 변환
    Iterator<String> iterator = set.iterator();
//    hasNext() : Iterator 타입의 데이터에서 다음에 출력할 데이터가 있는지 여부를 확인
//    next() : Iterator 타입의 데이터에서 실제 다음 번 데이터를 출력
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println("\t" + element);
    }

//    Set 타입의 데이터에서 지정한 데이터를 삭제
    set.remove("JDBC");
    set.remove("iBatis"); 

    System.out.println("총 객체 수 : " + set.size());

//    while 문과 hasNext() 함수를 함께 사용하는 것이 일반적이나 아래는 발전된 for문을 사용하여 Set 타입의 데이터를 모두 출력
    for (String element : set) {
      System.out.println("\t" + element);
    }

//    Set 타입에 저장된 모든 데이터 삭제
    set.clear();
//    Set 타입에 저장된 데이터가 있는지 여부를 확인, 비었으면 true, 데이터가 있으면 false 출력
    if (set.isEmpty()) {
      System.out.println("비어 있음");
    }
  }
}











