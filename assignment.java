import java.util.*;
class assignment
{
    public static void add(int a,int b,int c,int d,int e)
    {
        int f=a+b+c+d+e;
        System.out.println("THE ADDITION OF THE FIVE NUMBER IS : "+f);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER-1:");
        int a=input.nextInt();
        System.out.println("ENTER NUMBER-2:");
        int b= input.nextInt();
        System.out.println("ENTER NUMBER-3:");
        int c=input.nextInt();
        System.out.println("ENTER NUMBER-4:");
        int d=input.nextInt();
        System.out.println("ENTER NUMBER-5:");
        int e=input.nextInt();
        add(a,b,c,d,e);

    }
}