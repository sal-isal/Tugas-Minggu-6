public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String nColor, boolean nFilled){
        color = nColor;
        filled = nFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape with color of " + this.color  + " and " + ((this.filled) ? "filled" : " Not filled");
    }
}
