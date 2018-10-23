package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Name implements Serializable {
    private String title;
    private String first;
    private String last;

    private final static long serialVersionUID = 1L;
}
