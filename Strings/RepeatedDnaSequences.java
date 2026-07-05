
import java.util.*;

class RepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {

        HashSet<String> seen = new HashSet<>();
        HashSet<String> ans = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {

            String sub = s.substring(i, i + 10);

            if (!seen.add(sub)) {
                ans.add(sub);
            }
        }

        return new ArrayList<>(ans);
    }
}
