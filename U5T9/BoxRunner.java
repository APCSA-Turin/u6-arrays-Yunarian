package U5T9;

public class BoxRunner {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Shape shape = new Shape();
        b1.addToShape(shape);
        Box shapeBox = shape.getBox();
        System.out.println(b1 == shapeBox);
        System.out.println(shapeBox.boxInfo());
        System.out.println();
        Box b2 = new Box(20, 30, 40);
        b2.addToShape(shape);
        shapeBox = shape.getBox();
        System.out.println(b2 == shapeBox);
        System.out.println(shapeBox.boxInfo());
    }
}
