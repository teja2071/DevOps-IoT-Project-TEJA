package com.telecom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CallManagerTest {

    @Test
    void testCallFlow() {
        CallManager manager = new CallManager();
        manager.startCall("CALL001");
        manager.startCall("CALL002");

        assertEquals(2, manager.getActiveCallCount());

        manager.endCall("CALL001");
        assertEquals(1, manager.getActiveCallCount());
    }
}
