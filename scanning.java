import java.util.Scanner; // importando


public class scanning {
    public static void main(String[] args) {

        //Para capturar um user input, usemos a classe scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name");
        String name = scanner.nextLine(); // Pega uma variável string name e atribui o input string 

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "You have  " + age + "years old");
        scanner.close();
    }
    
}
