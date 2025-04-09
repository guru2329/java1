public class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original StringBuffer: " + sb);
        
        // 1. Capacity
        System.out.println("Capacity: " + sb.capacity()); // Default is 16 + length of string
        
        // 2. ensureCapacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
        
        // 3. Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // 4. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // Reverse back to original
        
        // 5. Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        // 6. DeleteCharAt
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(0): " + sb);
        
        // 7. Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        
        // 8. Substring
        String sub = sb.substring(3, 8);
        System.out.println("Substring (3,8): " + sub);
        
        // 9. IndexOf
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index);
        
        // 10. LastIndexOf
        int lastIndex = sb.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);
        
        // 11. Append
        sb.append(" Java Programming");
        System.out.println("After append: " + sb);
        
        // 12. SetLength
        sb.setLength(10);
        System.out.println("After setLength(10): " + sb);
        
        // 13. SetCharAt
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt(0, 'H'): " + sb);
    }
}
