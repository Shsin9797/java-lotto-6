# 기능 
## 1. 구입한 로또를 개수에 맞춰 발행 및 출력 기능 
- 사용자로부터 로또 구입금액 입력받기 (1000원 단위)
- 1000으로 나눈 몫을 구입한 로또 개수로 설정 
- 로또 1개당 랜덤 값으로 6개의 번호를 설정 (오름차순 정렬)
- 출력

## 2. 발행한 로또 당첨여부 확인 및 출력 하는 기능
- 당첨번호 입력받기 ( 쉼표 기준 구분 )
- 보너스 번호 입력받기 
- 발행한 로또와 비교
- 로또 각각의 일치 개수 저장 
- 출력

## 3. 수익률 찾는 기능 
- 번 돈 과 낸 돈을 비교해서 수익률 찾기
- 수익률 출력 

## * 예외처리 
    - 입력받은 로또금액이 숫자가 아니거나 1000원으로 나누어 떨어지지 않는경우 

## * 유의사항 
- 들여쓰기 2까지만 (while 문 안에 if 문 있으면 들여쓰기 2) 
- 3항연산자 x 
- JUnit 5와 AssertJ를 이용하여 테스트 코드로 확인

- 함수 길이가 15라인을 넘어가지 않도록 
- 함수는 한가지 일만 

- else 쓰지말기  => if 조건절에서 return 하는방식으로 구현하기
- Java Enum 이용하기 

- 도메인로직에 단위테스트 구현하기
- UI 로직은 단위테스트 x (System.out, System.in, Scanner) 
- = 핵심로직 코드와 UI 담당로직 분리해서 구현  (출력, 입력문 분리)
- test/java/lotto/LottoTest를 참고

- camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현
- Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickUniqueNumbersInRange()를 활용
- 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
- 사용 예시 
  - List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);

### Lotto 클래스
- numbers 접근제어자 private 변경 불가 
- Lotto 에 필드(인스턴스) 추가 불가
- Lotto 패키지 변경 가능 