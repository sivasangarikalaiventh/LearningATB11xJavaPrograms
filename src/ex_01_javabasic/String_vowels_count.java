package ex_01_javabasic;
//Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4
public class String_vowels_count {
    public static void main(String[] args) {
        {
            String a = "pramod";
            int vowels = 0;
            int consonents = 0;
            for (int i = 0; i < a.length(); i++) {
                char input = a.charAt(i);
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                    vowels++;
                } else {
                    consonents++;
                }

            }
            System.out.println("vowels " + vowels + "consonents " + consonents);
        }}}
