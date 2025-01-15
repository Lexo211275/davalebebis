public interface ChristmasSpirit
{
    void spreadJoy();
    void singCarols();
    default void decorateTree() {
        System.out.println("1. Prepare the Tree: Set up and fluff branches of your real or artificial tree.");
        System.out.println("2. Add Lights: Start at the bottom, wrapping lights evenly around the tree.");
        System.out.println("3. Topper First: Secure a star, angel, or other topper on the tree.");
        System.out.println("4. Garland/Ribbon: Drape evenly, weaving it through branches for depth.");
        System.out.println("5. Hang Ornaments: Place larger ones first, then fill gaps with smaller ones.");
        System.out.println("6. Add Filler Items: Use pinecones, berries, or floral picks for extra texture.");
        System.out.println("7. Tree Skirt: Wrap a festive skirt around the base.");
        System.out.println("8. Final Touches: Step back, adjust decorations, and enjoy!");
    }
}

