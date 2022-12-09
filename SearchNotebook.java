import java.util.Scanner;

public class SearchNotebook {

    public void searching() {
        Notebook[] notebooks = new Notebook[7];

        notebooks[0] = new Notebook("AAA", 2000, 4);
        notebooks[1] = new Notebook("BBB", 2002, 3);
        notebooks[2] = new Notebook("CCC", 2005, 5);
        notebooks[3] = new Notebook("DDD", 1998, 2);
        notebooks[4] = new Notebook("EEE", 2009, 4);
        notebooks[5] = new Notebook("GGG", 2002, 5);
        notebooks[6] = new Notebook("BBB", 1998, 3);
        
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Год производства");
        System.out.println("2 - Вес");
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();

        if (a == 1) {
            System.out.println("Введите с какого года, начиная с 1998, начать поиск");
            Scanner inTwo = new Scanner(System.in);
            Integer b = in.nextInt();

            for (int i = 0; i < notebooks.length; i++) {
                if (notebooks[i].getYearEdition() >= b) {
                    System.out.println(notebooks[i]);
                }
            }
        } else if (a == 2) {
            System.out.println("Введите с какого веса, начиная с 2, начать поиск");
            Scanner inTwo = new Scanner(System.in);
            Integer b = in.nextInt();

            for (int i = 0; i < notebooks.length; i++) {
                if (notebooks[i].getWeight() >= b) {
                    System.out.println(notebooks[i]);
                }
            }
        }
    }
}