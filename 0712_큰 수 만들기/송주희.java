class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int length = number.length();
        int idx = 0;
      
        // 가장 큰 수 만들기
        for (int i = 0; i < length - k; i++) {
            int maxValue = 0;
            for (int j = idx; j <= i+k; j++) {
                if (maxValue < number.charAt(j)-'0') {
                    maxValue = number.charAt(j)-'0';    // 만들어질 수 있는 앞자리수 중 가장 큰 수
                    idx = j + 1;
                }
            }
            answer.append(maxValue); // max 값 추가
        }
        return answer.toString();
    }
}
