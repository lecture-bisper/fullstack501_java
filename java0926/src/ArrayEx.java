public class ArrayEx {
  public static void main (String [] args) {
//    배열 : 하나의 이름으로 여러개의 데이터를 저장할 수 있는 데이터 타입
//    - 동일한 데이터 타입의 데이터만 배열에 저장할 수 있음
//    - 각각의 데이터를 구분하기 위해서 index를 사용 (index는 0부터 시작)
//    - 배열을 표시하는 기호로 [] 를 사용
//    - [] 안에 index 번호를 사용하여 원하는 위치에 데이터를 저장하거나 꺼내어 사용할 수 있음
//    - 배열은 선언 시 해당 배열의 크기를 설정하고, 지정한 크기를 벗어나서 사용할 수 없음
//    - 한번 설정된 배열의 크기는 변경할 수 없음
//    - 배열은 데이터 타입이 참조 타입이기 때문에 null 로 초기화가 가능함

//    사용법 : 선언
//    1. 데이터타입 [] 배열명; // 배열을 메모리에 선언만 진행하고 나중에 필요한 곳에서 실제 배열을 생성함, 초기화 X
//    1. 배열명 = new 데이터타입[배열크기]; // 선언만 해놓은 배열을 실제로 사용하기 위해서 초기화
//    2. 데이터타입 [] 배열명 = new 데이터타입[배열크기]; // 배열을 선언과 동시에 초기화까지 완료, 빈 배열
//    3. 데이터타입 [] 배열명 = {데이터1, 데이터2, 데이터3, ... }; // 배열을 선언과 동시에 데이터를 추가함, 동시에 추가한 데이터의 갯수에 따라서 배열의 크기가 결정됨
//    4. 데이터타입 [] 배열명 = new 데이터타입[] {데이터1, 데이터2, 데이터3, ...}; // 배열을 선언과 동시에 데이터를 추가함, 동시에 추가한 데이터의 갯수에 따라서 배열의 크기가 결정됨

//    사용법 : 사용
//    배열명[index]; // 배열의 지정된 index에 저장되어 있는 데이터를 꺼내어 사용
//    배열명[index] = 데이터; 배열의 지정된 index에 데이터를 저장

    System.out.println("----- 배열 선언 -----");

//    1번 방식으로 배열 선언
    int [] arr1;
    arr1 = new int[5];

//    배열 선언 시 []의 위치가 달라도 상관없음
    int arr2[];
    arr2 = new int[5];

//    배열을 미 사용 시 변수를 많이 생성해야 함, 변수가 많아지면 해당 변수를 관리하기 힘들어짐
    int score1 = 80;
    int score2 = 70;
    int score3 = 60;
    int score4 = 90;
    int score5 = 100;

    int total = score1 + score2 + score3 + score4 + score5;
    double avg = total / 5;

    System.out.println("학생 5명의 점수 총합은 " + total + "점이고, 평균 점수는 " + avg + "점 입니다.");

    //    동일한 데이터 타입의 데이터를 동일한 목적으로 사용 시 각각의 이름이 다르면 관리가 어려워짐
//    데이터가 추가 및 삭제될 경우 소스코드를 변경해야 함
    int ui = 90;
    int you = 80;
    int inna = 60;
    int byoung = 70;
    int risa = 100;

    total = ui + you + inna + byoung + risa;
    avg = total / 5;

    System.out.println("학생 5명의 점수 총합은 " + total + "점이고, 평균 점수는 " + avg + "점 입니다.");

    int [] scores = {80, 70, 60, 90, 100};

    total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    avg = total / scores.length;

    System.out.println("학생 5명의 점수 총합은 " + total + "점이고, 평균 점수는 " + avg + "점 입니다.");

    System.out.println("\n ----- 반복문과 배열을 함께 사용 시 ----- \n");

    total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    avg = total / scores.length;


    System.out.println("학생 5명의 점수 총합은 " + total + "점이고, 평균 점수는 " + avg + "점 입니다.");

    scores = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    total = 0;

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    avg = total / scores.length;

    System.out.println("학생 5명의 점수 총합은 " + total + "점이고, 평균 점수는 " + avg + "점 입니다.");


    System.out.println("\n ----- 배열 선언 여러가지 ----- \n");

    System.out.println("----- 1번 방식 -----");
    int [] array1; // 배열은 선언만 함
    // 배열을 메모리 상에 선언만 했으므로 초기화가 되지 않아서 배열의 내용을 사용할 수 없음
//    System.out.println(array1);
//    배열을 선언만 하고 초기화 하지 않았기 때문에 데이터의 저장이 불가능
//    array1[0] = 100;
    
//    메모리에 선언된 배열을 초기화함
    array1 = new int[5];
//    초기화된 배열은 사용이 가능함
    System.out.println(array1);
//    배열을 초기화했으므로 데이터의 저장이 가능함
    array1[0] = 100;
//    배열을 초기화했으므로 데이터의 출력도 가능함
    System.out.println(array1[0]);
//    배열을 초기화하고 데이터를 저장하지 않았을 경우 기본값으로 자동 세팅됨
    System.out.println(array1[1]);


    System.out.println("\n----- 2번 방식 -----");
//    배열 선언과 동시에 초기화 진행
    int [] array2 = new int[5];
//    초기화 되었기 때문에 사용 가능
    System.out.println(array2);
//    초기화 되었기 때문에 데이터 저장 가능
    array2[0] = 100;
//    초기화 되었기 때문에 저장된 데이터의 출력도 가능함
    System.out.println(array2[0]);
    System.out.println(array2[1]);

    System.out.println("\n----- 3번 방식 -----");
//    배열의 선언과 동시에 데이터를 저장
//    배열의 선언과 동시에 데이터를 저장하기 때문에 배열의 크기가 지정되어 있지 않음, 저장하는 데이터의 수에 따라서 배열의 크기가 결정됨
    int [] array3 = {10, 20, 30, 40, 50};
//    배열의 선언과 동시에 데이터를 저장했다는 것은 배열의 초기화도 같이 이루어졌음
    System.out.println(array3);
//    배열에 데이터를 저장하는 것에 문제 없음
    array3[0] = 100;
//    배열에 저장된 데이터를 가져오는 것에도 문제 없음
    System.out.println(array3[0]);
    System.out.println(array3[1]);

//    배열을 먼저 선언만하고 나중에 배열을 대입하여 저장할 경우
//    {데이터1, 데이터2, ...} 형식 나중에 대입하여 저장하는 방식은 오류가 발생
//    선언만 되어 있는 배열은 초기화가 되어있지 않기 때문에 {데이터1, 데이터2, ...} 형태의 데이터를 단순 대입하는 것이 불가능함
//    int [] array31;
//    array31 = {10, 20, 30, 40, 50};

    System.out.println("\n----- 4번 방식 -----");
//    배열을 선언만 함
    int [] array4;
    
//    배열이 초기화 되지 않았기 때문에 사용 불가능
//    System.out.println(array4);
    
//    배열을 생성과 동시에 데이터를 추가함
//    동시에 추가되는 데이터의 수에 따라서 배열의 크기가 결정됨
    array4 = new int[] {10, 20, 30, 40, 50};
    System.out.println(array4);

    array4[0] = 100;
    System.out.println(array4[0]);
    System.out.println(array4[1]);

    
//    배열을 선언만 함
    int [] array51;
//    배열을 선언과 동시에 null로 초기화
    int [] array52 = null;

//    System.out.println(array51);
    System.out.println(array52);

  }
}










