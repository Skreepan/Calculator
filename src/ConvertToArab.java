public class ConvertToArab {
    private static String[] romeNum = new String[201];

    //Создаем массив с римскикми числами
    public static void createToRomeArr() {
        for (int i = 0; i < 201; i++) {
            romeNum[i] = ConvertToRome.definitionOfNumber(i);
        }
    }

    public static int getRomanNum(String s) throws Exception {
        int res = 0;
        for (int i = 0; i < romeNum.length; i++) {
            if(s.equals(romeNum[i])) {
                res = i;
            }
        }
        if (res == 0) {
            throw new Exception("Строчка не является римским числом");
        }
        return res;
    }
}
