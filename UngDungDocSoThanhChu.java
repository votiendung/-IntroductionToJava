import java.util.Scanner;
public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String result = "";
        System.out.println("Nhap so can doc : ");
        number = scanner.nextInt();
        if (number < 10){
            result = readNumber(number);
        }else if (number == 10){
            result = "ten";
        }else if (number == 11){
            result = "eleven";
        }else if (number == 12){
            result = "twelve";
        }else if ( number <= 19){
            int a = number%10;
            result = readNumber2(a) + "eent";
        }else if (number == 20){
            result = "twenty";
        }else if ( number < 99){
            int a = number/10;
            int b = number%10;
            result = readNumber2(a) + "y-" + readNumber(b);
        }else if (number <= 999 ){
            int a = number/100;
            int b = (number - a*100)/10;
            int c = (number - a*100 - b*10);
            result = readNumber(a) + " hundred " + readNumber2(b) + "y-" + readNumber(c);
        }
        System.out.println(result);
    }
    public static String readNumber(int number ) {
        String result = "";
        switch (number) {
            case 0:
                result = "";
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Steven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
        }
        return result;
    }
    public static String readNumber2(int number ) {
        String result = "";
        switch (number) {
            case 2:
                result = "twent";
                break;
            case 3:
                result = "thirt";
                break;
            case 4:
                result = "fort";
                break;
            case 5:
                result = "fift";
                break;
            case 6:
                result = "Sixt";
                break;
            case 7:
                result = "Stevent";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Ninet";
                break;
        }
        return result;
    }
}