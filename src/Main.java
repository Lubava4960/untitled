public class Main {
    public static void main(String[] args) {
        //Задание 1.//
        System.out.println("Задание 1.");
        String firstName="Ivan";
        String middleName="Ivanovich";
        String  lastName= "Ivanov";
        String fullName = lastName + " " + firstName +" "+ middleName;
        System.out.println( "ФИО сотрудника - " + fullName);
        //Задание 2.//
        System.out.println(" Задание 2.");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " +fullName);
        //Задание 3.//
        System.out.println(" Задание 3.");
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String LastName2 = "Иванов";
        String fullName2 = LastName2 + " " + firstName2 + " " + middleName2;
        String fullName3 = fullName2.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника - " +fullName3);


    }
}