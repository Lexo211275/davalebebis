public class BasketballPlayer
{
    private String firstName;
    private String lastName;
    private int pointsScored;
    private int rebounds;
    private int blocks;
    private int assists;
    private int turnovers;

    public BasketballPlayer(String firstName, String lastName, int pointsScored, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pointsScored = pointsScored;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double calculateRating() {
        return (pointsScored * 1) + (rebounds * 1) + (blocks * 2) + (assists * 1.5) - (turnovers * 2);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " | Rating: " + calculateRating();
    }
}
