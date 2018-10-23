package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Job implements Serializable {
    private String title;
    private String company;

    private final static long serialVersionUID = 1L;
}
