public class recursion2
{
    void printNumberss(int n) {
        if (n == 1) {
            return n;
        }
        else
        {
            return n + printNumberss(n - 1);
        }
    }
}
