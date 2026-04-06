class internal8b  {
    public static void main(String[] args) {
        String s = "banana";
        int max = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = s.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + result);
    }
}