package com.mj.guest.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class GuestDto {

    private String id;

    private String fullName;

    @Size(min = 10, max = 10)
    private String passport;

    @Email
    private String email;

    private Double discountPercent;
}
