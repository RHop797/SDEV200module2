/* 
+--------------------+
| GeometricObject    |
+--------------------+
| - color: String    |
| - filled: boolean  |
+--------------------+
| + GeometricObject()|
| + getColor(): String |
| + setColor(color: String): void |
| + isFilled(): boolean |
| + setFilled(filled: boolean): void |
| + toString(): String |
+--------------------+
*/

public abstract class GeometricObject {
    private String color;
    private boolean filled;

    // No-arg constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    // Accessor methods
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

    @Override
    public String toString() {
        return "Color: " + color + " Filled: " + filled;
    }
}
