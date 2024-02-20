import java.util.Scanner;

    public class Algo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();

            int count = countVNCharacters(input);
        }

        public static int countVNCharacters(String input) {
            int count = 0;
            String[] viChars = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
            for (String viChar : viChars) {
                if (input.contains(viChar)) {
                    count++;
                    input = input.replaceAll(viChar, "");
                }
            }
            return count;
        }
    }

