public class sandwich extends product
{
    private int sigrdze;
    milk(int sigrdze)
    {
        this.setsigrdze(sigrdze);
    }
    public int getsigrdze()
    {
        return sigrdze;
    }
    public void setsigrdze(int sigrdze)
    {
        this.sigrdze=sigrdze;
    }
    public sandwich(int price, int sigrdze) {
        super(price);
        this.sigrdze = sigrdze;
    }
}
