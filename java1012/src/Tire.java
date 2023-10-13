//부모 클래스로 사용되는 클래스
public class Tire {
  public int maxRotation; // 최대 회전 가능한 수
  public int accumulatedRotation; // 누적 회전 수
  public String location; // 고장 지점

  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

//  메소드
  public boolean roll() {
    ++accumulatedRotation; // 누적 회전수를 1 증가

//    누적 회전수가 최대 회전수보다 작은지 확인
    if (accumulatedRotation < maxRotation) {
//      최대 회전수에서 누적 회전수 빼기
      System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " Tire 펑크 *****");
      return false;
    }
  }
}











