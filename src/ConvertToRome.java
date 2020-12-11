public class ConvertToRome {

    /**
     *
     * @param num
     * @return
     */

    public static String definitionOfNumber(int num)
    {
        String res = "";
        int units;
        int dozens;
        int hundreds;
        int thousands;
        if(num>=1000)
        {
            thousands = (int)num/1000;
            num -= thousands * 1000;
            res += conToThousand(thousands);
        }
        if (num>=100)
        {
            hundreds = (int)num/100;
            num -= hundreds * 100;
            res += conToHundreds(hundreds);
        }
        if(num>=10)
        {
            dozens = (int)num/10;
            num -= dozens * 10;
            res += conToDozens(dozens);
        }
        if(num>=1)
        {
            units = num;
            res += conToUnits(units);
        }
        return res;
    }

    /**
     * Конвертируем тысячи
     * @param num
     * @return
     */
    public static String conToThousand(int num)
    {
        String res = "";
        switch (num)
        {
            case 1: return "M";
            case 2: return "MM";
            case 3: return "MMM";
        }
        return res;
    }

    /**
     * Конвертируем сотни
     * @param num
     * @return
     */
    public static String conToHundreds(int num)
    {
        String res = "";
        switch (num)
        {
            case 1: return "C";
            case 2: return "CC";
            case 3: return "CCC";
            case 4: return  "CD";
            case 5: return  "D";
            case 6: return  "DC";
            case 7: return  "DCC";
            case 8: return  "DCCC";
            case 9: return  "CM";
        }
        return res;
    }

    /**
     * Конвертируем десятки
     * @param num
     * @return
     */
    public static String conToDozens(int num)
    {
        String res = "";
        switch (num)
        {
            case 1: return  "X";
            case 2: return  "XX";
            case 3: return  "XXX";
            case 4: return  "XL";
            case 5: return  "L";
            case 6: return  "LX";
            case 7: return  "LXX";
            case 8: return  "LXXX";
            case 9: return  "XC";
        }
        return res;
    }

    /**
     * Конвертируем еденицы
     * @param num
     * @return
     */
    public static String conToUnits(int num)
    {
        String res = "";
        switch (num)
        {
            case 1: return  "I";
            case 2: return  "II";
            case 3: return  "III";
            case 4: return  "IV";
            case 5: return  "V";
            case 6: return  "VI";
            case 7: return  "VII";
            case 8: return  "VIII";
            case 9: return  "IX";
        }
        return res;
    }
}