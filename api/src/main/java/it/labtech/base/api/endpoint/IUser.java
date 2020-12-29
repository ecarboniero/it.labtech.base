package it.labtech.base.api.endpoint;

import it.labtech.base.api.om.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public interface IUser {

    @GetMapping
    Set<User> getUsers();
}
