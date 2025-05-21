import java.util.Scanner;

class Prime_numer{
    int n;
    public Prime_numer(int num)
    {

        n=num;
    }
    boolean check()
    {
        int count=0,i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==0)
        {
            return true;
        } 
        else
        {
            return false;
        }  
    }

}

public class prime_2 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd  number");
        int num2=sc.nextInt();
        Prime_numer p=new Prime_numer(num1);
        boolean result1= p.check();
        System.out.println(result1);
        Prime_numer p2=new Prime_numer(num2);
        boolean result2= p2.check();
        System.out.println(result2);
        if(result1 && result2)
        {
            if(num1-num2 ==2 || num2-num1==2)
            {
                System.out.println("These are twin prime numbers");

            }
            else
            {
                System.out.println("The is not two prime numer");

            }

        }
        else
        {
            System.out.println("The is not two prime numer");

        }
        

    }
    
}
