/*
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position
 of xth line.
Take your input from System.in.

Input Format:-
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that
line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries.
Each query will consist of two integers x and y.

Output Format
In each line, output the number located in yth position of xth line.
If there is no such position, just print "ERROR!"
*/

package ArrayList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> rows=new ArrayList<>();
        for(int i=0;i<n;i++){

            int d=sc.nextInt();
            ArrayList<Integer> columns=new ArrayList<>();
            for(int j=0;j<d;j++){
                columns.add(sc.nextInt());
            }
            rows.add(columns);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(rows.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
