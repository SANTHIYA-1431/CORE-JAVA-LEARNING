/* String in Java:
   - A String is an object used to store a collection of characters enclosed within double quotes (" ").
   - Strings are immutable, which means their content cannot be modified after the object is created.

   Examples:
       String name = "robots";
       String number = "5678";
*/

public class stringExample {
    public static void main(String[] args) {

        // Creating a String object using the new keyword
        String str = new String("Hello");

        // Displaying the String value
        System.out.println(str);
    }
}

/* About the String Class:

   - String is a predefined final class available in the java.lang package.
   - String objects are stored in the String Pool to improve memory efficiency and object reuse.
   - Since Strings are immutable, they provide better security and support thread-safe operations.
   - Strings can be created either using string literals or the new keyword.

   Important Features of String:

   1. Immutability
      Once a String object is created, its value cannot be altered.

   2. Thread Safety
      Multiple threads can safely access the same String object without requiring synchronization because Strings are immutable.

   3. Utility Methods
      The String class provides many built-in methods such as length(), charAt(), substring(), equals(), and more for string manipulation.

   4. Implemented Interfaces
      - CharSequence:
        Provides methods to access and process character sequences.

      - Comparable<String>:
        Allows lexicographical comparison of strings using compareTo().

      - Serializable:
        Enables String objects to be converted into a byte stream for storage or transmission.
*/