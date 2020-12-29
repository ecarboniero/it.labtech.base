package it.labtech.base.api.om;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Service implements Serializable {
    private static final long serialVersionUID = -6844263182008693821L;
    private String name;
    private List<Instance> instances;

    public Service() {
        instances = new ArrayList<>();
    }

    public Service(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }
}
