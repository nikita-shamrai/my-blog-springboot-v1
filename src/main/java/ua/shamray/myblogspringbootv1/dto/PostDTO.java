package ua.shamray.myblogspringbootv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PostDTO {

    private Long id;

    @JsonProperty("account")
    private AccountDTO accountDTO;

    @NotNull(message = "post title is null")
    @NotBlank(message = "post title is blank")
    @NotEmpty(message = "post title is empty")
    @Size(max = 50, message = "post title is limit to 50 characters")
    private String title;

    @NotNull(message = "post body is null")
    @NotBlank(message = "post body is blank")
    @NotEmpty(message = "post body is empty")
    @Size(max = 10000, message = "post body is too big")
    private String body;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
