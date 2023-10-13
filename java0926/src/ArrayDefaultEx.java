public class ArrayDefaultEx {
  public static void main(String [] args) {
    System.out.println("\n ----- 배열의 기본값 ----- \n");

//    기본 타입 중 정수 타입으로 생성한 배열은 기본값이 0 임
//    기본 타입 중 실수 타입으로 생성한 배열은 기본값이 0.0 임
//    기본 타입 중 논리 타입으로 생성한 배열은 기본값이 false 임
//    참조 타입으로 생성한 배열은 기본값이 null 임

    System.out.println("\n ----- 기본타입 정수 배열 -----\n");
    byte [] bArr = new byte[5];
    char [] cArr = new char[5];
    short [] shArr = new short[5];
    int [] iArr = new int[5];
    long [] lArr = new long[5];

    System.out.println(bArr[0]);
    System.out.println(bArr[4]);
    System.out.println(cArr[0]);
    System.out.println(cArr[4]);
    System.out.println(shArr[0]);
    System.out.println(shArr[4]);
    System.out.println(iArr[0]);
    System.out.println(iArr[4]);
    System.out.println(lArr[0]);
    System.out.println(lArr[4]);

    System.out.println("\n ----- 기본타입 실수 배열 -----\n");
    float [] fArr = new float[5];
    double [] dArr = new double[5];

    System.out.println(fArr[0]);
    System.out.println(fArr[4]);
    System.out.println(dArr[0]);
    System.out.println(dArr[4]);

    System.out.println("\n ----- 기본타입 논리 배열 -----\n");
    boolean [] boolArr = new boolean[5];
    System.out.println(boolArr[0]);
    System.out.println(boolArr[4]);

    System.out.println("\n ----- 참조타입 배열 -----\n");
    String [] strArr = new String[5];
    System.out.println(strArr[0]);
    System.out.println(strArr[4]);

  }
}
