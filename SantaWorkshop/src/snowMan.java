
import java.util.List;
import java.util.ArrayList;
public class snowMan
{
        private double height;
        private String hatColor;
        private boolean isMagical;
        private List<String> accessories;

        public snowMan(double height, String hatColor, boolean isMagical) {
            this.height = height;
            this.hatColor = hatColor;
            this.isMagical = isMagical;
            this.accessories = getAccessories();
        }




    public double getHeight()
        {
            return height;
        }

        public void setHeight(double height)
        {
            this.height = height;
        }

        public String getHatColor()
        {
            return hatColor;
        }

        public void setHatColor(String hatColor)
        {
            this.hatColor = hatColor;
        }

        public boolean isMagical()
        {
            return isMagical;
        }

        public void setMagical(boolean magical)
        {
            isMagical = magical;
        }

        public List<String> getAccessories()
        {
            return accessories;
        }


        public void decorate(String accessory)
        {
            accessories.add(accessory);
        }


        public void melt()
        {
            if (height == 0)
            {
                return;
            }

            height /= 2;
            if (height < 1)
            {
                height = 0;
            }
        }


        public void makeMagical()
        {
            isMagical = true;
        }
}


