public class Solution670 {
    public static int maximumSwap(int num) {
        char ch[] = Integer.toString(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int max = i;
            for (int j = i; j < ch.length; j++) {
                if (ch[i] >= ch[max])
                    max = j;
            }

            if (ch[i] != ch[max]) {
                swap(ch, i, max);
                return Integer.parseInt(new String(ch));
            }
        }
        return num;

    }

    private static void swap(char[] ch, int i, int max) {
        char temp = ch[i];
        ch[i] = ch[max];
        ch[max] = temp;
    }

    public static void main(String[] args) {
        int num = 2736;
        System.out.println(maximumSwap(num));
    }
}
