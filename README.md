# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 2단계 - 문자열 덧셈 계산기
## 기능요구사항
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
* 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  - 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

## 기능 목록
* 입력한 문자열을 체크한다
- 빈 문자열 또는 null일때 0을 반환해야한다
- 숫자 하나를 문자열로 입력한 경우 해당 숫자를 반환한다
- 숫자 이외의 값 또는 음수를 입력받으면 RuntimeException 예외를 throw한다
* 기본 구분자(쉼표(,)나 콜론(:)) 구분자로 문자열을 분리한다
- 기본 구분자로 분리한 문자열을 더해서 반환한다
* 커스텀 구분자로 문자열을 분리한다
- 커스텀 구분자로분리한 문자열을 더해서 반환한다

# 3단계 - 로또(자동)
## 기능요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

## 힌트
* 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
* Collections.sort() 메소드를 활용해 정렬 가능하다.
* ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

## 기능 목록
- [x] 구매금액을 입력받는다
  - 구입금액을 입력해 주세요. 메시지 출력

- [x] 로또번호를 중복없는 6자리 숫자로 랜덤 생성한다

- [ ] 구매한 로또번호를 출력한다

- [ ] 몇장을 살수있는지 확인한다
  - 몇장을 구매했는지 메시지 출력


- [ ] 지난주 당첨번호를 입력받는다
  (총 6개)
  - 지난 주 당첨 번호 입력 메시지

- [ ] 얼마나 당첨됐는지 카운트한다
  - 3개일치 5000원
  - 4개일치 50000원
  - 5개 일치 1500000원
  - 6개 일치 2000000000원

- [ ] 수익률을 계산한다

- [ ] 당첨 통계를 출력한다