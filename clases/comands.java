package clases;

public class comands {
    public static void help(){
        System.out.println("exit - выход");
        System.out.println("saved - сохранить текст");
        System.out.println("take out - вывести текст");
        System.out.println("take out all - вывести весь текст");
        System.out.println("clear - очистить лист");
        System.out.println();
    }
    public static void error_not_command(){
        System.out.println("Error: не найдена команда");
    }
    public static void Too_big_id(){
        System.out.println("Error: вы ввели слишком большое значение");
    }
    public static void clear_list(){
        System.out.println("лист очищен");
    }
}
