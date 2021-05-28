import java.util.ArrayList;
import java.util.Scanner;

public class udderred {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter numbers: ");
        char[] alphabet = sc.nextLine().toCharArray();
        //System.out.println("enter numbers: ");
        char[] word = sc.nextLine().toCharArray();
        ArrayList<Character> alphabetlist = new ArrayList<Character>();
        for(int i=0;i<alphabet.length;i++)
        {
            alphabetlist.add(alphabet[i]);
        }
        ArrayList<Character> wordlist = new ArrayList<Character>();
        for(int i=0;i<word.length;i++)
        {
            wordlist.add(word[i]);
        }
        ArrayList<Character> finished = new ArrayList<Character>();
        int counter = 0;
        int check=0;
        while(true) {
            for (int i = 0; i < alphabetlist.size(); i++) {
                Character letter = alphabetlist.get(i);
                //System.out.println(letter);
                //System.out.println("word: "+ wordlist.size());
                //System.out.println("check: "+ check);
                if(check<wordlist.size()) {
                    if (letter == wordlist.get(check)) {
                        finished.add(wordlist.get(0));
                        check++;
                        //wordlist.remove(0);
                    }
                }
            }
            counter++;
            if(finished.size() == word.length)
                break;
        }
        System.out.println(counter);
    }
}
