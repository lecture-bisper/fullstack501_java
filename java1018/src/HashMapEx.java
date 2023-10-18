import java.util.*;

public class HashMapEx {
  public static void main(String[] args) {

//    부모인 Map 타입의 변수 선언과 동시에 자식 클래스 타입인 HashMap 타입의 객체 생성
//    key는 String 타입으로 설정, value 는 Integer 타입으로 설정
    Map<String, Integer> map = new HashMap<String, Integer>();

//    put()을 사용하여 데이터를 저장, 데이터 저장 시 키와 값을 동시에 입력
    map.put("아이유", 85);
    map.put("유인나", 90);
    map.put("유병재", 80);
    map.put("유재석", 95);
    System.out.println("총 객체 수 : " + map.size());

//    get(key명) 을 사용하여 지정한 key에 연동되어 있는 value를 가져옴
    System.out.println("\t 아이유 : " + map.get("아이유"));
    map.put("아이유", 100);
//    put() 사용 시 기존에 존재하는 key를 사용하면 기존 key와 연동되어 있는 value 값을 수정함
    System.out.println("\t 아이유 : " + map.get("아이유"));
    System.out.println();

//    keySet() 를 사용하여 HashMap에 저장된 모든 key를 가져옴, key는 중복을 불허하기 때문에 Set 타입으로 반환
    Set<String> keySet = map.keySet();
//    Set 타입으로 저장된 key를 Iterator 타입으로 변환
    Iterator<String> keyIter = keySet.iterator();

//    출력할 데이터(key)가 있는지 확인
    while (keyIter.hasNext()) {
//      실제로 데이터(key) 가져오기
      String key = keyIter.next();
//      Map 타입의 데이터에서 key와 연동된 데이터 가져오기
      Integer value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    Map 타입의 데이터에서 지정한 key와 연동된 데이터 삭제하기
    map.remove("유병재");
    System.out.println("총 객체 수 : " + map.size());

//    Map 타입의 데이터를 Set 타입으로 중복 제거하여 Map.Entry 타입으로 출력
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//    출력된 내용을 Iterator 타입으로 변환
    Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

    while (entryIterator.hasNext()) {
      Map.Entry<String, Integer> entry = entryIterator.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    Map 타입의 데이터를 모두 제거
    map.clear();
    System.out.println("총 객체 수 : " + map.size());

//    key의 데이터 타입을 Integer로 사용 시 ArrayList와 비슷한 형태로 사용 가능
    Map<Integer, Integer> map2 = new HashMap<>();
    map2.put(0, 10);
    map2.put(1, 20);
    map2.put(2, 30);
    map2.put(3, 40);
    map2.put(4, 50);

    System.out.println(map2.get(0));
    System.out.println(map2.get(1));
    System.out.println(map2.get(2));
    System.out.println(map2.get(3));
    System.out.println(map2.get(4));

    List<Integer> list2 = new ArrayList<>();
    list2.add(10);
    list2.add(10);
    list2.add(10);
    list2.add(10);
    list2.add(10);

    System.out.println(list2.get(0));
    System.out.println(list2.get(1));
    System.out.println(list2.get(2));
    System.out.println(list2.get(3));
    System.out.println(list2.get(4));
  }
}








