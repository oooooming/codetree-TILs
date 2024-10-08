import java.util.Scanner;

public class Main {
    public static boolean SlidingWindow(int [] A, int [] B) {
        for(int i=0; i<=A.length-B.length; i++) {
            if(A[i] == B[0]) {
                int j=0;
                while(j<B.length && B[j] == A[i+j]) {
                    j++;
                    if(j == B.length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [] A = new int [n1]; 
        int [] B = new int [n2];

        for(int i=0; i<n1; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++) {
            B[i] = sc.nextInt();
        }
        if(SlidingWindow(A, B))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}