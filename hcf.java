import java.util.Scanner;
class findhcf{
    public int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}


public class hcf {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        findhcf f= new findhcf();
	        System.out.print("enter the first number ");
	        int a = sc.nextInt();
	        System.out.print("enter 2nd number ");
	        int b = sc.nextInt();
	        int hcf = f.findHCF(a, b);
	        System.out.print("the hcf of givem two number is "+hcf);
	        sc.close();
	        
	        
	        
	 }
	        

}
