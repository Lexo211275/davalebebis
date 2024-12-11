public class samkutxedi extends figure
{
    private int gverdi1;
    private int gverdi2;
    private int gverdi3;
    samkutxedi(int gverdi1, int gverdi2, int gverdi3)
    {
        this.gverdi1=gverdi1;
        this.gverdi2=gverdi2;
        this.gverdi3=gverdi3;
    }
    public int getArea() {
        return Mart.sqrt((gverdi1+gverdi2+gverdi3)/2*gverdi1+(gverdi1+gverdi2+gverdi3)/2*gverdi1+(gverdi1+gverdi2+gverdi3)/2*gverdi1);
    }
    public int getPerimeter()
    {
        return gverdi1+gverdi2+gverdi3;
    }
}
