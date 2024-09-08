public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {

        String [] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        String yearBinary  = Integer.toBinaryString(year);
        String monthBinary = Integer.toBinaryString(month);
        String dayBinary = Integer.toBinaryString(day);
        String result = yearBinary + "-" + monthBinary + "-" + dayBinary;
        return result;
    }
}
