public class DmbCellPhoneEx {
  public static void main(String[] args) {
//    자식 클래스인 DmbCellPhone 클래스 타입의 객체 생성
    DmbCellPhone dmbPhone = new DmbCellPhone("자바폰", "검정", 10);

//    부모 클래스인 CellPhone 클래스에서 상속받은 필드
    System.out.println("모델 : " + dmbPhone.model);
    System.out.println("색상 : " + dmbPhone.color);

//    자식 클래스 DmbCellPhone 클래스 전용 필드
    System.out.println("채널 : " + dmbPhone.channel);

//    부모 클래스인 CellPhone 클래스에서 상속받은 메소드 호출
    dmbPhone.powerOn();
    dmbPhone.bell();
    dmbPhone.sendVoice("여보세요");
    dmbPhone.recevieVoice("안녕하세요, 저는 홍길동인데요");
    dmbPhone.sendVoice("아.. 예 안녕하세요");
    dmbPhone.hangUp();

//    자식 클래스인 DmbCellPhone 클래스 전용 메소드 호출
    dmbPhone.turnOnDmb();
    dmbPhone.changeChannelDmb(12);
    dmbPhone.turnOffDmb();
  }
}
