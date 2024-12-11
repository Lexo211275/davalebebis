public class product
{
    private int price;
    private int date;
    product(int price, int date)
    {
        this.price=price;
        this.date=date;
    }
    public int getprice()
    {
        return price;
    }
    public int getdate()
    {
        return date;
    }

    public product(int price) {
        this.price = price;
    }
}
