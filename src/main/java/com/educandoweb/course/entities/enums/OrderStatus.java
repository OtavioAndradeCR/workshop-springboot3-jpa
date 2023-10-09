package com.educandoweb.course.entities.enums;

public enum OrderStatus {
    
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    // Enumerations
    private int code;

    // Constructor
    private OrderStatus(int code) {
        this.code = code;
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    // Methods
    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code)
                return value;
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
