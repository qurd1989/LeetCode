import javax.swing.plaf.nimbus.State;

public class ConvertDateToBinary {
   static String result = "";
    public static void main(String[] args) {
        String date = "2020-10-10";
        System.out.println(convertDateToBinary(date));
    }
    public static String convertDateToBinary(String date) {

//        String [] dateParts = date.split("-");
//        int year = Integer.parseInt(dateParts[0]);
//        int month = Integer.parseInt(dateParts[1]);
//        int day = Integer.parseInt(dateParts[2]);
//        String yearBinary  = Integer.toBinaryString(year);
//        String monthBinary = Integer.toBinaryString(month);
//        String dayBinary = Integer.toBinaryString(day);
//        String result = yearBinary + "-" + monthBinary + "-" + dayBinary;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        decToBinary(year);
        result = "-" + result;
        decToBinary(month);
        result = "-" + result;
        decToBinary(day);
        return result;
    }
    public static void decToBinary(int n) {

        while (n>>1 != 0) {
          if ((n & 1)== 1){
              result = "1" + result;
          }else
                result = "0" + result;
        }
    }
}
