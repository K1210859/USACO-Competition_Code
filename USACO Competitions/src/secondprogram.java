import java.util.ArrayList;
import java.util.Scanner;

public class secondprogram {
    public static void main(String[] args) throws Exception {
       /* Scanner sc = new Scanner(System.in);
        //System.out.println("enter numbers: ");
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        int total=0;
        //System.out.println("enter numbers: ");
        int[] array = Integer.parseInt(sc.nextLine().split(" "));
        int[] array2 = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            array2[i] = Integer.parseInt(array[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();

        int lowerLimit = 0;
        int upperLimit = 0;
        int sum=0;
        int range=0;
        for(int i=0;i<array2.length;i++)
        {
            for(int j=i+1;j<array2.length;j++)
            {
                lowerLimit = i;
                upperLimit = j;
                range = 0;
                sum=0;
                list = new ArrayList<>();
                while(upperLimit>=lowerLimit)
                {
                    list.add(array2[lowerLimit]);
                    sum+=array2[lowerLimit];
                    lowerLimit++;
                    range++;
                }
                int yay = 0;
                if(sum%range==0)
                    yay = sum/range;
                if(list.contains(yay))
                    total++;
            }
        }
        System.out.println(n+total);*/
    }
}
