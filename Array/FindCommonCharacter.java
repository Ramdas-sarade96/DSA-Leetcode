import java.util.*;

class Solution
 {
    public List<String> commonChars(String[] words) 
    {
        List<String> result = new ArrayList<>();

        // loop from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) 
            {
            int minCount = Integer.MAX_VALUE;

            // loop through words using index
            for (int i = 0; i < words.length; i++) 
                {
                int count = 0;

                // loop through characters using index
                for (int j = 0; j < words[i].length(); j++) 
                    {
                    if (words[i].charAt(j) == ch) 
                        {
                        
                    }
                }


                minCount = Math.min(minCount, count);
            }

            // add character minCount times
            for (int k = 0; k < minCount; k++)
                 {
                result.add(String.valueOf(ch));
            }
        }

        return result;
    }
}