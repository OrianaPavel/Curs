package exceptions;

public class ExceptionTest {
    public static void main(String[] args) {
        //System.out.println(1/0);
        int y = 10;
        try{
            //System.out.println(1/0);
            //y++;
            int x = 1/0;
            y++;
            //int y = 5;
        } catch(ArithmeticException  e) {
            System.out.println("Operatie imposibila");
            //e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Eroare de executie");
        }
        System.out.println(y);
    }
}
