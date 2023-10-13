public class Earth {
//  상수 선언
  static final double EARTH_RADIUS = 6400; // 선언과 동시에 데이터 입력
  static final double EARTH_SURFACE_AREA; // 선언만 진행

//  정적 초기화 블록을 통해서 상수에 데이터 입력
  static {
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}
