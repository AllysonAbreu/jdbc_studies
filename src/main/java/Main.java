import model.User;
import repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        String email = "john.doe@example.com";
        String name = "John Doe";

        repository.save(new User(null, name, email, null));
    }
}