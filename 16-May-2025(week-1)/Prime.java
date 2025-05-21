
import java.util.Scanner;

class Prime{
    int num;
    public Prime(int num){
        this.num=num;
    }
    public void check_prime()
    {
        int count=0;
        for( int i=2; i<num;i++)
        {
            if(num%i==0)
            {
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("the prim numeber is "+num);
        }
        else{
            System.out.println("the  NOt prim numeber is "+num);

        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        Prime obj1=new Prime(n);
        obj1.check_prime();

    }
}
