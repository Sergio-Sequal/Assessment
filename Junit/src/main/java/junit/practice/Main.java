package junit.practice;

public class Main {

    public static void main(String[] args) {
        double salary = 1000;
        System.out.println(MoneyUtil.format(salary));

        //Juego para probar la lib de mockito
        Game game = new Game();
        game.play();

    }

}
