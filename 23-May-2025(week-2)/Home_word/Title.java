class TitleCase{
    String line;

    public TitleCase(String line) {
        this.line=line;
    }
    
    public void convert()
    {
        String a=" "+line;
        for(int i=0;i<a.length()-1;i++)
        {
            char ch=a.charAt(i);
            if(ch==' ')
            {
                char t=a.charAt(i+1);
                char ss =Character.toUpperCase(t);
                System.out.print(ss);
            }
            else{
            System.out.print(a.charAt(i+1));
            }
        }
    }
}
public class Title {
    public static void main(String[] args) {
    String s ="manoj bad boy";
    TitleCase obj = new TitleCase(s);
    obj.convert();
    }

}
