package com.kfkaproject.kfka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @Id
    private String id;

    private String username;

    private String firstName;

    private String surname;
}
