package lab4;

public class Ref {
    public static void main(String[] args) {

        Daffy quack = new Daffy("funny", 6);
        Daffy webbed = new Daffy("silly");

        Daffy beak = quack;
        quack = quack.testQuestion(beak, webbed, new Daffy("tickly", 2));

        System.out.println(quack.getFeature());
        System.out.println(webbed.getFeature());
        System.out.println(beak.getFeature());
        System.out.println(beak.num);

    }
}
