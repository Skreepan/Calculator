public class ReadInput {
    private static String[] elements;
    private static String num1;
    private static String num2;
    private static String sign;

    /**
     * Разбиваем строку на отдельные записи
     * @param s
     * @throws Exception
     */
    public static void textSplit(String s) throws Exception {
        elements = s.split("\\s");
        if(elements.length == 3) {
            num1 = elements[0];
            num2 = elements[2];
            sign = elements[1];
        } else {
            throw new Exception("Строка была разбита больше/меньше чем на 3 строчки");
        }

    }

    public static String getNum1() {
        return num1;
    }

    public static String getNum2() {
        return num2;
    }

    public static String getSign() {
        return sign;
    }



}
