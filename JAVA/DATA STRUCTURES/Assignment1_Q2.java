class amstrongNumber
{
    public static void main(String[] args) 
     {
        int n, count = 0, r, sum = 0;
        System.out.print("Armstrong numbers from 100 to 999: ");
        for(int i = 100; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}