import java.util.Scanner;

public class Main {
    @SuppressWarnings({"StringEquality", "ConvertToTryWithResources"})
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("$ ");
        String input = scanner.nextLine();

        while(!"exit".equals(input)){

            // Tokenization of command
            String[] tokens = input.split(" ");

            // Retrieves arguments
            String[] arguments = new String[tokens.length - 1];
            for (int i = 0; i < arguments.length; i++){
                arguments[i] = tokens[i + 1];
            }

            // Built-In Functions
            switch(tokens[0]){

                // Echo Utility
                case "echo" -> {
                    Built_In.echo(arguments);
                }

                // Type Utility
                case "type" -> {
                    Built_In.type(tokens[1]);
                }
                 
                default -> {
                    System.out.println(tokens[0] + ": command not found");
                }
            }

            System.out.print("$ ");
            input = scanner.nextLine();
            
        }
        scanner.close();
    }
}
