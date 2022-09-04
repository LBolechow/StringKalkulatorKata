package pl.lukaszbolechow;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Calculator {
    public static int add(String liczby) {
        if (liczby.isEmpty()) {
            return 0;
        } else if (liczby.contains(",") || liczby.contains("//")) {
            String[] tab = getSplit(liczby);
            List negatives = new ArrayList();
            int a = tab.length;
            int sum = 0;
            for (int i = 0; i < a; i++) {
                if (Integer.valueOf(tab[i]) < 0) {
                    negatives.add(Integer.valueOf(tab[i]));
                }
            }
            if (negatives.size() != 0) {
                throw new RuntimeException("Negatives are not allowed" + negatives);
            } else {
                for (int i = 0; i < a; i++) {
                    sum += Integer.valueOf(tab[i]);
                }
                return sum;
            }

        } else {
            return Integer.valueOf(liczby);
        }

    }

    private static String[] getSplit(String liczby) {
        if (liczby.startsWith("//")) {

            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(liczby);
            matcher.matches();
            if (matcher.matches()) {
                String delimeter = matcher.group(1);
                String toSplit = matcher.group(2);
                return toSplit.split(delimeter);
            }
        }
        return liczby.split(",|\n");
    }
}
