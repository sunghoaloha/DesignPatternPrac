package decorator.starbuzz;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "하우스 블렌드 커피";
        System.out.println(getDescription());
    }

    @Override
    public double cost() {
        return .89;
    }
}
