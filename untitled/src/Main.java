public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        Point point = new Point();
        point.print();
        ColorPoint colorPoint = new ColorPoint();
        colorPoint.print();
        Alphabet alphabet = new Alphabet();
        alphabet.setY(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());
        Zombie zombie1 = new Zombie("Alice");
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);
    }
}
