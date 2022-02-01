package lab2;

class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point reflect_x(){
        int newX = this.x;
        int newY = this.y * -1;

        Point newPoint = new Point(newX, newY);
        return newPoint;
    }

    public String get_line_to(Point endPoint){
        int x1 = this.x;
        int x2 = endPoint.x;
        int y1 = this.y;
        int y2 = endPoint.y;
        int m = (y2 - y1)/(x2 - x1);
        int b = (y1 - (m*x1));
        return "y =" + m + "x + " +b;
    }

}
class Main{
    public static void main(String[] args) {
        Point first = new Point(3, -5);
        System.out.printf("First (%d, %d)", first.x, first.y);
        System.out.printf(" Second (%d, %d)", first.reflect_x().x, first.reflect_x().y);
        System.out.println(" ");
        System.out.println(new Point(4, 11).get_line_to(new Point(6, 15)));

    }
}
