public class AscOne {
    public static void main(String[] args) {
        String fio = "Кольцов Леонид Ильич";
        int s1 = fio.indexOf(" ");
        int s2 = fio.lastIndexOf(" ");
        String surname = fio.substring(0,s1);
        String name = fio.substring(s1,s2);
        String surname2 = fio.substring(s2);

        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + surname2);
    }
}
