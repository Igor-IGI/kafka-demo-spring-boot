package com.igor.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Igor Popovic
 */
@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}
