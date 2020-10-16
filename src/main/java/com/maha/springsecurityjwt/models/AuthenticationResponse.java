package com.maha.springsecurityjwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthenticationResponse {

	private String jwt;
	
}
