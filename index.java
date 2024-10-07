public class index {
    public static void main(String[] args) {
        System.out.println(Str("sww", "sad"));
    }

    static int Str(String haystack, String needle) {
        // If needle is empty, return 0 as per standard strStr behavior.
        if (needle.length() == 0) {
            return 0;
        }

        // Loop through the haystack to find the first occurrence of the needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the first character matches
            if (haystack.charAt(i) == needle.charAt(0)) {
                // Check if the substring matches the needle
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }

        // Return -1 if no match is found
        return -1;
    }
}
