public class ArrayRefObjEx {
  public static void main (String [] args) {
    System.out.println("----- 기본 타입 배열 생성 ---- \n");

    int[] iArr1 = new int[5];
    iArr1[0] = 10;
    iArr1[1] = 20;
    iArr1[2] = 30;
    iArr1[3] = 40;
    iArr1[4] = 50;

    for (int i = 0; i < iArr1.length; i++) {
      System.out.println("배열 iArr1[" + i + "] : " + iArr1[i]);
    }

    System.out.println();

    int[] iArr2 = {10, 20, 30, 40, 50};

    for (int i = 0; i < iArr2.length; i++) {
      System.out.println("배열 iArr2[" + i + "] : " + iArr2[i]);
    }

//    배열의 요소가 참조 타입인 배열 생성 방식은 기본 타입의 배열 생성 방식과 동일함
//    배열의 요소가 참조 타입인 배열은 각각의 index에 저장된 데이터가 주소임
    System.out.println("\n ----- 참조 타입 배열 생성 ----- \n");

    String [] strArr1 = new String[5];
    strArr1[0] = "가나다";
    strArr1[1] = "라마바";
    strArr1[2] = "사아자";
    strArr1[3] = "차카타";
    strArr1[4] = "파하";

    for (int i = 0; i < strArr1.length; i++) {
      System.out.println("배열 strArr1[" + i + "] : " + strArr1[i]);
    }

    System.out.println();

    String[] strArr2 = {"가나다", "라마바", "사아자", "차카타", "파하"};

    for (int i = 0; i < strArr2.length; i++) {
      System.out.println("배열 strArr2[" + i + "] : " + strArr2[i]);
    }


    System.out.println("\n ----- ----- \n");

//    참조 타입을 요소로 가지는 배열을 생성만하고 데이터 저장을 하지 않았을 경우 초기값으로 null이 들어가 있음
    String[] strArr3 = new String[3];

    System.out.println(strArr3);
//    String 타입으로 배열을 만들었다고 해서 초기값으로 "" 이 들어가 있을 것이 아니라 null이 들어가 있음
    System.out.println(strArr3[0]);

    strArr3[0] = "java";
    strArr3[1] = "java";
    strArr3[2] = new String("java");

//    String 타입은 클래스 타입이기 때문에 new String() 방식으로 문자열을 생성 시 힙 메모리 영역에 새로 데이터를 저장
    System.out.println(strArr3[0] == strArr3[1]);
    System.out.println(strArr3[0] == strArr3[2]);
    System.out.println(strArr3[0].equals(strArr3[2]));
  }
}
















