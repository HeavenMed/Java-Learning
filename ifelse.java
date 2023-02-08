import java.util.Scanner;

public class ifelse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e verei se ele é ímpar ou par");
        int N = scanner.nextInt();

        if(N%2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é ímpar");
        };

        if (N % 2 == 0 && N>=6 && N<=20){
            System.out.println("Weird");
        }
        // If N is even and in the inclusive range of [2,5] print Not Weird
        else if (N % 2 == 0 && N>=2 && N<=5){
            System.out.println("Not Weird");
    
        }
        // If N is even and greater than 20 print Not Weird
        else if (N % 2 == 0 && N>20){
            System.out.println("Not Weird");
        }
        // If N is odd print Weird
        else{
            System.out.println("Weird");
        }
    
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
        scanner.close();




    }
    
}
