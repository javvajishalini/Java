
class LongestTurbulentSubarray {

    public int maxTurbulenceSize(int[] arr) {

        if (arr.length == 1) {
            return 1;
        }

        int left = 0, ans = 1;

        for (int right = 1; right < arr.length; right++) {

            int cmp = Integer.compare(arr[right - 1], arr[right]);

            if (cmp == 0) {
                left = right; 
            }else if (right == arr.length - 1
                    || cmp * Integer.compare(arr[right], arr[right + 1]) != -1) {

                ans = Math.max(ans, right - left + 1);
                left = right;
            }
        }

        return ans;
    }
}
