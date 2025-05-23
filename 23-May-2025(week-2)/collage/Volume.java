
class Volume{

      public void volume_cal(int y)
    {
            int vol_code=y*y*y;
            System.out.println("The volume of cude is"+vol_code);

    }
    public void volume_cal(double x,double y)
    {
            double vol_cy=21/7*x*x*y;
            System.out.println("The volume of cyinder is"+vol_cy);

    }
    public static void main(String[] args) {
            Volume obj =new Volume();
            obj.volume_cal(2);
            obj.volume_cal(2.34,22.3);
    }
}

