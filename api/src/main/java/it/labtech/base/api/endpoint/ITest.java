package it.labtech.base.api.endpoint;

import it.labtech.base.api.om.Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public interface ITest {
    @GetMapping
    String getValue();

    @GetMapping(value = "/service")
    List<Service> getServices();
}
