package dog;

public class SuperDogClass implements Dog {
    @Override
    public void info() {
        System.out.println(getClass().getName());
    }
}
