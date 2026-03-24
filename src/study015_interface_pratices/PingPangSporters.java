package study015_interface_pratices;

public class PingPangSporters extends Sporters  {
    public PingPangSporters() {
    }

    public PingPangSporters(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study(){
        System.out.println("学打乒乓球");
    }
}
