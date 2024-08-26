import java.util.*;

class strr {
    static Map<String, Integer> mem = new HashMap<>();

    public static int maxGroups(int batchSize, int[] groups) {
        int len = groups.length;
        int[] dict = new int[batchSize];
        int cnt = 0;
        for (int grp : groups) {
            int rem = grp % batchSize;
            dict[rem]++;
            if (rem != 0)
                cnt++;
        }
        for (int i = 1; i <= batchSize / 2; i++) {
            int match = Math.min(dict[i], dict[batchSize - i]);
            if (i == batchSize / 2 && batchSize % 2 == 0)
                match /= 2;
            dict[0] += match;
            dict[i] -= match;
            dict[batchSize - i] -= match;
            cnt -= match * 2;
        }
        return dict[0] + helper(batchSize, cnt, dict, 0);
    }

    public static int helper(int batch, int cnt, int[] dict, int rem) {
        if (cnt == 0)
            return 0;
        String key = Arrays.toString(dict) + rem;
        if (mem.containsKey(key))
            return mem.get(key);
        int len = dict.length;
        int res = rem == 0 ? 1 : 0;
        int local = 0;
        for (int i = 1; i < len; i++) {
            if (dict[i] == 0)
                continue;
            dict[i]--;
            while (rem < i)
                rem += batch;
            local = Math.max(local, helper(batch, cnt - 1, dict, rem - i));
            dict[i]++;
        }
        res += local;
        mem.put(key, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxGroups(8, new int[] { 1, 1 }));
    }
}