public class ArrayArgumentEx {
//  String [] args : main 메소드의 매개변수인 args는 자바 프로그램 실행 시 프로그램명 뒤에 입력되는 모든 문자열을 요소로 입력받는 배열
  public static void main(String [] args) {
// 현재 파일 뒤에 입력된 문자열을 공백 기호를 기준으로 데이터를 입력받음
//    몇개의 데이터가 입력되었는지 크기 확인
//    크기가 2와 같지 않으면 실행
    if (args.length != 2) {
      System.out.println("----- use program -----");
      System.out.println("java ArrayArgumentEx num1 num2");
//      프로그램 즉시 종료
      System.exit(0);
    }

//    배열 args의 0 index의 값을 변수 strNum1에 대입
    String strNum1 = args[0];
//    배열 args의 1 index의 값을 변수 strNum2에 대입
    String strNum2 = args[1];

//    Integer : 자바에서 제공하는 기본 타입인 int 타입의 랩핑 타입
//    - int 는 기본 데이터 타입이기 때문에 데이터 타입의 기능이 부족함, int 데이터 타입에 기능을 추가하여 사용자에게 여러가지 편의성을 제공하기 위해서 만들어진 데이터 타입이 랩핑 타입임
//    배열 args에 저장된 데이터는 String 타입이므로 산술 연산이 불가능하기 때문에 정수로 변환
//    parseInt(문자열) : 문자열 데이터를 정수 데이터로 변환하는 메소드
//    - 문자열이지만 숫자인 문자열을 정수로 변환, 숫자가 큰 따옴표로 감싸진 형태의 문자열만 변환이 가능
    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }
}










