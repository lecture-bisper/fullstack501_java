public class Account {

//  예금액
  private long balance;

  public Account() {}

//  balance의 Getter 메소드, 현재 예금액 출력
  public long getBalance() {
    return balance;
  }

//  balance의 Setter 메소드, 예금액 추가
  public void deposit(int money) {
    balance += money;
  }

//  출금을 위한 메소드
  public void withDraw(int money) throws BalanceInsfficientException {
    if (balance < money) {
//      예외 강제 발생
      throw new BalanceInsfficientException("잔고 부족 : " + (money - balance) + " 모자람");
    }

    balance -= money;
  }
}
