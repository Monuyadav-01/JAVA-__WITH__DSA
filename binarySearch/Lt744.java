public class Lt744 {
    public static char nextGreatestLetter(char[] letters, char target) {
    
        for (char c : letters) {
            if(c>target){
                return c;
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
        char[] letters={'c', 'f', 'g'};
        char ans=nextGreatestLetter(letters, 'a');
        System.out.println(ans);
    }
}
