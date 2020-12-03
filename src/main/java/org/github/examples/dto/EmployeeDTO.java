package org.github.examples.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class EmployeeDTO {
    @NotBlank
    public String id;
    @NotBlank
    public String name;
    @NotBlank
    public String gender;
}
