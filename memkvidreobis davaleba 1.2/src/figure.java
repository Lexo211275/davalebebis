public class figure
{
    private int sigrdze;
    private  int sigane;
    figure(int sigrdze, int sigane)
   {
       this.sigrdze=sigrdze;
       this.sigane=sigane;
   }
   public int getArea() {
       return sigrdze*sigane;
   }
   public int getPerimeter()
   {
       return (sigrdze+sigane)*2;
   }
}
