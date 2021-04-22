package Wipro_Ques;

public class Smallest_No {
    public int Sum(int input1,int input2,int input3){
        int sum=0;
        int t1,t2,t3,t4;
        //smallest at the thousand's place
        int n1=input1/1000;
        int n2=input2/1000;
        int n3=input3/1000;
        if((n1<=n2) && (n1<=n3)){
            t1=n1;
        }
        else if ((n2<=n1) && (n2<=n3)){
            t1=n2;
        }
        else{
            t1=n3;
        }

        input1=input1%1000;
        input2=input2%1000;
        input3=input3%1000;


        //smallest at the hundred's place
        int m1=input1/100;
        int m2=input2/100;
        int m3=input3/100;
        if((m1<=m2) && (m1<=m3)){
            t2=m1;
        }
        else if ((m2<=m1) && (m2<=m3)){
            t2=m2;
        }
        else{
            t2=m3;
        }
        input1=input1%100;
        input2=input2%100;
        input3=input3%100;

        //smallest at the ten's place
        int p1 =input1/10;
        int p2 =input2/10;
        int p3 =input3/10;
        if((p1 <= p2) && (p1 <= p3)){
            t3= p1;
        }
        else if ((p2 <= p1) && (p2 <= p3)){
            t3= p2;
        }
        else{
            t3= p3;
        }

        input1=input1%10;
        input2=input2%10;
        input3=input3%10;


        //the inputs have the digit at one's place now
        if((input1<=input2) && (input1<=input3)){
            t4=input1;
        }
        else if ((input2<=input1) && (input2<=input3)){
            t4=input2;
        }
        else{
            t4=input3;
        }

        sum=sum+(t1*1000)+(t2*100)+(t3*10)+t4;
        return sum;
    }
}
