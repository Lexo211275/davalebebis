import java.util.Objects;

public class wingi
{
    int fasi;
    String satauri;
    String avtori;

    public wingi(int fasi, String satauri, String avori)
    {
        this.fasi = fasi;
        this.avtori = avtori;
        this.satauri = satauri;
    }

    public int getFasi() {
        return fasi;
    }

    public void setFasi(int fasi) {
        this.fasi = fasi;
    }

    public String getSatauri() {
        return satauri;
    }

    public void setSatauri(String satauri) {
        this.satauri = satauri;
    }

    public String getAvtori() {
        return avtori;
    }

    public void setAvtori(String avtori) {
        this.avtori = avtori;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        wingi wingi = (wingi) o;
        return fasi == wingi.fasi && Objects.equals(satauri, wingi.satauri) && Objects.equals(avtori, wingi.avtori);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fasi, satauri, avtori);
    }

    @Override
    public String toString() {
        return "wingi{" +
                "fasi=" + fasi +
                ", satauri='" + satauri + '\'' +
                ", avtori='" + avtori + '\'' +
                '}';
    }
}
