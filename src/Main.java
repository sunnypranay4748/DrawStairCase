import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of steps: ");
        int numSteps = scan.nextInt();
        System.out.println("Enter the width of steps: ");
        int stepWidth = scan.nextInt();

        for(int i=0; i<numSteps; i++){
            for(int j=0; j<(i+1)*stepWidth; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}