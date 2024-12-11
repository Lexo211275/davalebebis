public class milk extends product
{
    private int volume;
    milk(int volume)
    {
        this.setVolume(volume);
    }
    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume=volume;
    }

    public milk(int price, int volume) {
        super(price);
        this.volume = volume;
    }
}
