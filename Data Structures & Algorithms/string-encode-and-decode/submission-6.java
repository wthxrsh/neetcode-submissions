
class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();
        for (String s : strs) {
            word.append(s.length()).append('#').append(s);
        }
        return word.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int j = index;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(index, j));
            index = j + 1;
            j = index + length;
            res.add(str.substring(index, j));
            index = j;
        }
        return res;
    }
}
