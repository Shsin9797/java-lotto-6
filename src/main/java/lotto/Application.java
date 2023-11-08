package lotto;
public class Application {

        // TODO: 프로그램 구현
        public static void main(String[] args) {

            Lotto l = new Lotto();
            // 돈받기
            int money = l.getMoney();
            //몇개살지 정하기
            int lottoCnt = l.setBuyCnt(money);
            //출력
            l.printBuyCnt(lottoCnt);
            //그 개수만큼 구매하여 리스트 출력
            List<integer[]> myLotto = l.makeLotto(lottoCnt);
            l.printLotto(myLotto);


            //당첨번호 받기
            List<Integer> win = l.getNum();

            //보너스 번호 받기
            int bonus = l.getBonusNum();

            //당첨여부 비교하는 함수



            //당첨통계추출

            //당첨통계 출력


            //수익률 계산

            //수익률 출력


        }

    }

