import java.util.Scanner;

public class pattern6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n/2+1 && j<n){
                    System.out.print("*\t");
                } else if(i<=n/2 && (j==1 || j==n)){
                    System.out.print("*\t");
                } else if(i>=n/2+1 && i<n &&(j==i || j==1)){
                    System.out.print("*\t");
                } 
                else if(i==n && (j==1 || j==n)){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}