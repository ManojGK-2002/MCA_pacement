


public class Overloading {
 
    public void display(String str,int p)
    {
         for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(p==1 && Character.isUpperCase(ch))
                {   
                    System.out.println("upper case one "+ch);
                }
                else if(p!=1 && Character.isLowerCase(ch)
                {
                         System.out.println(ch);
                 }
            }
    }  
    public void display(String str,char cha)
    {
        if(cha=='v')
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                     System.out.println("the volvels are "+ch);
                }
            }
            
        }
        else {
                 for(int i=0;i<str.length();i++)
                 {
                        char ch=str.charAt(i);
                        System.out.println(ch);    
                 }
        }
    }
       
    public static void main(String[] args) {
        Overloading obj=new Overloading();
        String str="comPuter";
        obj.display(str, 1);
        obj.display(str, 'a');

    }
}
