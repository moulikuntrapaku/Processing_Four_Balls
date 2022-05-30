import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
    int a = 20;
    int b = 20;
    int c = 20;
    int d = 20;
    public void settings(){
        super.settings();
        size(640,400);
    }
    public void draw()
    {
        circle(a,50,20);
        circle(b,150,20);
        circle(c,250,20);
        circle(d,350,20);
        a += 1;
        b += 2;
        c += 3;
        d += 4;
    }
    }
