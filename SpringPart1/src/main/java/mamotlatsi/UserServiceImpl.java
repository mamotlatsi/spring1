package mamotlatsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(UserServiceImpl.class);
    UserServiceImpl UserService = ctx.getBean("UserServiceImpl", UserServiceImpl.class);
    private FakeRepo fakeRepo;
    @Autowired
    public UserServiceImpl(@Qualifier("FakeRepo")FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    public String addUser(long id, String name, String surname) {
        return null;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void getUser(long id) {

        String name =  fakeRepo.findUserById(id).getName();
        System.out.println("Hello ");
        return ;
    }}
