package com.notifications.ms.dto;

import com.notifications.ms.utils.MessageUtils;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDTO {
    @NotBlank
    @NotEmpty
    @Email(message = MessageUtils.INVALID_EMAIL)
    private String to;
    @NotBlank
    @NotEmpty
    private String subject;
    @NotBlank
    @NotEmpty
    private String body;
}
