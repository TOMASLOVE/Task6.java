import java.util.*;
public class Task{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a==b && b==c)
            System.out.println("All numbers are equal");
        else if(a>b && a>c)
            System.out.println("the largest number is "+a);
         ArrayList<Integer> z = new ArrayList<>();
         z.add(input.nextInt());
         z.add(input.nextInt());
         z.add(input.nextInt());
         if(z.get(1)==z.get(2) && z.get(2)==z.get(3))
            System.out.println("All numbers are equal"); 
         else
             System.out.println("the largest number is: "+Collections.max(z));
        System.exit(0);
    }
}

