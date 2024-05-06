import java.util.StringJoiner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //перебор символов
        String hello = "Привет";
        char [] chars = hello.toCharArray();
            for (char c : chars) {
            System.out.println(c);
        }
            // длина строки
        String str = "Это текстовая строка для подсчета пробелов.";
            int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                spaceCount ++;
            }
        }
        // очистка от пробелов
        System.out.println("Количество пробелов - " + spaceCount);
        String text = " ппппп ппппп  пппппппп   ";
        System.out.println("Исходный текст " + text);
        String clearedText = text.strip();
        System.out.println("Исправленный текст " + clearedText);
        // является ли символ буквой или цифрой
        String text1 = "1990 year";
        if (Character.isDigit(text1.charAt(0))) {
            System.out.println("Это цифра");
        }
        if (Character.isLetter(text1.charAt(7))){
            System.out.println("Это буква");
        }
     // подстроки

        String text2 = "Текст для проверки подстроки - пипец!!+";
        String xxx = "- ";
        int start = text2.indexOf(xxx) + xxx.length();
        int end = text2.indexOf("+",start);
        String substring = text2.substring(start,end);

        System.out.println(start);
        System.out.println(end);
        System.out.println(substring);
        // объединители
        String text3 = "Real";
        StringJoiner joiner = new StringJoiner(" // ");
        joiner.add(text2);
        joiner.add(text3);
        String list = String.join(", ", text3, text2);
        System.out.println(joiner);
        System.out.println(list);

        // форматирование строки
        String name = "Вася";
        int age = 25;
        String sss = "\"name\"  \"%s\" : \"age\"  \"%d\"";
        String result = String.format(sss,name,age);
        System.out.println(result);
        System.out.printf(sss,name,age);




    }

}