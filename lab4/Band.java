package lab4;

public class Band {
    private int albumSales;
    private String album;
    public static int count = 0;

    public Band(String nm, int a) {
        albumSales = a;
        album = nm;
    }

    public Band(int n) {
        albumSales = n;
        album = "Brainstorming";
        count++;
    }

    public String getAlbum() {
        return album;
    }

    public void changeAlbum(String x) {
        album = x;
    }

    public RecordCompany testQuestion(RecordCompany one, RecordCompany two, Band three) {
        Band four = one.getBand();
        four.changeAlbum("Motel");
        three = two.getBand();

        System.out.println(one.getAlbum());     // Question 4
        System.out.println(two.getAlbum());     // Question 5
        System.out.println(three.getAlbum());   // Question 6
        System.out.println(four.getAlbum());    // Question 7

        two = one;
        four = this;

        System.out.println(one.getAlbum());     // Question 8
        System.out.println(two.getAlbum());     // Question 9
        System.out.println(three.getAlbum());   // Question 10
        System.out.println(four.getAlbum());    // Question 11

        four.changeAlbum("Devo");

        return two;
    }
}
