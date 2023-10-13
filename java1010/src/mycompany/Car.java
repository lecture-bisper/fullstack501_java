package mycompany;

// import : 다른 패키지에 포함된 클래스를 현재 클래스에서 사용하기 위해서 불러오기 위한 명령어
// - import 를 사용하지 않으면 패키지 명을 포함하여 전체 클래스명을 모두 입력하여 사용해야 함
// import를 통해서 외부 클래스를 여러개 가져 올 경우 클래스명이 동일하게 되면 어떤 클래스를 사용해야할지 컴파일러가 알 수 없기 때문에 자주 사용하는 클래스는 import로 가져오고, 자주 사용하지 않는 클래스는 패키지명을 포함한 전체 클래스명을 사용하는 방식을 사용

import hankook.SnowTire;
import hankook.Tire;
import hyndai.Engine;
import kumho.BigWidthTire;

// 사용법
// - import 상위패키지명.하위패키지명.클래스명; // 지정된 클래스만 가져오기
// - import 상위패키지명.하위패키지명.*; // 해당 패키지의 모든 클래스를 다 가져오기
public class Car {
//  hyndai 패키지의 Engine 클래스 가져와서 사용하기 (객체 생성)
  Engine engine = new Engine();
//  hankook 패키지의 SnowTire 클래스 가져와서 사용하기
  SnowTire snowTire = new SnowTire();
//  kumho 패키지의 BigWidthTire 클래스 가져와서 사용하기
  BigWidthTire bigWidthTire = new BigWidthTire();
//  hankook 패키지의 Tire 클래스 가져와서 사용하기
  Tire tire1 = new Tire();
//  kumho 패키지의 Tire 클래스 가져와서 사용하기
  kumho.Tire tire2 = new kumho.Tire();
}
