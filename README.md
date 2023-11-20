# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## step1 기능분해
* [X] 사용자 null, 공백만 입력하는 경우 exception을 발생시킨다.
* [X] 사칙연산으로 입력받을 수 있는 문자열은 +, -, *, / 이다.
* [X] 숫자를 하나 덜 입력하는 경우 exception을 발생시킨다.
* [X] 사칙연산 계산이 가능한 형태로 입력하지 않을 경우 오류를 발생시킨다.
* [X] 입력 값 끝이 숫자가 아닌 경우 오류가 발생한다.
* [X] 덧셈, 뺄셈, 곱셈, 나눗셈 기능이 가능하다.
* [X] 숫자와 사칙연산 사이에 공백이 없는 경우 Exception을 발생시킨다.
* [X] 사칙연산 계산을 들어오는 순서대로 계산한다.
추가 요구사항
* [X] 매직넘버 상수화 하기
* [X] 매소드 파라미터 3개 이상인 경우 2개 이하로 줄여보기
* [X] 열거타입과 람다식을 활용해 행위를 추상화 해보기

## step2 기능분해
* [X] 고객에게 로또 구입 금액을 입력받는다. 
* [X] 로또 한장의 가격은 1000원으로, 구입 금액에 맞게 로또 장수를 계산해 출력한다.
* [X] 구입한 티켓 갯수에 맞춰 로또를 생성한다.
* [X] 로또 생성은 Collections.shuffle() 메소드를 활용한다.
* [X] 로또 번호 출력은 Collections.sort()를 활용한다.
* [X] ArrayList()의 Contains 함수를 활용하여 당첨 번호를 체크한다.
* [X] 당첨 번호를 inputView에서 입력받는다.
* [X] 당첨 번호를 6개 미만으로 입력하는 경우 Exception이 발생한다.
* [X] 당첨 번호와 각 로또 번호를 매칭해 당첨 결과를 출력한다.
* [X] 구입 금액 대비 총 당첨금액 수익률을 계산해 출력한다.

## TODO, step2 보완점
* [X] LottoNumber을 활용해 원시값을 분리해본다. (winninglotto)
* [X] 로또번호가 1~45 사이 값이 아닌 경우 Exception 발생한다.
* [X] Lottoprice를 어떻게 관리할지
* [X] 현재 public api에 대한 테스트 케이스 채우기
* [X] '오류' 대신 Exception 용어 활용 
* [X] 래퍼 클래스 대신 Primitive 타입사용하기
* [X] 테스트코드 클래스 패키지 명칭 및 구조 보완하기
* [X] userLotto -> service, domain 성격 명확히 재구성하기
* [X] service/domain 성격에 맞는 클래스 명칭 정하기
* [X] 이율계산식 OCP, DIP 가능하도록 보완
* [X] 재사용가능한 전역변수 캐싱 활용하기 -> Lotto 통합
* [X] 언더바를 활용한 구독성 높이기
* [X] 함수형 인터페이스 활용해보기..ㅠㅠ (Prize)
* [ ] 로또번호 List->Set으로 변경하기
