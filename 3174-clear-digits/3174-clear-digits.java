class Solution {
    public String clearDigits(String s)
     {
               Stack<Character> st = new Stack<>();
        StringBuilder stBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
            {
                st.push(ch);
            }
            else
            {
                st.pop();
            }
        }

        for(Character ch:st)
        {
            stBuilder.append(ch);
        }

        return stBuilder.toString();
     
    
    }
}