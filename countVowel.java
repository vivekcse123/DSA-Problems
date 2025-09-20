public class countVowel {
    public static void count(String s) {
        String vowels = "aeiou";
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(ch)) {
                if (vowels.contains(String.valueOf(ch))) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowels = " + v + ", Consonants = " + c);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("String: " + str);
        count(str);
    }
}
