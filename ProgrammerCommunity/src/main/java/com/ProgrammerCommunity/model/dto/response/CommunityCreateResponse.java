package com.ProgrammerCommunity.model.dto.response;

import java.time.LocalDateTime;

import com.ProgrammerCommunity.model.entity.BoardType;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityCreateResponse {
	private Integer userId;
	
	private BoardType boardType;

    @NotBlank(message = "제목은 필수 입력 항목입니다.")
    private String title;

    @NotBlank(message = "내용은 필수 입력 항목입니다.")
    private String content;

    private LocalDateTime createdAt;

}
