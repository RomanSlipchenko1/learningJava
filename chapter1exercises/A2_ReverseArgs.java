package chapter1exercises;
// Відобразити в кс аргументи кс в зворотньому порядку
public class A2_ReverseArgs {

    public static void showArgsReversed(String[] strings) {

        if (strings.length > 0) {
            for (int i = strings.length - 1; i >= 0; i--) {
                System.out.print(strings[i] + " ");
            }
        } else System.out.println("Аргументи командної строки відсутні. ");

    }
}
