public class TryWithResourceEx {
  public static void main(String[] args) {
    FileInputStream file = null;
    try {
      file = new FileInputStream("file.txt");
      file.read();
    }
    catch (Exception e) {
      System.out.println("예외처리 코드가 실행되었습니다.");
    }
    finally {
      try {
        if (file != null) {
          file.close();
        }
      }
      catch (Exception e) {}
    }


    try (FileInputStream file2 = new FileInputStream("file.txt")) {
      file2.read();
    }
    catch (Exception e) {
      System.out.println("예외처리 코드가 실행되었습니다.");
    }
  }
}
