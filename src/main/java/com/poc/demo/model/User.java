package com.poc.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {
    private String name;
    private Long age;
}
