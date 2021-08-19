public class ColorPoint extends Point{
    private int color;

    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;

    }

    public ColorPoint() {

    }
    public void print(){
        super.print();
        System.out.println("and color " + color);
    }
}
