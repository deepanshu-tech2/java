import java.util.Scanner;

class FindInterest {
    // create variables
    float p, r;
    int t;

    // Constructor
    public FindInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount => ");
        p = sc.nextFloat();

        System.out.print("Enter the time in years => ");
        t = sc.nextInt();

        System.out.print("Enter the rate in % => ");
        r = sc.nextFloat();
    }

    // Method to calculate and return simple interest
    public float displaysi() {
        float simpleInterest = (p * r * t) / 100;
        System.out.println("Your simple interest => " + simpleInterest);
        return simpleInterest;
    }
}

public class simpleInterest{
    public static void main(String[] args) {
        FindInterest f = new FindInterest();
        f.displaysi();
    }
}
