class Solution {
    public int numberOfSpecialChars(String word) {

        int answer = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            int lastSmall = word.lastIndexOf(ch);

            int firstCapital = word.indexOf(Character.toUpperCase(ch));

            // both should exist
            // and small letter must come before capital letter
            if (lastSmall != -1 &&
                firstCapital != -1 &&
                lastSmall < firstCapital)
                 {

                answer++;
            }
        }

        return answer;
    }
}