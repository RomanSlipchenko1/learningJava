package chapter1exercises;
// Вивести:
// - числа в порядку зменшення частоти, з якою числа зустрічаються

public class B8_FrequencyOfNums {
    public static void numsByFrequency(int[] ints) {
        // Створюємо масив для накопичення повторів
        StringBuffer[] stringBuffers = new StringBuffer[ints.length];
        // Ініціюємо масив
        for (int i = 0; i < stringBuffers.length; i++) {
            stringBuffers[i] = new StringBuffer();
        }
        // Щоб мати можливість присвоювати нуль вже перевіреним числам, спочатку
        // рахуємо частоту нулів в масиві
        int tempInt = 0;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == tempInt) {
                stringBuffers[index].append(ints[i]);
                stringBuffers[index].append(" ");
            }
        }
        index++;

        // Зовнішній масив присвоює tempInt значення, з яким порівнювати
        for (int x = 0; x < ints.length; x++) {
            // Нулі пропускаємо
            if (ints[x] == 0) {
                continue;
            }
            tempInt = ints[x];

            // Перебираємо масив, порівнюючи значення з усіма елементами масиву
            // Значення до х можна виключити з перевірки, адже всі збіги з ними вже виявлено
            for (int i = x; i < ints.length; i++) {
                if (tempInt == ints[i]) {
                    stringBuffers[index].append(ints[i]);
                    stringBuffers[index].append(" ");
                    ints[i] = 0;
                }
            }
            index++;
        }

        // Сортуємо масив SB за довжиною послідовностей
        boolean needToBeSorted = true;
        StringBuffer tempSB = new StringBuffer();

        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < stringBuffers.length; i++) {
                if (stringBuffers[i].length() > stringBuffers[i - 1].length()) {
                    tempSB.append(stringBuffers[i]);
                    stringBuffers[i].delete(0, stringBuffers.length);
                    stringBuffers[i].append(stringBuffers[i - 1]);
                    stringBuffers[i - 1].delete(0, stringBuffers[i - 1].length());
                    stringBuffers[i - 1].append(tempSB);
                    tempSB.delete(0, tempSB.length());
                    needToBeSorted = true;
                }
            }
        }

        // Виводимо результат, крім пустих значень
        for (int i = 0; i < stringBuffers.length; i++) {
            if (!stringBuffers[i].isEmpty()) {
                System.out.print(stringBuffers[i] + " ");
            }
        }
    }






}
