package com.finalproject.finalproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyResponseDto {

	private Long companyId;

	private String name;

	private String description;

}
