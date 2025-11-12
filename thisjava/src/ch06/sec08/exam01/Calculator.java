package ch06.sec08.exam01;

public class Calculator {
    // 리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 리턴값이 없는 메소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 두 수를 받아 덧셈을 한 결과값을 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result; // 결과값 리턴
    }

    // 두 수를 받아 나눗셈을 한 결과값을 리턴하는 메소드 선언
    double divide(double x, double y) {
        double result = (double)x / (double)y;
        return result; // 결과값 리턴
    }
}
