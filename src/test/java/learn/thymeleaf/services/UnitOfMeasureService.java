package learn.thymeleaf.services;

import java.util.Set;

import learn.thymeleaf.commands.UnitOfMeasureCommand;

/**
 * @author stefan
 *
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}