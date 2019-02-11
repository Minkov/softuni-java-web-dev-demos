package web;

import entities.User;
import services.UsersService;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("users")
@RequestScoped
public class UsersListBean {
    private final UsersService usersService;

    @Inject
    public UsersListBean(UsersService usersService) {
        this.usersService = usersService;
    }

    public List<User> getUsers() {
        return this.usersService.getAllUsers();
    }
}
