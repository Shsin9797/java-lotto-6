package lotto;

import java.util.List;
import java.util.Scanner;

public class Lotto {
    private final List<Integer> numbers;

    //로또 값의 유효성 확인하고 객체의 필드값 설정하는 코드
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    // 로또값의 유효성 테스트
    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    ///// 도메인 부분

    ///// UI 부분  (입출력 받음)
    //이용자로부터 로또 구입 금액 입력받는 함수
    public int getMoney(){
        Scanner sc = new Scanner(System.in);
        int money =  sc.nextInt();
        sc.close();
        return money;
    }


    //추첨자(이용자)로부터 당첨 값을 입력받는 함수
    public List<Integer> getNum(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numList ;


        sc.close();
        return numList;
    }




}
