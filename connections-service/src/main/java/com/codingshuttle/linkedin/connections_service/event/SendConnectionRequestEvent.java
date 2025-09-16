package com.codingshuttle.linkedin.connections_service.event;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class SendConnectionRequestEvent {

    private Long senderId;
    private Long receiverId;

}
