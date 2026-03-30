class Solution {

    public String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();
        for(String st : strs){
            int l = st.length();
            str.append(l).append("#").append(st);

        }
        return str.toString();


    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

    while (i < s.length()) {
        // 1️⃣ Find the position of the '#' separator
        int j = i;
        while (s.charAt(j) != '#') {
            j++;
        }

        // 2️⃣ Extract the length before '#'
        int length = Integer.parseInt(s.substring(i, j));

        // 3️⃣ Extract the actual string after '#'
        String word = s.substring(j + 1, j + 1 + length);
        result.add(word);

        // 4️⃣ Move pointer to next segment
        i = j + 1 + length;
    }

    return result;    
         


    }
}
