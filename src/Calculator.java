public class Calculator {
    private static String num1, num2, sign, systemNumber;
    private static Obj obj1, obj2;
    private static Integer arabRes;

    Calculator (String s) throws Exception {
        arabRes = 0;
        obj1 = new Obj();
        obj2 = new Obj();
        ReadInput.textSplit(s);
        num1 = ReadInput.getNum1();
        num2 = ReadInput.getNum2();
        obj1.num = num1;
        obj2.num = num2;
        if(CheckNumSystem.checkArabNum(num1)) {
            obj1.systemNum = "Arab";
        }
        if(CheckNumSystem.checkRomeNum(num1)) {
            obj1.systemNum = "Rome";
        }
        if(obj1.systemNum == "") {
            throw new Exception("Num1 none");
        }
        if(CheckNumSystem.checkArabNum(num2)) {
            obj2.systemNum = "Arab";
        }
        if(CheckNumSystem.checkRomeNum(num2)) {
            obj2.systemNum = "Rome";
        }
        if(obj2.systemNum == "") {
            throw new Exception("Num2 None");
        }
        comparisonOfNumSystem();
        rangeCheck(obj1);
        rangeCheck(obj2);
        sign = ReadInput.getSign();
        CheckNumSystem.checkSign(sign);
        if(systemNumber == "Arab") {
            expression();
        }
        if(systemNumber == "Rome") {
            expressionRome();
        }
    }

    private static void rangeCheck(Obj o) throws Exception {
        Obj obj = o;
        if(obj.systemNum == "Rome") {
            if(ConvertToArab.getRomanNum(obj.num) >10 || ConvertToArab.getRomanNum(obj.num)<1) {
                throw new Exception("Римское число за диапазоном 1-10");
            }else{
                obj.number = ConvertToArab.getRomanNum(obj.num);
            }
        }
        if(obj.systemNum == "Arab") {
            if(Integer.parseInt(obj.num)> 10 || Integer.parseInt(obj.num)<1) {
                throw new Exception("Арабское число за диапазоном 1-10");
            }else {
                obj.number = Integer.parseInt(obj.num);
            }
        }
    }

    private static void comparisonOfNumSystem() throws Exception {
        if(obj1.systemNum != obj2.systemNum) {
            throw new Exception("Разные системы счисления");
        }else {
            systemNumber = obj1.systemNum;
        }
    }

    private static void expression() {
        int res = 0;
        String plus = "+", minus = "-", mult = "*", div = "/";
        if(sign.equals(plus)) {
            res = obj1.number + obj2.number;
        }
        if (sign.equals(minus)) {
            res = obj1.number - obj2.number;
        }
        if(sign.equals(mult)) {
            res = obj1.number * obj2.number;
        }
        if(sign.equals(div)) {
            res = obj1.number / obj2.number;
        }
        arabRes = res;
        System.out.println(res);

    }

    private static void expressionRome() {
        int res = 0;
        String plus = "+", minus = "-", mult = "*", div = "/";
        if(sign.equals(plus)) {
            res = obj1.number + obj2.number;
        }
        if (sign.equals(minus)) {
            res = obj1.number - obj2.number;
        }
        if(sign.equals(mult)) {
            res = obj1.number * obj2.number;
        }
        if(sign.equals(div)) {
            res = obj1.number / obj2.number;
        }
        if(res < 0) {
            System.out.println("-"+ConvertToRome.definitionOfNumber(res*-1));
        }else{
            System.out.println(ConvertToRome.definitionOfNumber(res));
        }

    }

}

class Obj {
    String systemNum;
    String num;
    Integer number;

    {
        systemNum = "";
        num = "";
        number = 0;
    }


}
