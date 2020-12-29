package it.labtech.base.api.impl;

import it.labtech.base.api.endpoint.ITest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DefaultTestImpl implements ITest {

    private static final Logger _LOGGER = LoggerFactory.getLogger(DefaultTestImpl.class);

    private DiscoveryClient discoveryClient;

    public DefaultTestImpl(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @Override
    public String getValue() {
        _LOGGER.debug("Start getValue()");
        var retValue = "Hello World :-D";
        _LOGGER.debug("End getValue()");
        return retValue;
    }

    @Override
    public List<String> getServices() {
        _LOGGER.debug("Start getServices()");
        List<String> services = this.discoveryClient.getServices();
        _LOGGER.debug("End getServices()");
        return services;
    }
}
