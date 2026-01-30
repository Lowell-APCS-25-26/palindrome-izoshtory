package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        // Remove all non-letter characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // Compare the cleaned string with its reverse
        return cleaned.equals(reverse(cleaned));
    }
    
    public String reverse(String s) {
        String n = new String();
        // Build the reversed string by iterating backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        return n;
    }
}