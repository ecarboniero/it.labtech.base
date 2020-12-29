package it.labtech.base.api.impl;

import it.labtech.base.api.endpoint.IUser;
import it.labtech.base.api.om.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@RestController
public class DefaultUserImpl implements IUser {

    private static final Logger _LOGGER = LoggerFactory.getLogger(DefaultUserImpl.class);
    private Set<User> users = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public DefaultUserImpl() {
        users.add(new User("Jhon","Doe"));
        users.add(new User("Hannibal","Lecter"));
    }

    @Override
    public Set<User> getUsers() {
        _LOGGER.debug("getUsers method invoked :-D");
        return users;
    }
}
