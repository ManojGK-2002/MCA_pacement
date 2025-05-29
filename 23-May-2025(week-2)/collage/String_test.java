
public class String_test {
        public static void main(String[] args) {
            String s ="CompUter";
            System.out.println("the len"+ s.length());
            System.out.println("the serch for index"+ s.indexOf("o"));
            System.out.println("the serch  for inder which index  "+ s.charAt(3));
            System.out.println("the Substring  "+ s.substring(2,3));
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(Character.isUpperCase(ch))
                {
             System.out.println("the serch for index"+ s.indexOf("o"));
 
                }
            }


        }
}
