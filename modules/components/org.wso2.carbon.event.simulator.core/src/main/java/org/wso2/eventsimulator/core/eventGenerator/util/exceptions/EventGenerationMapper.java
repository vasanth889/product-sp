package org.wso2.eventsimulator.core.eventGenerator.util.exceptions;

import org.osgi.service.component.annotations.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Exception mapper that maps customized EventGenerationException to customized HTTP responses
 */
@Component(
        name = "org.wso2.eventsimulator.core.eventGenerator.util.exceptions.EventGenerationMapper",
        service = ExceptionMapper.class,
        immediate = true
)
public class EventGenerationMapper implements ExceptionMapper<EventGenerationException> {
    @Override
    public Response toResponse(EventGenerationException e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).
                entity(e.getMessage()).
                build();
    }
}
