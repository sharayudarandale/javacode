public class addSpace {
    
        public String addSpaces(String s, int[] spaces) {
            StringBuilder result = new StringBuilder();
            int spaceIndex = 0; // Pointer for spaces array
    
            // Iterate through the string
            for (int i = 0; i < s.length(); i++) {
                // Check if the current index matches the next space position
                if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                    result.append(' '); // Add a space
                    spaceIndex++; // Move to the next space position
                }
                // Add the current character
                result.append(s.charAt(i));
            }
    
            return result.toString();
        }
    }
    

