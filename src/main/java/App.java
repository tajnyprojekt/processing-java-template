import processing.core.PApplet;

public class App extends PApplet {


    public void settings() {
        size(500, 500, P3D);
    }

    public void setup() {
        noCursor();
    }

    public void draw() {
        background(0);
        stroke(255);
        fill(0, 0);
        translate(mouseX, mouseY);
        box(50);
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        PApplet.main( App.class.getCanonicalName());
    }
}
