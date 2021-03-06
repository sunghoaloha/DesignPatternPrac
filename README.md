# DesignPatternPrac
이 repository는 **Head First Design Patterns**(한빛미디어, 2005)를 보며 공부한 내용을 기록하기 위해 만들었습니다. 책에 수록된 예제 코드, 책 내용 정리, 공부하며 느낀점 등을 쓸 계획입니다.(2022/05/05)


## 진행상황
* Strategy Pattern :heavy_check_mark:
* Observer Pattern :heavy_check_mark:
* Decorator Pattern :heavy_check_mark:
* Factory Pattern
* Singleton Pattern
* Command Pattern
* Adapter Pattern
* Facade Pattern
* Template Method Pattern
* Iterator Pattern
* Composite Pattern
* State Pattern
* Proxy Pattern
* Compound pattern (espacially MVC??)


## 내용 정리
### 서문 & 디자인 패턴 소개
디자인 패턴을 배워야 하는 이유
> 우리가 일상적으로 접하는 문제 중 상당수는 다른 많은 이들이 접했던 문제입니다.(코딩할 때의 문제를 말함) 비슷한 문제를 해결하기 위해 선배들이 시간과 노력을 투자해서 이것 저것 시도해 보고, 그 중에서 문제 해결에 가장 효과적이라고 알려진 방법이 자리를 잡아서 "패턴"이라는 이름을 달고 널리 쓰이게 된 것이다.
> "누군가 이미 여러분의 문제를 해결해 놓았습니다."

패턴은 검증 받은 객체지향 경험의 산물입니다. 
디자인 패턴은 코드의 재사용과 마찬가지로 경험을 재사용하는 것. 디자인 패턴을 모르고 프로그램을 만드는 것은 라이브러리를 안 쓰고 코드를 짜는 것과 같다.
디자인 패턴은 개발자들 사이에서 모두 이해할 수 있는 용어를 제공하는 역할을 합니다.

### 1. Strategy Pattern

알고리즘 군을 정의하고 각각 캡슐화하여 교환해서 사용할 수 있도록 만듭니다. Strategy Pattern을 이용하면 알고리즘을 활용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있습니다.

![Strategy Pattern](https://user-images.githubusercontent.com/76836771/166935547-e4f83a0e-050d-4a21-aa65-4b4e5fd8b2e0.JPG)

예를 들어 오리 객체가 꽥! 소리를 내는 것을 구현하고 싶을 때, 단순히 오리 클래스 안에 quack() 함수를 만드는 것이 아니라, QuackBehavior라는 Interface를 변수로 가지도록 해서 이것을 implement하는 Quack Class 객체를 assign 해준다.이렇게 하면 오리의 꽥 소리를 내는 동작을 동적으로 바꿀 수도 있고 나중에 새로운 울음소리를 추가하기도 쉽다. 또 만들어 놓은 울음소리를 재사용할 수 있다.

### 2. Observer Pattern
![Observer Pattern](https://user-images.githubusercontent.com/76836771/167232698-2480f0ca-fa1e-40c3-946d-1d68d87ef539.png)

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 one-to-many 의존성을 정의합니다.

직접 구현할 수도 있고, jdk에 내장된 observerable, observer등을 사용할 수 있다. 자바에는 옵저버 패턴을 구현한 것이 여럿 있다.(Swing의 Listener등)

옵저버와 주제 간의 연결은 느슨하다. 서로 독립적으로 재사용할 수 있고 교체돼도 서로에게 영향을 미치지 않는다. 상호의존성이 최소화되어서 유연한 시스템을 구축할 수 있다. (따라서 특정 연락 순서에 의존하도록 하는 것은 좋지 않음) 

상태 변경을 전달하는 방법은 Subject가 Observer에게 Data를 전달해주는 Push방식과 Observer가 Subject의 Data를 가져가는 Pull 방식이 있습니다.

### 3. Decorator Pattern

![Decorator Pattern](https://user-images.githubusercontent.com/76836771/167365647-9a06b132-90b0-4e25-9424-991503c0af94.JPG)

객체에 추가 요소를 동적으로 더할 수 있습니다. 데코레이터를 사용하면 서브클래스를 만드는 경우에 비해 훨씬 유연하게 기능을 확장할 수 있습니다.

기존 코드를 수정하지 않고도 행동을 확장할 수 있다. 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장한다.
데코레이터 패턴의 단점도 있다 꽤 많은 데코레이터로 감싸야하는 경우 코드가 복잡해질 수 있다.
특정 형식에 의존하는 코드에 데코레이터를 그냥 적용하면 모든 게 엉망이 될 수 있다
이런 단점들은 팩토리 패턴과 빌더 패턴과 함께 사용해서 해결할 수 있는 것 같다. (팩토리 패턴과 빌더 패턴에 대해서는 뒤에서 다룸)
