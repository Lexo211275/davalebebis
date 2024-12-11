import java.util.PrimitiveIterator;

public class circle extends figure{
    private int sigaane;
    private  int sigrdze;
    private int Radius;
    figure(int sigane, int sigrdze, int Radius)
    {
        this.sigrdze=sigrdze;
        this.sigane=sigane;
        this.Radius=Radius;
    }
    public int getArea() {
        return Radius*Math.PI*Math.PI;
    }
    public int getPerimeter()
    {
        return 2*Math.PI*Radius;
    }
}
