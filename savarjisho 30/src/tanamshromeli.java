import java.util.Objects;

public class tanamshromeli
{
    int id;
    String saxeli;
    adress adress;

    public tanamshromeli(int id, String saxeli, adress adress) {
        this.id = id;
        this.saxeli = saxeli;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaxeli() {
        return saxeli;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public adress getAdress() {
        return adress;
    }

    public void setAdress(adress adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        tanamshromeli that = (tanamshromeli) o;
        return id == that.id && Objects.equals(saxeli, that.saxeli) && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, saxeli, adress);
    }

    @Override
    public String toString() {
        return "tanamshromeli{" +
                "id=" + id +
                ", saxeli='" + saxeli + '\'' +
                ", adress=" + adress +
                '}';
    }

}
