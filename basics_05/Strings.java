package basics_05;

public class Strings {
    public static void main(String[] args) {
         // 1. Declaring and Initializing Strings
         System.out.println("1. Declaring and Initializing Strings");
         String str1 = "Hello, World!"; // String literal
         String str2 = new String("Hello, World!"); // Using new keyword
         System.out.println("str1: " + str1);
         System.out.println("str2: " + str2);
         
         // 2. String Length
         System.out.println("\n2. String Length");
         System.out.println("Length of str1: " + str1.length());
         
         // 3. Accessing Characters (charAt)
         System.out.println("\n3. Accessing Characters (charAt)");
         System.out.println("Character at index 0 of str1: " + str1.charAt(0));
         
         // 4. Substring
         System.out.println("\n4. Substring");
         System.out.println("Substring of str1 from 0 to 5: " + str1.substring(0, 5));
         
         // 5. Index of a Substring
         System.out.println("\n5. Index of a Substring");
         System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
         
         // 6. Last Index of a Character
         System.out.println("\n6. Last Index of a Character");
         System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf("o"));
         
         // 7. String Equality (equals and equalsIgnoreCase)
         System.out.println("\n7. String Equality");
         String str3 = "hello";
         System.out.println("str1.equals(str3): " + str1.equals(str3)); // Case-sensitive
         System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // Case-insensitive
         
         // 8. Lexicographical Comparison (compareTo)
         System.out.println("\n8. Lexicographical Comparison");
         String str4 = "apple";
         String str5 = "banana";
         System.out.println("str4.compareTo(str5): " + str4.compareTo(str5));
         
         // 9. Case Conversion (toUpperCase and toLowerCase)
         System.out.println("\n9. Case Conversion");
         System.out.println("str1 to upper case: " + str1.toUpperCase());
         System.out.println("str1 to lower case: " + str1.toLowerCase());
         
         // 10. Trimming Whitespaces
         System.out.println("\n10. Trimming Whitespaces");
         String spaced = "   Hello, World!   ";
         System.out.println("Trimmed spaced string: '" + spaced.trim() + "'");
         
         // 11. Replacing Characters and Substrings
         System.out.println("\n11. Replacing Characters and Substrings");
         System.out.println("Replace 'o' with '0' in str1: " + str1.replace('o', '0'));
         System.out.println("Replace 'World' with 'Java' in str1: " + str1.replaceAll("World", "Java"));
         
         // 12. Splitting a String
         System.out.println("\n12. Splitting a String");
         String sentence = "Java is fun";
         String[] words = sentence.split(" ");
         System.out.println("Words in sentence:");
         for (String word : words) {
             System.out.println(word);
         }
         
         // 13. Matching a String with Regex
         System.out.println("\n13. Matching a String with Regex");
         String email = "example@example.com";
         boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
         System.out.println("Is email valid: " + isValid);
         
         // 14. Checking Start and End of a String
         System.out.println("\n14. Checking Start and End of a String");
         System.out.println("Does str1 start with 'Hello': " + str1.startsWith("Hello"));
         System.out.println("Does str1 end with '!': " + str1.endsWith("!"));
         
         // 15. Joining Strings
         System.out.println("\n15. Joining Strings");
         String joined = String.join(", ", "Java", "is", "fun");
         System.out.println("Joined string: " + joined);
         
         // 16. Converting Values to String (valueOf)
         System.out.println("\n16. Converting Values to String");
         String numStr = String.valueOf(123);
         String boolStr = String.valueOf(true);
         System.out.println("String representation of 123: " + numStr);
         System.out.println("String representation of true: " + boolStr);
         
         // 17. StringBuilder for Mutable Strings
         System.out.println("\n17. StringBuilder for Mutable Strings");
         StringBuilder sb = new StringBuilder("Hello");
         sb.append(", World!");
         System.out.println("StringBuilder content: " + sb.toString());
         
         // 18. StringBuffer for Thread-Safe Mutable Strings
         System.out.println("\n18. StringBuffer for Thread-Safe Mutable Strings");
         StringBuffer sbf = new StringBuffer("Hello");
         sbf.append(", World!");
         System.out.println("StringBuffer content: " + sbf.toString());
         
         // 19. String Pool and Memory Management Example
         System.out.println("\n19. String Pool and Memory Management Example");
         String str6 = "Java";
         String str7 = "Java";
         String str8 = new String("Java");
         System.out.println("str6 == str7: " + (str6 == str7)); // true, same instance in pool
         System.out.println("str6 == str8: " + (str6 == str8)); // false, different memory allocations
    }
}