package arrays.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {

        int hayStackLength =haystack.length();
        int needleLength = needle.length();
        int index = 0;

        for (int i = 0; i < hayStackLength; i++){
            for (int j = 0; j < needle.length(); j++){
                if (haystack.charAt(i) == needle.charAt(index)){
                    index++;
                }else {
                    i = i - index;
                }
                if (needleLength == index){
                    return i- needleLength +1;
                }
            }
        }
        return -1;

    }
}
