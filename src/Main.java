import java.util.Scanner;

public class Main {
    @SuppressWarnings({"StringEquality", "ConvertToTryWithResources"})
    public static void main(String[] args) throws Exception {

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

            // builtin echo command
            if ("echo".equals(tokens[0])){
                for (int i = 0; i < arguments.length; i++){
                    if (i < arguments.length - 1){
                        System.out.print(arguments[i] + " ");
                    }
                    else {
                        System.out.println(arguments[i]);
                    }
                }
            }
            else {
                System.out.println(command + ": command not found");
            }
            
        }

        scanner.close();
    }
}