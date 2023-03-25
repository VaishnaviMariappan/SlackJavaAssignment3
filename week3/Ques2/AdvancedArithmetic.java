public interface AdvancedArithmetic
{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum1 = 1;
        for (int i=2;i<=n;i++){
            if (n%i == 0){
                sum1 = sum1 + i;
            }
        }
        return sum1;

    }
}
