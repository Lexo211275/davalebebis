public class Elf extends  WorkshopMember implements ChristmasCelebrator
{
        String name;
        int skillLevel;
        String elfType;

        public Elf(String name, int age, int skillLevel, String elfType) {
            super(name, age); // Calling the parent class constructor
            this.skillLevel = skillLevel;
            this.elfType = elfType;
        }

        public int getSkillLevel() {
            return skillLevel;
        }

        public void setSkillLevel(int skillLevel) {
            this.skillLevel = skillLevel;
        }

        public String getElfType() {
            return elfType;
        }

        public void setElfType(String elfType) {
            this.elfType = elfType;
        }

        public void makeToy() {
            System.out.println(getName() + " is making a toy!");
            increaseExperience();
        }

        public void wrapGifts() {
            System.out.println(getName() + " is wrapping gifts!");
            increaseExperience();
        }

        private void increaseExperience() {
            skillLevel++;
            System.out.println("Experience increased! Current skill level: " + skillLevel);
        }

        @Override
        public void celebrateChristmas() {
            System.out.println(getName() + " is celebrating Christmas!");
        }

    @Override
    public void hostChristmasParty() {

    }
}
