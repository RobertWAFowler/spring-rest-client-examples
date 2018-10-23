package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ExpirationDate implements Serializable {
    private String date;
    private String timezone_type;
    private String timezone;

    private final static long serialVersionUID = 1L;
}
