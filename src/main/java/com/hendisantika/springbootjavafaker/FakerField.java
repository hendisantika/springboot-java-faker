package com.hendisantika.springbootjavafaker;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-java-faker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/19
 * Time: 05.51
 */
public class FakerField implements Serializable {
    private String label;
    private String value;

    public FakerField(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "FakerField{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
