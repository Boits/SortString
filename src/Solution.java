import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();

        listString.add("hello wip");
        listString.add("hello zole");
        listString.add("hello arin");
        listString.add("zipskf");
        listString.add("awq");
        listString.add("kued");
        listString.add("arin erwqa");
        listString.add("hello wip kefe");
        listString.add("Breo say good");
        listString.add("Casino hello");
        listString.add("Maria kek");
        listString.add("Vindeta wash");
        listString.add("Alexandro give five");
        listString.add("Burrito bad");
        listString.add("Maria aaaa");

        sortString(listString);

        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
    }

    static void sortString(List<String> a) {
        for (int i = 1; i < a.size(); i++) {
            for (int j = 0; j < a.size() - i; j++) {
                String s1 = a.get(j).toLowerCase();
                String s2 = a.get(j + 1).toLowerCase();

                for (int k = 0; k < s1.length() && k < s2.length(); k++) {
                    if (s1.charAt(k) < s2.charAt(k)) {
                        break;
                    }

                    if (s1.charAt(k) > s2.charAt(k)) {
                        a.set(j, s2);
                        a.set(j + 1, s1);
                        break;
                    }
                }
            }
        }
    }
}
