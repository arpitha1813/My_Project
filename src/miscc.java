import java.util.Arrays;
import java.util.Scanner;

class miscc
{
    static String func(String str)
    {
        str=str.replaceAll("0","4");
        str=str.replaceAll("1","0");
        str=str.replaceAll("4","1");


        return str;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner scanner=new Scanner(System.in);
        int testcases=scanner.nextInt();
        for(int i=1;i<=testcases;i++)
        {
            String str=scanner.next();
            int magic_wand=0;


            for(int k=0;k<str.length();k++)
            {
                if(str.charAt(k)=='0'){
                    magic_wand++;

                    str=miscc.func(str);

                }
            }

            System.out.println(magic_wand);
        }


    }
}
