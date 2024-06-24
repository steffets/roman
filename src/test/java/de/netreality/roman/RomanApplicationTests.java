package de.netreality.roman;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomanApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void generateTest() {
        String text = "Wir bei der Stuttgarter Versicherung sind die besten Programmierer :)";
        //String text = "Hallo";
        for (char c : text.toCharArray()) {
            int ascii = (int) c;
            //System.out.print(ascii+ ",");
           System.out.print(getRomanNumber(ascii) + ",");
        }
    }

    @Test
    void testNumber() {
        System.out.println(getRomanNumber(1984));
    }

    private StringBuilder getRomanNumber(int n) {
        StringBuilder roman = new StringBuilder();
        int r = divide(roman, n, 1000, 'M', 100, 'C');
        r = divide(roman, r, 500, 'D', 100, 'C');
        r = divide(roman, r, 100, 'C', 10, 'X');
        r = divide(roman, r, 50, 'L', 10, 'X');
        r = divide(roman, r, 10, 'X', 1, 'V');
        r = divide(roman, r, 5, 'V', 1, 'I');
        r = divide(roman, r, 1, 'I', 0, 'I');
        return roman;
    }

    private int divide(StringBuilder roman, int number, int divider, char dividerLetter, int sub, char subLetter) {
        int x = number / divider;
        for(int i = 0; i < x; i++) {
            roman.append(dividerLetter);
            number -= divider;
        }
        if (number >= divider - sub) {
            roman.append(subLetter).append(dividerLetter);
            number -= divider-sub;
        }
        return number;
    }

}
