package com.galaxy.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SampleBean {

	private String userId;
	private String locale;
	private int timeoutInSeconds;
}
