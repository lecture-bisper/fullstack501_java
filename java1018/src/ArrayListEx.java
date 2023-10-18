import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
  public static void main(String[] args) {

//    부모 타입인 List 타입의 변수 생성
//    자식 클래스 타입인 ArrayList 객체를 생성하여 부모 타입의 변수에 저장
//    부모인 List 타입에서 제공하는 멤버 메소드로 ArrayList 를 사용함
    List<String> list = new ArrayList<String>();

//    ArrayList 객체 생성 직후 크기 확인
    System.out.println("원본 리스트의 크기 : " + list.size());

//    add()로 데이터 추가, ArrayList 객체의 끝에 추가함
    list.add("Java");
    list.add("JDBC");
    list.add("Servlet/JSP");
//    add()의 첫번째 매개변수에 index를 사용 시 지정한 index에 데이터 추가
    list.add(2, "Database");
    list.add("iBatis");

    int size = list.size();

    System.out.println("총 객체 수 : " + size);
    System.out.println();

//    get()을 사용하여 지정한 index에 있는 데이터를 가져옴
    String skill = list.get(2);
    System.out.println("2 : " + skill);
    System.out.println();

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }
    System.out.println();

//    remove()를 사용하여 지정된 index에 있는 데이터 삭제
    list.remove(2);
    list.remove(2);
//    remove()를 사용하여 지정된 데이터를 직접 삭제
    list.remove("JDBC");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

  }
}












