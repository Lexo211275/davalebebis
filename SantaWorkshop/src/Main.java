public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Buddy", 12, 20, "green");
        Elf elf2 = new Elf("Jingles", 20, 35, "veteran");
        elf1.makeToy();
        elf2.wrapGifts();
        Reindeer reindeer1 = new Reindeer("Rudolph", 15, 1500, "red");
        Reindeer reindeer2 = new Reindeer("Dasher",5, 150, "blue");
        reindeer1.fly();
        reindeer2.checkFitnessLevel();
        Child child1 = new Child("Alice", 7);
        Child child2 = new Child("Tom", 2);
        child2.addWish("nuke");
        System.out.println(child2.getWishList());
        Santa santa = new Santa("Nicolas", "North", 1755);
        santa.checkNaughtyOrNiceList(child1);
        santa.deliverGifts();
        snowMan snowMan = new snowMan(12, "black", true);
        snowMan.decorate("carrot");
        snowMan.melt();
    }
}