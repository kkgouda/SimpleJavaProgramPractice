public class UppercaseFirstChar {
          public static void main(String[] args) {
            String str = "welcome to java class";
            String[] words = str.split(" ");
            // StringBuilder to construct the final result
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                // Capitalize the first letter and append the rest of the word
                //int lastchar = word.length()-1;
                  result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
            // Trim the trailing space and print the result
            System.out.println(result.toString().trim());
        }
    }
//                 int lastCharIndex = word.length() - 1;
//                 result.append(word.substring(0, lastCharIndex)) // Append all except the last character
//                    .append(Character.toUpperCase(word.charAt(lastCharIndex))) // Append the uppercase last character
//                    .append(" "); /

//         int lastCharIndex = word.length() - 1;
//         result.append(Character.toUpperCase(word.charAt(0))) // First character
//             .append(word.substring(1, lastCharIndex)) // Middle part of the word
//             .append(Character.toUpperCase(word.charAt(lastCharIndex))) // Last character
//             .append(" "); // Add a space between words

/*for(String words:name){
        char ch=words.charAt(words.length()-1);
        char ch1=words.charAt(0);
        System.out.print(Character.toLowerCase(ch1)+" ");
        }*/