import jdbc.model.User;
import jdbc.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        testJdbc();
    }

    private static void testJdbc() {
        UserRepository repository = new UserRepository();

        String email = "john.doe@example.com";
        String name = "John Doe";

        repository.save(new User(null, name, email, null));
    }
}