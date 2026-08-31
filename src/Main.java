import java.util.Scanner;

public class Main {
    @SuppressWarnings({"StringEquality", "ConvertToTryWithResources"})
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String command = "";

        while(!"exit".equals(command)){

            System.out.print("$ ");
            command = scanner.nextLine();

            if (!"exit".equals(command)){
                System.out.println(command + ": command not found");
            }
            
        }

        scanner.close();
    }
}