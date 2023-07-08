import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>(Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        ));
        List<Character> numbers = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        List<Character> symbols = new ArrayList<>(Arrays.asList('!', '#', '$', '%', '&', '(', ')', '*', '+'));
        List<Character> password = new ArrayList<>();
        StringBuilder passwordGenerated = new StringBuilder(99);

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to password generator");
        System.out.println("How many letters would you like in your password?");
        int nrLetters = scanner.nextInt();

        System.out.println("How many symbols would you like?");
        int nrSymbols = scanner.nextInt();

        System.out.println("How many numbers would you like?");
        int nrNumbers = scanner.nextInt();

        for(int  i = 1;i < nrLetters+1; i++){
            char character = letters.get(rand.nextInt(letters.size()));
            password.add(character);
        }
        for(int  i = 1;i < nrNumbers+1; i++){
            char character = numbers.get(rand.nextInt(numbers.size()));
            password.add(character);
        }
        for(int  i = 1;i < nrSymbols+1; i++){
            char character = symbols.get(rand.nextInt(symbols.size()));
            password.add(character);
        }

        for(int i = 0; i < password.size(); i++){
            passwordGenerated.append(password.get(i));
        }

        System.out.println(passwordGenerated);
    }
}