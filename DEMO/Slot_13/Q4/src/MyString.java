import java.util.Arrays;

public class MyString implements IString {
    public int f1(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isPrimeDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversed.append(reversedWord).append(" ");
        }

        return reversed.toString().trim();
    }

    private boolean isPrimeDigit(char c) {
        int digit = Character.getNumericValue(c);
        if (digit < 2) {
            return false;
        }
        for (int i = 2; i * i <= digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
