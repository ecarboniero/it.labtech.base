package it.labtech.base.api.impl;

import it.labtech.base.api.endpoint.ITest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DefaultTestImpl implements ITest {

    private static final Logger _LOGGER = LoggerFactory.getLogger(DefaultTestImpl.class);

    @Override
    public String getValue() {
        _LOGGER.debug("Start getValue()");
        var retValue = "Hello World :-D";
        _LOGGER.debug("End getValue()");
        return retValue;
    }
}
