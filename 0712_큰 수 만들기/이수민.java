class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int next = 0;
        
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            
            for (int j = index; j <= i + k; j++) {
                int current = number.charAt(j) - '0';

                if (max < current) {
                    max = current;
                    next = j;
                }
            }
            sb.append(max);
            index = next + 1;
        }
        return sb.toString();
    }
}
