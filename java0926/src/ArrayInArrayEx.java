public class ArrayInArrayEx {
  public static void main(String [] args) {
//    다차원 배열
//    1차원 배열 : 일반적으로 사용하는 배열, 배열의 요소가 데이터인 배열
//    2차원 배열 : 배열의 요소가 1차원 배열인 배열
//    3차원 배열 : 배열의 요소가 2차원 배열인 배열

    System.out.println("\n ----- 1차원 배열 -----\n");

    int[] arr11 = new int[5];
    arr11[0] = 10;
    arr11[1] = 20;
    arr11[2] = 30;
    arr11[3] = 40;
    arr11[4] = 50;

    for (int i = 0; i < arr11.length; i++) {
      System.out.println(arr11[i]);
    }


    int[] arr12 = {10, 20, 30, 40, 50};

    for (int i = 0; i < arr12.length; i++) {
      System.out.println(arr12[i]);
    }


    System.out.println("\n ----- 2차원 배열 -----\n");

    int[][] arr21 = new int[5][5];
    arr21[0][0] = 10;
    arr21[0][4] = 50;
    arr21[4][0] = 210;
    arr21[4][4] = 250;

    int[][] arr22 = {
        {1,  2,  3,  4,  5},
        {6,  7,  8,  9,  10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    int[][] arr23 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

    System.out.println("\n ----- 3차원 배열 -----\n");

    int[][][] arr31 = new int[3][3][3];

    int[][][] arr32 = {
        {
            {1, 2, 3},
            {4, 5, 6}
        },
        {
            {7, 8, 9},
            {10, 11, 12}
        }
    };

    int[][][] arr33 = { { {1, 2}, {4, 5} }, { {6, 7}, {8, 9} } };


    System.out.println("\n ----- 다차원 배열과 반복문 ----- \n");

//    배열과 반복문은 궁합이 좋음
//    배열의 모든 요소를 출력하고자 할 경우 반복문을 사용하면 편함
//    1차원 배열은 반복문 1개
//    2차원 배열은 2중 반복문
//    3차원 배열은 3중 반복문

    int[][] iArr = {
        {1,  2,  3,  4,  5},
        {6,  7,  8,  9,  10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    for (int i = 0; i < iArr.length; i++) {
      for (int j = 0; j < iArr[i].length; j++) {
        System.out.println(iArr[i][j]);
      }
    }
  }
}












