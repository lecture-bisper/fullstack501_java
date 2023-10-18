import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
  public static void main(String[] args) {
//    key와 value 를 모두 String 타입으로 지정한 Properties 객체 생성
    Properties properties = new Properties();
    
//    지정한 파일의 실제 경로를 가져옴
    String path = PropertiesEx.class.getResource("database.properties").getPath();

    try {
//      파일 경로에 영문자가 아닌 글자가 있을 경우에도 정상적으로 출력하기 위해서 URLDecoder를 사용하여 경로를 가져옴
      path = URLDecoder.decode(path, "UTF-8");
//      FileReader 클래스를 통해서 지정한 파일의 내용을 읽어옴
//      load() : 읽어온 내용을 '=' 기호를 기준으로 하여 왼쪽의 문자열을 key로 설정, 오른쪽의 문자열을 value로 설정
      properties.load(new FileReader(path));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }

//    getProperty(key) : 지정한 key에 연동된 데이터를 가져옴
    String driver = properties.getProperty("driver");
    String url = properties.getProperty("url");
    String username = properties.getProperty("username");
    String password = properties.getProperty("password");

    System.out.println("driver : " + driver);
    System.out.println("url : " + url);
    System.out.println("username : " + username);
    System.out.println("password : " + password);

  }
}
