package it.labtech.base.api.impl;

import it.labtech.base.api.endpoint.ITest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultTestImpl implements ITest {

    @Override
    public String getValue() {
        return "Hello World :-D";
    }
}
