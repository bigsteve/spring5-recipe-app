package learn.thymeleaf.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author stefan
 *
 */
@Setter
@Getter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    
    private Long id;
    private String description;

}
