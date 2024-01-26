
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();//то что считали
        String result = calc(action);// то что посчитали
        System.out.println(result);
    }

    public static String calc(String action) throws Exception {//метод калькулятор, считает, возвращает результат
        String[] razd = action.split(" "); // создаём массив строк состоящий из строки входа разбитой по пробелам

        if (razd.length > 3) { // проверяем длинну массива
            throw new RuntimeException();
        }

        String first = razd[0]; // создаём переменную first и сохраняем в неё нулевой элемент массива
        String znak = razd[1];
        String second = razd[2];
        int a = 0; // создаём переменную и сохраняем в неё значение 0
        int b = 0;
        boolean isRoman = false; // создаем переменную для дальнейшей проверки на то является ли число римским, (пока сохраняем false)


        if (isNumber(first) && isNumber(second)) {// если first и second являются арабскими
            a = Integer.parseInt(first);// присваиваем a значение first переведённое в число с помощью метода parseInt
            b = Integer.parseInt(second);
        } else if ((!isNumber(first) && !isNumber(second))) {// если first и second не являются арабскими
            a = romanToNumber(first);// присваиваем a значение first переведённое в число с помощью метода romanToNumber
            b = romanToNumber(second);
            isRoman = true;// присваиваем isRoman true, значения были римскими
        } else {
            throw new RuntimeException();//если другой случай, выбрасывается исключение
        }


        if (a > 10 || b > 10 || a < 1 || b < 1) {//проверяем диапазон значений a и b
            throw new RuntimeException();// если не попадают в диапазон, выбрасывается исключение
        }

        int result = 0;// чтобы сохранить результат подсчета создаём переменную result

        switch (znak) {// проверяем знак, проводим подсчет и присваиваем значение переменной result
            case ("+"):
                result = (a + b);
                break;
            case ("-"):
                result = (a - b);
                break;
            case ("*"):
                result = (a * b);
                break;
            case ("/"):
                result = (a / b);
                break;
            default:
                throw new RuntimeException();// если недопустимый знак, выбрасываем исключение
        }
        String result1 = Integer.toString(result);// создаём переменную result1 и сохраняем в неё result преобразованный в строку(был инт делаем строку)

        if (isRoman == true) {// если на входе были римские значения
            String result2 = numberToRoman(Integer.parseInt(result1));// создаём переменную result2 и сохраняем в неё result1 переведённый в римское значение

            return result2; // возвращаем result2 (римское)
        }

        return result1;// возвращаем result1 (арабское)
    }

    public static boolean isNumber(String str) {//метод проверяет является ли строка числом
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    static int romanToNumber(String roman) throws Exception {//преобразовывает римские значения в арабские

        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;

            default:
                throw new RuntimeException();
        }
    }

    static String numberToRoman(int number) {// преобразует арабские в римские
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
            case 12:
                return "XII";
            case 13:
                return "XIII";
            case 14:
                return "XIV";
            case 15:
                return "XV";
            case 16:
                return "XVI";
            case 17:
                return "XVII";
            case 18:
                return "XVIII";
            case 19:
                return "XIX";
            case 20:
                return "XX";
            case 21:
                return "XXI";
            case 22:
                return "XXII";
            case 23:
                return "XXIII";
            case 24:
                return "XXIV";
            case 25:
                return "XXV";
            case 26:
                return "XXVI";
            case 27:
                return "XXVII";
            case 28:
                return "XXVIII";
            case 29:
                return "XXIX";
            case 30:
                return "XXX";
            case 31:
                return "XXXI";
            case 32:
                return "XXXII";
            case 33:
                return "XXXIII";
            case 34:
                return "XXXIV";
            case 35:
                return "XXXV";
            case 36:
                return "XXXVI";
            case 37:
                return "XXXVII";
            case 38:
                return "XXXVIII";
            case 39:
                return "XXXIX";
            case 40:
                return "XL";
            case 41:
                return "XLI";
            case 42:
                return "XLII";
            case 43:
                return "XLIII";
            case 44:
                return "XLIV";
            case 45:
                return "XLV";
            case 46:
                return "XLVI";
            case 47:
                return "XLVII";
            case 48:
                return "XLVIII";
            case 49:
                return "XLIX";
            case 50:
                return "L";
            case 51:
                return "LI";
            case 52:
                return "LII";
            case 53:
                return "LIII";
            case 54:
                return "LIV";
            case 55:
                return "LV";
            case 56:
                return "LVI";
            case 57:
                return "LVII";
            case 58:
                return "LVIII";
            case 59:
                return "LIX";
            case 60:
                return "LX";
            case 61:
                return "LXI";
            case 62:
                return "LXII";
            case 63:
                return "LXIII";
            case 64:
                return "LXIV";
            case 65:
                return "LXV";
            case 66:
                return "LXVI";
            case 67:
                return "LXVII";
            case 68:
                return "LXVIII";
            case 69:
                return "LXIX";
            case 70:
                return "LXX";
            case 71:
                return "LXXI";
            case 72:
                return "LXXII";
            case 73:
                return "LXXIII";
            case 74:
                return "LXXIV";
            case 75:
                return "LXXV";
            case 76:
                return "LXXVI";
            case 77:
                return "LXXVII";
            case 78:
                return "LXXVIII";
            case 79:
                return "LXXIX";
            case 80:
                return "LXXX";
            case 81:
                return "LXXXI";
            case 82:
                return "LXXXII";
            case 83:
                return "LXXXIII";
            case 84:
                return "LXXXIV";
            case 85:
                return "LXXXV";
            case 86:
                return "LXXXVI";
            case 87:
                return "LXXXVII";
            case 88:
                return "LXXXVIII";
            case 89:
                return "LXXXIX";
            case 90:
                return "XC";
            case 91:
                return "XCI";
            case 92:
                return "XCII";
            case 93:
                return "XCIII";
            case 94:
                return "XCIV";
            case 95:
                return "XCV";
            case 96:
                return "XCVI";
            case 97:
                return "XCVII";
            case 98:
                return "XCVIII";
            case 99:
                return "XCIX";
            case 100:
                return "C";
            default:
                throw new RuntimeException();
        }
    }
}





