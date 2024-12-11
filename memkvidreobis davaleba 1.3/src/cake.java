public class cake extends product
{
    private int wona;
    milk(int wona)
    {
        this.setWona(wona);
    }
    public int getWona()
    {
        return wona;
    }

    public cake(int price, int wona) {
        super(price);
        this.wona = wona;
    }

    public void setWona(int wona)
    {
        this.wona=wona;
    }
}
