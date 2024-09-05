package org.example.string;

public class FIndFistOccurranceInString {
    public static void main(String[] args) {
        String s="chuitanyachai";
        String s2="chai";

        //System.out.println(s.substring(1,4));
        System.out.println(solution(s,s2));
    }

    public static int solution(String haystack, String needle)
    {
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {

             if(haystack.substring(i,i+needle.length()).equals(needle))
             {
                 return i;
             }
        }
        return -1;
    }
}
