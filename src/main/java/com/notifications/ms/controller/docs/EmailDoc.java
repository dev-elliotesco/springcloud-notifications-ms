package com.notifications.ms.controller.docs;

import com.notifications.ms.model.EmailRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Email controller" , description = "API exposed for sending emails")
public interface EmailDoc {

    @Operation(summary = "Send email",description = "This operation is for sending email")
    @ApiResponses(value ={
            @ApiResponse(
                    responseCode = "200",
                    description = "Email sent successfully",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest);
}
