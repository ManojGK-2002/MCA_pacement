

/*Write a program to enter a string for example "Mohandas Karmachand Gandhi" and
 generate a new String for example "M.K. Gandhi"
  using appropriate methods and constructor */
class Test1 {
    void titel(String aa) {
        String a=aa;
         int j=0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(c==' ')
            {
               
                char sa=a.charAt(j);
                j=i+1;

                System.out.print(sa+" ");                    
                //char s=a.charAt(i+1);
              //   System.out.println(s);
          }
        }
        for(int p=j; p<a.length();p++)
        {
            System.out.print(a.charAt(p));
        }
    }
}

public class String_HW {
     public static void main(String[] args)
     {
        Test1 obj =new Test1();
        String str="Mohandas Karmachand Gandhi";
        obj.titel(str);
    }
}
