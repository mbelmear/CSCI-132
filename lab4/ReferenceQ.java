package lab4;

public class ReferenceQ {
    public static void main(String[] args) {

        Band frampton = new Band("Alive", 6000);
        RecordCompany warner = new RecordCompany(new Band("Devo", 1000));
        Band startUp = new Band(30);
        RecordCompany rca = new RecordCompany(warner.getBand());

        System.out.println(frampton.getAlbum());    // Question 1
        System.out.println(warner.getAlbum());      // Question 2
        System.out.println(startUp.getAlbum());     // Question 3

        rca = frampton.testQuestion(warner, new RecordCompany(new Band(9)), rca.getBand());

        System.out.println(frampton.getAlbum());    // Question 12
        System.out.println(warner.getAlbum());      // Question 13
        System.out.println(startUp.getAlbum());     // Question 14
        System.out.println(warner.getBand().count); // Question 15
    }
}
