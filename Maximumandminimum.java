
package code;

import java.util.Scanner;


public class Maximumandminimum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int [] num = new int [5];
        
        int sum=0,i,min,max;
        
        System.out.print("Enter a Five Number");
        for(i=0; i<5; i++)
        {
            num[i]=input.nextInt();
        }
        
        for(i=0; i<5; i++)
        {
            sum = sum+num[i];
        }
        
        
        
        System.out.println("The sum is :"+sum);
        System.out.println("The Average "+sum/5);
        
        max = num[0];
        min= num[0];
        
        for(i=0; i<5; i++)
        {
            if(max<num[i])
            {
                max=num[i];
            }
            
            if(min>num[i])
            {
                min = num[i];
            }
        }
        
        System.out.println("The Maximum Number: "+max);
        System.out.println("The Minimum Number: "+min);
        
    }
    
}
