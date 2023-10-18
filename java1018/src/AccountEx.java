public class AccountEx {
  public static void main(String[] args) {
    Account account = new Account();

//    예금
    account.deposit(10000);
    System.out.println("예금액 : " + account.getBalance());

    try {
//      출금
      account.withDraw(30000);
    }
    catch (BalanceInsfficientException e) {
      String message = e.getMessage();
      System.out.println(message);
      System.out.println();
      e.printStackTrace();
    }
  }
}
