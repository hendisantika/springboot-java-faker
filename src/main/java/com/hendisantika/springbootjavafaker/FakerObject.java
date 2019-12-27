package com.hendisantika.springbootjavafaker;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-java-faker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/19
 * Time: 05.51
 */
public class FakerObject implements Serializable {
    private final String name;
    private final List<FakerField> fields;

    public FakerObject(String name, List<FakerField> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public List<FakerField> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "FakerObject{" +
                "name='" + name + '\'' +
                ", fields=" + fields +
                '}';
    }
}