package br.com.zup.order.orchestrator.integration.inventory.request;

import java.util.Map;

public class BookRequest {
    private Map<String, String> orderEntries;

    public Map<String, String> getOrderEntries() {
        return orderEntries;
    }

    public void setOrderEntries(Map<String, String> orderEntries) {
        this.orderEntries = orderEntries;
    }
}
