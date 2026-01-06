class StringStringBuffer {
    public static void main(String[] args) 
    {
        //--Sring Operations--
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String Operation:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Concatenation

        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Length of String
        System.out.println("Length of String 3: " + str3.length());

        //Chacrer at index
        System.out.println("Character at index 1 of String 1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of String 3 (0-5): " + str3.substring(0, 5));

        // Compare two Strings
        System.out.println("Comparing String 1 and String 2: " + str1.equals(str2));

        //--StringBuffer Operations--
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("\nStringBuffer Operation:");
        System.out.println("Original `StringBuffer: " + sb);

        // Append
        sb.append(" Programming");
        System.out.println(" After Append: " + sb);

        // Insert
        sb.insert(5, " Language");
        System.out.println(" After Insert: " + sb);

        // Replace
        sb.replace(0, 4, "Python");
        System.out.println(" After Replace: " + sb);

        // Delete
        sb.delete(6, 15);
        System.out.println(" After Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println(" After Reverse: " + sb);
    }   
}
