package com.eomcs.oop.ex02.cal_test;

//# 관련된 기능(메서드)을 묶어 분류하기
//1) 분류 전
//2) 메서드를 클래스로 묶어 분류하기
//3) 클래스 변수 도입
//4) 클래스 변수의 한계 확인
//5) 인스턴스 변수 도입
//6) 인스턴스 메서드 활용
//7) 패키지 멤버 클래스로 분리
//8) 클래스를 역할에 따라 패키지로 분류하기
public class CalTest5 {
  static class Calculate{
    // 계산 결과를 담을 변수를 준비한다.
    int result = 0;
    static void plus(Calculate obj, int a) {
      obj.result += a;
    }

    static void minus(Calculate obj, int a) {
      obj.result -= a;
    }

    static void multiple(Calculate obj, int a) {
      obj.result *= a;
    }

    static void divide(Calculate obj, int a) {
      obj.result /= a;
    }

    static int abs(int a) {
      return a>0? a:-1*a;
    }
  }

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?
    Calculate c1 = new Calculate();
    Calculate c2 = new Calculate();


    // 메서드를 호출하여 작업을 수행하고,
    // 리턴 결과는 로컬 변수에 저장한다.
    Calculate.plus(c1, 2);
    Calculate.minus(c1, 1);
    Calculate.multiple(c1, 7);
    Calculate.divide(c1, 3);

    System.out.printf("result = %d\n", c1.result);

    Calculate.plus(c2, 3); // + 3
    Calculate.multiple(c2, 2); // + 3 * 2
    Calculate.plus(c2, 7); // + 3 * 2 + 7
    Calculate.divide(c2, 4); // + 3 * 2 + 7 / 4
    Calculate.minus(c2, 5); // + 3 * 2 + 7 / 4 - 5 = ?

    System.out.printf("result = %d\n", c2.result);
  }


}
// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
// - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
// - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.


