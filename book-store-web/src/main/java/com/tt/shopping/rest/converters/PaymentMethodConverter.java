package com.tt.shopping.rest.converters;

import com.tt.shopping.api.model.customer.PaymentMethod;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PaymentMethodConverter implements Function<com.tt.shopping.rest.json.request.customer.PaymentMethod,
        PaymentMethod> {

    @Override
    public PaymentMethod apply(com.tt.shopping.rest.json.request.customer.PaymentMethod source) {
        return PaymentMethod.builder()
                .name(source.getName())
                .paymentMethodType(source.getPaymentMethodType())
                .characteristic(source.getCharacteristic())
                .build();
    }
}