package weeklyContest390;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumber {
    public static void main(String[] args) {

    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> lexicographicalNumber = new ArrayList<>();
        int currentNum = 1;
        for (int i = 1; i <= 9; i++){
            lexicographicalNumber.add(currentNum);
            if (currentNum * 10 <= n){
                currentNum *= 10;
        }else {
                while (currentNum % 10 == 9 || currentNum == n){
                    currentNum /= 10;
                }
                currentNum++;
            }
        }
        return lexicographicalNumber;
    }
}
