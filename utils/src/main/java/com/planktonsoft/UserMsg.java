package com.planktonsoft;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
public class UserMsg {
    private Long userId;

    private String phoneNumber;

    private String identifierValue;

    @Enumerated(value = EnumType.STRING)
    private UserIdentifier userIdentifier;
}