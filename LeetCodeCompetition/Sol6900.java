import java.util.HashMap;

/**
 * Sol6900
 */
public class Sol6900 {

  public static int getSubArrayDistinct(int arr[], int n)
    {
        HashMap<Integer, Integer> MAP = new HashMap<Integer,Integer>()
        {
            @Override
            public Integer get(Object key)
            {
                if(!containsKey(key))
                    return 0;
                return super.get(key);
            }
        };

        for (int i = 0; i < n; ++i)
            MAP.put(arr[i], 1);
        int k = MAP.size();

        MAP.clear();

        int output = 0, right = 0, maxsa = 0;
        for (int left = 0; left < n; ++left)
        {
            while (right < n && maxsa < k)
            {
                MAP.put(arr[right], MAP.get(arr[right]) + 1);

                if (MAP.get(arr[right])== 1)
                {
                    ++maxsa;
                }

                ++right;
            }
            if (maxsa == k)
            {
                output += (n - right + 1);
            }

            MAP.put(arr[left], MAP.get(arr[left]) - 1);

            if (MAP.get(arr[left]) == 0)
                --maxsa;
        }
        return output;
    }
    public static void main(String args[])
    {
        int arr[] = { 5,5,5,5};
        int n=arr.length;
        System.out.println(getSubArrayDistinct(arr, n));
    }
}