import java.util.Map;

public class Builtin {

    // Prints each argument to cli
    public static void echo(String[] args){
        for (int i = 0; i < args.length; i++){
            if (i < args.length - 1){
                System.out.print(args[i] + " ");
            }
            else {
                System.out.println(args[i]);
            }
        }
    }

    // Returns if the utility is builtin or not
    public static void type(String token){

        Map<String, String> builtinMap = Map.of(
            "echo", "builtin",
            "exit", "builtin",
            "type", "builtin"
        );

        if (builtinMap.containsKey(token)){
            System.out.println(token + " is a shell builtin");
        }
        else {
            System.out.println(token + ": not found");
        }
    }
}
