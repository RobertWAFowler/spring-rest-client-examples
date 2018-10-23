package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;

    private final static long serialVersionUID = 1L;
}
