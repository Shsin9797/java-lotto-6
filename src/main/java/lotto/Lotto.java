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

    //돈받으면 몇개 살지 정하는 함수
    public int setBuyCnt(int money){  /////////예외처리해주기
        int cnt = money /1000 ;
        return cnt;
    }

    // 랜덤 로또값 추출
    public List<Integer[]> makeLotto(int LottoCnt){
        List<integer[]> lottoList = new ArrayList<Integer[]>();

        for(int i =0 ; i <LottoCnt ; i++){

            //로또값 담을 리스트
            int[] lotto = new int[6] ;
            //로또값 랜덤 생성 6개
            for(int j = 0 ; j <6 ; j++){
                lotto[j] = Random.pickUniqueNumbersInRange(1,45);
            }
            //로또값 담기
            lottoList.add(lotto);

        }
        return lottoList;

    }

    // 로또 int[] 의  같은 값 개수 세기 ( 입력값 오름차순으로 정렬해줘야함..)
    public int SameNumCnt(int[] myLotto , int[] realLotto){
        int numCnt =0;
        for (int i =0 ; i< myLotto.length; i++){
            for(int j = 0 ; j < realLotto; j++) {
                numCnt= updateCnt(myLotto[i],realLotto[j],numCnt);
            }

        }
        return numCnt;
    }

    //로또값이 같으면 개수를 증가시켜줌
    public int updateCnt(int my, int real, int cnt){
        if (my == real) {
            cnt++;

        }
        return cnt ;


    }

///////////////////////////////////////////////////////////

    ///// UI 부분  (입출력 받음)


    //몇개 샀는지 출력하는 함수
    public void printBuyCnt(int cnt){
        System.out.println(cnt+개를 구매했습니다.);
    }

    // 로또값을 출력하는 함수
    public void printLotto(List<Integer[]> lottoList){
        for(int[] lotto : lottoList){
            System.out.print("[");
            printLottoNum(lotto);
            System.out.println("]");
        }

    }

    //숫자 출력하는 함수
    public void printLottoNum(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i]);

            if (i >= lotto.length -1 ){
                break;
            }
            System.out.print(", ");

        }
    }



    //이용자로부터 로또 구입 금액 입력받는 함수
    public
    public int getMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");
        int money =  sc.nextInt();
        sc.close();
        return money;
    }


    //추첨자(이용자)로부터 당첨 값을 입력받는 함수
    public List<Integer> getNum(){

        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        // 사용자로부터 값을 받아오는 부분
        System.out.println("당첨 번호를 입력해 주세요.");
        String input = sc.nextLine();

        // 받아온 값을 , 로 분리해서 리스트에 넣는 부분
        String[] values = input.split(",");
        for (String value : values) {
            numList.add(Integer.parseInt(value.trim()));
        }

        //유효성 검사
        Lotto(numList);   ///////////유효성 갓이 1~45 사이인지 확인해야함..

        sc.close();
        return numList;
    }
    // 추첨자로부터 보너스 번호를 입력 받는 함수
    public int getBonusNum(){
        Scanner sc = new Scanner(System.in);
        int bonusNum = sc.nextInt();

        //////////값 1~45 사이인지 유효성 검사하기..

        return bonusNum;
    }


}
