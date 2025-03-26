import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        // Вывод всех значений MoonPhases
        for (MoonPhases moonPhases : MoonPhases.values()) {
            System.out.println(moonPhases.name() + " " + moonPhases.getDescription());
        }
        // Получение пользовательского ввода
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фазу луны: ");
        String userInput = scanner.nextLine();

        System.out.println(getPhaseDescription(userInput));

        scanner.close();
    }

    public static String getPhaseDescription(String userInput) {
        for (MoonPhases phase : MoonPhases.values()) {
            if (phase.name().equalsIgnoreCase(userInput)) {
                switch (phase) {
                    case NEW_MOON:
                        return "\uD83C\uDF1A Новолуние";
                    case WANING_CRESCENT:
                        return "\uD83C\uDF12 Растущий серп";
                    case FIRST_QUARTER:
                        return "\uD83C\uDF13 Первая четверть";
                    case WANING_GIBBOUS:
                        return "\uD83C\uDF14 Растущая луна";
                    case FULL_MOON:
                        return "\uD83C\uDF15 Полнолуние";
                    case WAXING_GIBBOUS:
                        return "\uD83C\uDF16 Убывающая луна";
                    case LAST_QUARTER:
                        return "\uD83C\uDF17 Последняя четверть";
                    case WAXING_CRESCENT:
                        return "\uD83C\uDF18 Убывающий серп";
                    default:
                        return "Сегодня какая-то другая фаза луны.";
                }
            }
        }
        return "Некорректный ввод фазы луны.";
    }
}