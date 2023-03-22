package com.mj.room.dto;

import com.mj.room.model.RoomType;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class RoomDto {

    private Integer id;

    @Min(100)
    @Max(999)
    private Short number;

    private RoomType roomType;

    @Min(1)
    @Max(5)
    private Byte maxPersons;

    @Min(100)
    private Double pricePerHour;

    private Boolean occupied;
}
