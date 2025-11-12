package ch06.sec08.exam02;

public class Computer {
    // 가변 길이 매개변수를 갖는 메소드 선언
    int sum(int ... values) {
        // sum 변수 선언
        int sum = 0;

        // values를 이용해 배열의 항목들을 반복 사용
        for(int i=0; i<values.length; i++) {
            sum = sum + values[i];
        }

        // 합산 결과 리턴
        return sum;
    }
}
