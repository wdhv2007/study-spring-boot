package com.example.test.sample.vo;



import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@ToString()
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserVO {
	
	@NonNull
	private String userId;
	@NonNull
	private String userName;
}
