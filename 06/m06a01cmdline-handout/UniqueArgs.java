import java.util.HashSet;

public class UniqueArgs {
    public static void main(String[] args) {
        // Opret et HashSet til at gemme unikke argumenter
        HashSet<String> uniqueArgs = new HashSet<>();

        // Iterer gennem kommandolinjeargumenterne og tilføj unikke argumenter til HashSet
        for (String arg : args) {
            // Hvis argumentet ikke allerede er til stede, tilføj det til HashSet
            if (!uniqueArgs.contains(arg)) {
                uniqueArgs.add(arg);
            }
        }

        // Udskriv unikke argumenter, én per linje
        for (String uniqueArg : uniqueArgs) {
            System.out.println(uniqueArg);
        }
    }
}
