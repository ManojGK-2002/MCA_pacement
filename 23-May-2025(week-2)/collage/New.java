
public class New {
    public void Title(String str)
    {   
        String s = " "+str;
        System.out.println(s);
          for(int i=0;i<s.length();i++)
          {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                char c= s.charAt(i+1);
                System.out.println(c);
            }
          }
    }

    public static void main(String[] args) {
        New obj=new New();
        String str ="My name is manoj I am from banagluru";
        obj.Title(str);
        
    }
}
