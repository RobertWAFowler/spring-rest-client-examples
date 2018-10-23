package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class Billing implements Serializable {
    private Card card;
    private String iban;
    private String swift;

    private final static long serialVersionUID = 1L;
}
