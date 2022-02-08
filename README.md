### Java 언어로 배우는 디자인 패턴 입문 - 유키 히로시
* iterator
  * Iterator의 역할 : 요소를 순서대로 검색해가는 API를 결정
  * ConcreteIterator(구체적인 반복자)의 역할 : Iterator가 결정한 API를 구현
  * iterator.Aggregate(집합체)의 역할 : iterator.Iterator 역할을 만들어내는 API를 결정
  * ConcreteAggregate(구체적인 집합체)의 역할 : iterator.Aggregate 역할이 결정한 API를 구현

* Adapter
  * 우리는 언제나 처음부터 프로그래밍을 한다고 할 수 없고, 이미 존재하고 있는 클래스를 이용하는 경우가 많다. 특히 그 클래스가 
  충분한 테스트를 받아서 버그가 적으며 지금까지 사용된 실적이 있다면 어떻게든 재이용 하고 싶을 것이다. Adapter 패턴은 기존의 클래스를 
  개조해서 필요한 클래스와 메소드를 빠르게 만들 수 있다.