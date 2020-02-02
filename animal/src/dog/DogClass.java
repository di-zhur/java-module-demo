package dog;

public class DogClass implements Dog {
    @Override
    public void info() {
        System.out.println(getClass().getName());
    }
}
