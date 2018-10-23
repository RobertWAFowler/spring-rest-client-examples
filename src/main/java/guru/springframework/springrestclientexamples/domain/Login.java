package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Login implements Serializable {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;

    private final static long serialVersionUID = 1L;


}
