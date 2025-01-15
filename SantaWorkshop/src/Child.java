import java.util.ArrayList;
import java.util.List;
public class Child
{
    String name;
    int behaviorScore;
    String wish;
    List<String> wishList = new ArrayList<>();

    public Child(String name, int behaviorScore, String wish)
    {
        this.name=name;
        this.behaviorScore=behaviorScore;
        this.wish=wish;
    }
    public int getBehaviorScore() {
        return behaviorScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public void setBehaviorScore(int behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addWish()
    {
        this.wishList.add(wish);
    }
}
