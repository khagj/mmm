import java.io.*;
import java.util.*;
class natural
{
    public static void main(String args[])
    {
        int n,i;
        Scanner j=new Scanner(System.in);
        n=j.nextInt();
        int a=0;
        for(i=0;i<n;i++)
        {
            a=i+a;
        }
        System.out.println(a);
    }
}

