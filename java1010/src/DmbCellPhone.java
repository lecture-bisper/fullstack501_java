public class DmbCellPhone extends CellPhone {

//  String model;
//  String color;
  int channel;

  DmbCellPhone (String model, String color, int channel) {
//    필드 model, color는 현재 클래스인 DmbCellPhone의 필드가 아니지만 부모 클래스인 CellPhone에서 상속받았기 때문에 자식 클래스인 DmbCellPhone의 멤버가 됨
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

//  부모클래스인 CellPhone 에서 상속받은 powerOn, powerOff, sendVoice, receiveVoice, hangUp 메소드 사용할 수 있음
  void turnOnDmb() {
    System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + channel + "번으로 바꿉니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 멈춥니다");
  }
}



