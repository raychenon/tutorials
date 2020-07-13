package com.baeldung.hexagonal.ports;

public interface UserRequest {
    public void processRequest(String sportName);

    public void requestStock(String stockName);
}
