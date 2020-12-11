public class CheckNumSystem {
    private static boolean isArab;
    private static boolean isRome;

    /**
     * Проверяем строку на наличие арабских цифр
     * @param s
     * @return
     */
    public static boolean checkArabNum(String s) {
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if(!isArabDigit(chArr[i])) {
                isArab = false;
            } else {
                isArab = true;
            }
        }
        return isArab;
    }

    /**
     * Проверяем строку на наличие Римских символов
     * @param s
     * @return
     */
    public static boolean checkRomeNum(String s) {
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if(!isRomeDigit(chArr[i])) {
                isRome = false;
            }else {
                isRome = true;
            }
        }
        return isRome;
    }

    public static boolean isRomeDigit (char c) {
        return c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M';
    }

    public static boolean isArabDigit (char c) {
        return c >= '0' && c <='9';
    }

    public static String checkSign(String s) throws Exception {
        char c = s.charAt(0);
        String res = "";
        if(c == '+' || c == '-' || c == '*' || c=='/') {
            res = s;
        }else {
            throw new Exception("Такого знака нет");
        }
        return res;
    }
}
