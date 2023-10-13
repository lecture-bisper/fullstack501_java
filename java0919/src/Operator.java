public class Operator {
  public static void main(String [] args) {
    System.out.println("\n ----- 문자열 연결 연산자 ----- \n");

//    문자열 : 문자의 배열을 뜻함, 문자를 나열해 놓은 것
//     - 자바의 문자열은 String 클래스 타입으로 레퍼런스 타입임
//     - 자바의 기본 데이터 타입이 아니지만 워낙 많이 사용되는 데이터 타입이기 때문에 기본 데이터 타입처럼 사용할 수 있음
//     - 자바에서 문자열은 ""로 감싸여져 있는 모든 데이터를 문자열이라함

//    문자열 연결 연산자 : 산술 연산자의 + 기호를 사용
//     - 2개 이상의 문자열을 연결하여 하나의 문자열로 만드는 연산자
//     - 다른 데이터 타입과 문자열을 문자열 연결 연산자로 연산 시 모든 데이터 타입의 문자열 타입으로 변환 후 연결함

    String str1 = "JDK " + "17";
    String str2 = str1 + " 의 특징";
    System.out.println(str2);

//    연산자의 연산 순서에 따라서 왼쪽에서 오른쪽으로 이동하며 연산
//    "JDK" + 10 이 먼저 연산되어 "JDK 10"으로 연결되고,
//    "JDK 10" + 7 이 나중에 연산되어 "JDK 107"이 됨
    String str3 = "JDK " + 10 + 7;
    System.out.println(str3);

//    연산자의 연산 순서에 따라서 왼쪽에서 오른쪽으로 이동하면서 연산
//    10 + 7이 먼저 연산되어 17이 되고, 17 + "JDK"가 나중에 연산되어 "17 JDK"가 됨
    String str4 = 10 + 7 + " JDK";
    System.out.println(str4);



//    논리 연산자
    System.out.println("\n ----- 논리 연산 ----- \n");

//    int 타입의 변수 선언, 데이터를 char 타입의 문자 'A' (65)를 입력
    int charCode = 'A';

    if ((charCode >= 65) && (charCode <= 90)) {
      System.out.println("논리연산자 &&로 대문자 입니다.");
    }

//    2중 if문을 사용하는 곳을 논리 연산자를 사용하여 1중 if문으로 처리 가능
    if (charCode >= 65) {
      if (charCode <= 90) {
        System.out.println("2중 if문으로 대문자 입니다.");
      }
    }

    if ((charCode >= 97) && (charCode <= 122)) {
      System.out.println("소문자 입니다.");
    }

    if ((charCode >= 65) || (charCode <= 90)) {
      System.out.println("대문자 입니다.");
    }

    if ((charCode >= 97) || (charCode <= 122)) {
      System.out.println("소문자 입니다.");
    }

    System.out.println("\n ----- 대입 연산자 ----- \n");

//    단순 대입 연산자 사용;
    int iVal1 = 100;
    System.out.println(iVal1);

    iVal1 = iVal1 + 1;
    System.out.println(iVal1);

//    처음에는 기본 형태인 iVal1 = iVal1 + 1;을 사용하는 것이 좋음
    iVal1 += 1;
    System.out.println(iVal1);

//    복합 대입 연산자인 += 은 문자열 연결 연산자로 많이 사용
//    JDBC 사용 시 자바 소스코드와 SQL 코드를 함께 사용하게 됨
//    SQL 코드를 문자열로 사용하기 때문에 이를 연결하기 위해서 += 을 많이 사용

    String str5 = "문자열";
    str5 = str5 + " 추가된 문자열";
    str5 = str5 + " 또 추가된 문자열";
    System.out.println(str5);

    str5 = "문자열";
    str5 += " 추가된 문자열";
    str5 += " 또 추가된 문자열";
    System.out.println(str5);

    System.out.println("\n ----- 증감연산자 ++, -- -----\n ");

//    증감 연산자 : 데이터의 값을 1증가 혹은 1감소 시키는 연산자
//    연산자의 위치에 따라서 실행 순서가 달라짐
//    피연산자의 앞에 있을 경우 전치 증감 연산자
//    피연산자의 뒤에 있을 경우 후치 증감 연산자
//    한 라인에 단독으로 사용 시에는 차이가 없음
//    다른 명령과 함께 사용 시 실행 순서의 차이가 발생함

    int iVal6 = 10;
    System.out.println("iVal6 : " + iVal6);
    iVal6++;
    System.out.println("iVal6 : " + iVal6);
    ++iVal6;
    System.out.println("iVal6 : " + iVal6);
    --iVal6;
    System.out.println("iVal6 : " + iVal6);
    iVal6--;
    System.out.println("iVal6 : " + iVal6);

    System.out.println();

    System.out.println("iVal6 : " + iVal6);
//    전치 증감 연산자로 동작하여 iVal6의 값을 증가하고 화면에 출력
    System.out.println("iVal6 : " + ++iVal6);
    System.out.println("iVal6 : " + iVal6);
//    후치 증감 연산자로 동작하여 iValk6의 값을 화면에 출력하고 나중에 값을 증가
    System.out.println("iVal6 : " + iVal6++);
    System.out.println("iVal6 : " + iVal6);
  }
}













