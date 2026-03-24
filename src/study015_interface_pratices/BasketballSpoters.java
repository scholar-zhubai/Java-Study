package study015_interface_pratices;

public class BasketballSpoters extends Sporters implements SpeakEnglish {
    public BasketballSpoters() {
    }

    public BasketballSpoters(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study(){
        System.out.println("学打篮球");
    }


    @Override
    public void SpeachEnglish() {
        System.out.println("讲英语");
    }
}
