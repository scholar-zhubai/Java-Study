package study015_interface_pratices;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }


    @Override
    public void SpeachEnglish() {
        System.out.println("讲英语");
    }
}
