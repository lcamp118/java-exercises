package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args){
        String pretend = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> characterCount = new HashMap<>();

        char[] charactersInString = pretend.toCharArray();
        for (char c : charactersInString){

            if (characterCount.containsKey(c)) {
                characterCount.put(c,characterCount.get(c) + 1);
            }
            else{
                characterCount.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
    }
}
