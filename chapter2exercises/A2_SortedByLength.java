package chapter2exercises;
// Відсортувати і вивести числа в порядку зростання їх довжини
// Те ж саме в зворотному порядку

public class A2_SortedByLength {

    public static void sortByLengthUP(int[] ints) {
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            strings[i] = Integer.toString(ints[i]);
        }

        boolean needToBeSorted = true;
        String tempStr;
        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].length() < strings[i - 1].length()) {
                    tempStr = strings[i - 1];
                    strings[i - 1] = strings[i];
                    strings[i] = tempStr;
                    needToBeSorted = true;
                }
            }
        }

        for (String s: strings) {
            System.out.print(s + " ");
        }
    }

    public static void sortByLengthDown(int[] ints) {
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            strings[i] = Integer.toString(ints[i]);
        }

        boolean needToBeSorted = true;
        String tempStr;
        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].length() > strings[i - 1].length()) {
                    tempStr = strings[i - 1];
                    strings[i - 1] = strings[i];
                    strings[i] = tempStr;
                    needToBeSorted = true;
                }
            }
        }

        for (String s: strings) {
            System.out.print(s + " ");
        }
    }

}
