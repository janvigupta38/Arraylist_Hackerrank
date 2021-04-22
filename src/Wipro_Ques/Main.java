/* Give three input greater than 1000 and less than 9999 and the key from them;
 key=(smallest no at the thousand's place among all 3 inputs)(smallest no at the hundred's place among all 3 inputs)
 (smallest no at the ten's place among all 3 inputs)(smallest no at the one's place among all 3 inputs)
example-inputs are 3451,2675,1987
smallest are-[1][4][5][1]
the key-1451
 */


package Wipro_Ques;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Smallest_No sm=new Smallest_No();
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        if((input1>=1000 && input1<=9999) && (input2>=1000 && input2<=9999) && (input3>=1000 && input3<=9999)){
            int Sum=sm.Sum(input1,input2,input3);
            System.out.println(Sum);
        }
        else{
            System.out.println("Input out of Range");
        }
    }
}
