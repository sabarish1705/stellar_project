import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pre=0;
        int cur=0;
        int nex=1;
        int temp=0;
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(pre);
            temp=cur+pre+nex;
            pre=cur;
            cur=nex;
            nex=temp;
            
        }
    }
}