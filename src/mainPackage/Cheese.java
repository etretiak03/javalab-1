gitpackage mainPackage;

public class Cheese extends Food{
    public static final String FOOD_NAME = "Сыр";

    public Cheese() {
        super(FOOD_NAME);
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }
}
