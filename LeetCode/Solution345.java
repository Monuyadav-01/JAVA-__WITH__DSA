public class Solution345 {
    public  static String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int left = arr[0];
        int right = arr[n - 1];

        while (left < right) {
            while (left < right && isVowel(arr, left) == false) {
                left++;
            }
            while (left < right && isVowel(arr, right) == false) {
                right--;
            }

            swap(arr, left, right);
            left++;
            right--;
        }
        String str = "";
        for (char ch : arr) {
            str += ch;
        }
        return str;

    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static boolean isVowel(char[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s =  "hello";
        System.out.println(reverseVowels(s));
    }
}
