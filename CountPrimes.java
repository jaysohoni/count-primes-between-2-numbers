import java.util.*;
public class CountPrimes
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int pbig = sc.nextInt();
        int psmall = sc.nextInt();
        int temp = 0;
        
        if(pbig > psmall)
        {
            
        }
        else if(pbig < psmall)
        {
            temp = pbig;
            pbig = psmall;
            psmall = temp;
        }
        else if(pbig == psmall)
        {
            
        }
        int pcount = 0;
        int count = 0;
 
        for(int i = psmall; i <= pbig; i++)
        {
            for(int j = 1; j <= pbig; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    
                }
            }
            
            if(count == 2)
            {
                pcount++;
                
            }
            count = 0;
        }
        
        System.out.println(pcount);
    }
}