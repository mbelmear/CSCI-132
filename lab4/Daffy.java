package lab4;

public class Daffy {
    public static int num = 0;
    private String feature;

    public Daffy() {
        feature = "Generic";
        num += 2;
    }

    public Daffy(String in_feature) {
        feature = in_feature;
        num = 3;
    }

    public Daffy(String in_feature, int a) {
        feature = in_feature;
        num = num + a;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String haha) {
        feature = haha;
    }

    public Daffy testQuestion(Daffy a, Daffy b, Daffy c) {

        a.setFeature("feather");
        b.setFeature(c.getFeature());
        c = this;

        // Statement 1
        System.out.println(a.getFeature());

        // Statement 2
        System.out.println(b.getFeature());

        // Statement 3
        System.out.println(c.getFeature());

        return b;
    }
}
