package ducks;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWIngs();
    }
    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }
}
