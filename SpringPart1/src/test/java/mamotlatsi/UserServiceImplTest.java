package mamotlatsi;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

import static org.junit.jupiter.api.Assertions.*;
@TestComponent
class UserServiceImplTest {

    @Test
    void addUser() {
        assertEquals("mamotlatsi",UserService.addUser(1,"mamotlatsi", "makhate"));
    }

    @Test
    void remove() {

    }

    @Test
    void getUser() {
        UserService.addUser(1,"mamotlatsi","makhate");
        assertEquals("hello","mamotlatsi","hello");

    }
}
