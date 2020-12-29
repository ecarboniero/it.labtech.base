package it.labtech.base.api.impl;

import it.labtech.base.api.endpoint.ITest;
import it.labtech.base.api.om.Instance;
import it.labtech.base.api.om.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        _LOGGER.debug("Start getValue() ... ");
        var retValue = "Hello World :-D";
        _LOGGER.debug("End getValue()");
        return retValue;
    }

    @Override
    public List<Service> getServices() {
        _LOGGER.debug("Start getServices() ... ");
        List<Service> retVal = new ArrayList<>();

        List<String> services = this.discoveryClient.getServices();
        for (String s: services) {
            var service = new Service(s);
            retVal.add(service);

            List<ServiceInstance> instances = this.discoveryClient.getInstances(s);
            for (ServiceInstance si : instances) {
                var instance = new Instance(si.getHost(), si.getInstanceId(), si.getServiceId(), si.getPort(), si.getScheme(), si.getUri().toString());
                service.getInstances().add(instance);
            }

        }
        _LOGGER.debug("End getServices()");
        return retVal;
    }
}
