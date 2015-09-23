package org.zalando.baigan.etcd.model;

public class KeyNode extends AbstractNode {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
