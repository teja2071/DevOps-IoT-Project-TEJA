package com.telecom;

import java.util.ArrayList;
import java.util.List;

public class CallManager {

    private final List<String> activeCalls;

    public CallManager() {
        activeCalls = new ArrayList<>();
    }

    public void startCall(String callId) {
        activeCalls.add(callId);
        System.out.println("Call started: " + callId);
    }

    public void endCall(String callId) {
        activeCalls.remove(callId);
        System.out.println("Call ended: " + callId);
    }

    public int getActiveCallCount() {
        return activeCalls.size();
    }

    public List<String> getActiveCalls() {
        return List.copyOf(activeCalls);
    }

    public static void main(String[] args) {
        CallManager manager = new CallManager();
        manager.startCall("CALL001");
        manager.startCall("CALL002");
        System.out.println("Active calls: " + manager.getActiveCallCount());
        manager.endCall("CALL001");
        System.out.println("Active calls: " + manager.getActiveCallCount());
    }
}
