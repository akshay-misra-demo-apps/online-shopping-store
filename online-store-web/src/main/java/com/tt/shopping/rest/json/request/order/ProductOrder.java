package com.tt.shopping.rest.json.request.order;

import com.tt.shopping.rest.json.request.customer.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductOrder {

    private String externalId;

    private String priority;

    private String description;

    private String customerId;

    private List<OrderItem> orderItem;

    private String notificationContact;

    private PaymentMethod paymentMethod;

    private String deliveryAddressRef;
}