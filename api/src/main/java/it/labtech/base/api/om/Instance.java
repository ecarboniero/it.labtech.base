package it.labtech.base.api.om;

import java.io.Serializable;

public class Instance implements Serializable {
    private static final long serialVersionUID = -4199157369242567030L;

    private String host;
    private String instanceId;
    private String serviceId;
    private int port;
    private String scheme;
    private String uri;

    public Instance() {
    }

    public Instance(String host, String instanceId, String serviceId, int port, String scheme, String uri) {
        this.host = host;
        this.instanceId = instanceId;
        this.serviceId = serviceId;
        this.port = port;
        this.scheme = scheme;
        this.uri = uri;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
