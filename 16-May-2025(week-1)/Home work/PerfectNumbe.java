/*Write a program to input a number and check whether it is a perfect number or not. */
/*A perfect number is a positive integer that equals the sum of its proper divisors (divisors excluding the number itself). 
For example, 6 is a perfect number because 1 + 2 + 3 = 6. */
class check{
    int num;
    check(int n)
    {
        num=n;
    }

    boolean perfect_or_not()
    {
        int i;
        int sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
               sum=i+sum;
            }
        }
        if(sum==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
public class PerfectNumbe {
    int num;
    public static void main(String[] args) {
         int num=28;
         check p1=new check(num);

       // System.out.println(sum);
       if(p1.perfect_or_not())
       {
        System.out.println(num+" is  a perfect number");
       }
       else
       {
            System.out.println(num+" is not  a perfect number");
       }

    }
    
}
