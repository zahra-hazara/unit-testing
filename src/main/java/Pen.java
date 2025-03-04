
public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        public String toString() { return color; }
    }

    private Color color;
    private boolean isCapped;

    public Pen() {
        this(Color.RED); // Default color is red
    }

    public Pen(Color color) {
        this.color = color;
        this.isCapped = true; // Pen is capped by default
    }

    public void capOff() {
        this.isCapped = false;
    }

    public void capOn() {
        this.isCapped = true;
    }

    public void changeColor(Color newColor) {
        this.color = newColor; // Update the color immediately
    }

    public String draw() {
        if (isCapped) {
            return ""; // Pen is capped, so it cannot draw
        } else {
            return "Drawing " + color.toString(); // Draw with the current color
        }
    }
}