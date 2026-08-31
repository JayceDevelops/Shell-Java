import java.util.Arrays;
import java.util.Scanner;

public class Main {
    @SuppressWarnings({"StringEquality", "ConvertToTryWithResources"})
    public static void main(String[] args) throws Exception {

        String[] builtin = {"echo", "exit", "type"};
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while(!"exit".equals(command)){

            System.out.print("$ ");
            command = scanner.nextLine();

            if ("exit".equals(command)){
                break;
            }

            // Turns command into a tokens; tokens[0] = utility, tokens[1 - length] = arguments
            String[] tokens = command.split(" ");

            // Retrieves arguments
            String[] arguments = new String[tokens.length - 1];
            for (int i = 0; i < arguments.length; i++){
                arguments[i] = tokens[i + 1];
            }

            // Built-In Functions
            switch(tokens[0]){

                case "echo" -> {
                    for (int i = 0; i < arguments.length; i++){
                        if (i < arguments.length - 1){
                            System.out.print(arguments[i] + " ");
                        }
                        else {
                            System.out.println(arguments[i]);
                        }
                    }
                }

                case "type" -> {
                    if (Arrays.asList(builtin).contains(arguments[0])){
                        System.out.println(tokens[1] + " is a shell builtin");
                    }
                    else {
                        System.out.println(tokens[1] + ": not found");
                    }
                }
                 
                default -> {
                    System.out.println(tokens[0] + ": command not found");
                }
            }
            
        }
        scanner.close();
    }
}
