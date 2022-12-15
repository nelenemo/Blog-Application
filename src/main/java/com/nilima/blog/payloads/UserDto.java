package com.nilima.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter

public class UserDto {
    
	private int id; 
	
	@NotEmpty
	@Size(min=5, message="user name must consist atleast 5 character")
	private String name;
	
	@Email (message="Unvalid Email id!!!")
	private String email;
	
	
	@NotEmpty
	@Size(min=4, max=15, message="password must contain atleast 4 to 15 character")
	
	private String password;
	
	@NotEmpty
	private String about;
}
