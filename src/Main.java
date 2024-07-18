public class Main {
    public static void main(String[] args) {
        // условные кострукции if-else
        int a = 15, b = 10;
        // == равно, > больше, < меньше, >= больше или равно, <= меньше или равно, != не равенство
        char sym1 ='A', sym2 ='a';
        boolean IsHasCar = false;
        // || (или), && (то и то) (до бесконечности или/то и то)
        if(!IsHasCar && a >= b) {
            System.out.println("Да, верно");
        }
        // else if можно делать бесконечно, но только между if и else
        else if (a >= b) {
            System.out.println("Seconde test");
            
        } else {
            System.out.println("Нет, неверно");
        }
        


    }
}