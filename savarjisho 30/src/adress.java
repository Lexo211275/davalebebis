import java.util.Objects;

public class adress
{
    String qalaqi;
    String qucha;

    public adress(String qalaqi, String qucha) {
        this.qalaqi = qalaqi;
        this.qucha = qucha;
    }

    public String getQalaqi() {
        return qalaqi;
    }

    public void setQalaqi(String qalaqi) {
        this.qalaqi = qalaqi;
    }

    public String getQucha() {
        return qucha;
    }

    public void setQucha(String qucha) {
        this.qucha = qucha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        adress adress = (adress) o;
        return Objects.equals(qalaqi, adress.qalaqi) && Objects.equals(qucha, adress.qucha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qalaqi, qucha);
    }

    @Override
    public String toString() {
        return "adress{" +
                "qalaqi='" + qalaqi + '\'' +
                ", qucha='" + qucha + '\'' +
                '}';
    }
    public Class clone()
    {
        return getClass();
    }
}
