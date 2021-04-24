public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape red = new Shape("red", true);

        s.setColor("blue navy");
        s.setFilled(false);
        System.out.println("The Color is " + red.getColor());
        System.out.println("Shape with color "+ red.getColor() + " is " + (red.isFilled() ? "filled" : "Not filled"));
        System.out.println(s.toString());

    }
}
