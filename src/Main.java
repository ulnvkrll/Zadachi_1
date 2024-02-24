public class Main {
    public static void main(String[] args)
    {
        int a = 60;

        int b = 45;

        int c = 17;

        int p = a + b + c;

        System.out.println(p);

        int gvbt = 9;

        int gvbb = 3;

        int gvbm = gvbt / gvbb;

        int svbt = 15;

        int svbb = 3;

        int svbm = svbt / svbb;

        int resh = gvbm - svbm;

        System.out.println(resh);

        byte h1 = 127;

        byte h2 = (byte) (h1 + 2);

        System.out.println(h2);

        double cash = 5;

        double cash2 = cash / 2;
        double cash3 = cash / 2;

        System.out.println(cash2 + " - рубли в кассе 1");
        System.out.println(cash3 + " - рубли в кассе 2");

        double d = 10.0 / 3;

        float f = (float) 10.0 / 3;


        System.out.println("ответ double - " + d);
        System.out.println("ответ float - " + f);


        int red = 10;
        int green = 5;
        boolean statement = red > green;

        System.out.println("Верно ли утверждение, что красных яблок больше - " + statement);

        int d = 15;

    }
}