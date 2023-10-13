import javax.swing.*;
import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    System.out.println("\n ----- 문제 1 ----- \n");
    Song mySong = new Song("Nessun Dorma");
    Song yourSong = new Song("공주는 잠 못 이루고");
    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("내 노래는 " + yourSong.getTitle());

    System.out.println("\n ----- 문제 2 ----- \n");

    Scanner sc = new Scanner(System.in);

    String name = ""; // 이름을 입력받은 변수
    String tel = ""; // 전화번호를 입력받을 변수

    System.out.print("이름과 전화번호를 입력 >> ");
    name = sc.next();
    tel = sc.next();
    Phone p1 = new Phone(name, tel);

    System.out.print("이름과 전화번호를 입력 >> ");
    name = sc.next();
    tel = sc.next();
    Phone p2 = new Phone(name, tel);

    System.out.println(p1.getName() + "의 번호 " + p1.getTel());
    System.out.println(p2.getName() + "의 번호 " + p2.getTel());

  }
}








