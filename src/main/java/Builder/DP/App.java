package Builder.DP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Email email = new Email.EmailBuilder("abc.ef@gmail.com","hi").build();
        
        Email email1 = new Email.EmailBuilder("abc.ef@gmail.com","hi").setEmailId("kkk").setCc("vv").setMessage("nnn").build();
    }
}
