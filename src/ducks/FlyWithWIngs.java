package ducks;

public class FlyWithWIngs implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
