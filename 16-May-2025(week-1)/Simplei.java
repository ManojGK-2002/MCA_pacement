import java.util.*;
class Simplei{
    int p,r,t;
    public Simplei(int p,int r,int t)
    {
        this.p=p;
        this.r=r;
        this.t=t;
    }
    public double calc(){
        double si=(p*t*r)/100;
        return si;
    }
    public double total(double result){
        double am=p+result;
        return am;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principlle amount");
        int p1 =sc.nextInt();
        System.out.println("Enter rate");
        int r1=sc.nextInt();
        System.out.println("Enter time");
        int t1=sc.nextInt();
        Simplei obj1 = new Simplei(p1,r1,t1);
        double result=obj1.calc();
        System.out.println("The simple interste is"+result);

        double amo=obj1.total(result);
        System.out.println("The simple interste is"+amo);
    }
}