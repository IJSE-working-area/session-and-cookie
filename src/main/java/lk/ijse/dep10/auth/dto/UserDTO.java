package lk.ijse.dep10.auth.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //builder design pattern apply karanawa
public class UserDTO {
    @NotBlank
    private String userName;
    @NotBlank
    @Length(min = 4)
    private String password;
    @NotBlank(groups = SignUp.class)
    @Pattern(regexp = "[A-Za-z ]+", groups = SignUp.class)
    private String fullName;

    public interface SignUp extends Builder.Default {
    }
}
