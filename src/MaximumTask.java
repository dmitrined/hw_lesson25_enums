import java.util.Scanner;

public class MaximumTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите процент освещенности луны: ");
        double percent = scanner.nextDouble();

        MoonPhases phase = MoonPhases.valueOf(percent);


        String phaseDescription = MinimumTask.getPhaseDescription(String.valueOf(phase));

        System.out.println(phase.name() + ": " + phaseDescription);


        scanner.close();
    }

}
