package com.math.microbrew.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto {

    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
}
