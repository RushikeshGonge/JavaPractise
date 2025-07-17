package Map.PractiseExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Alice","Bob","Alice","Bob","Tom","Harry","Harry","Harry"));

        for(String str : list)
        {
            m.compute(str, (k, freq) -> (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m);

    }
}
