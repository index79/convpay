package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayCancelRequest;
import com.zerobase.convpay.dto.PayCancelResponse;
import com.zerobase.convpay.type.ConvenieceType;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.type.PayCanelResult;
import com.zerobase.convpay.type.PayMethodType;
import com.zerobase.convpay.type.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();
    @Test
    void pay_success() {
        // given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenieceType.G25, 50);
        // when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        // then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(50, payResponse.getPaidAmount());
    }

    @Test
    void pay_fail() {
        // given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenieceType.G25, 1000_001);
        // when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        // then
        assertEquals(PayResult.FAIL, payResponse.getPayResult());
        assertEquals(0, payResponse.getPaidAmount());
    }

    @Test
    void pay_cancel_success() {
        // given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenieceType.G25, 1000);
        // when
        PayCancelResponse payResponse = conveniencePayService.payCancel(payCancelRequest);

        // then
        assertEquals(PayCanelResult.PAY_CANCEL_SUCCESS, payResponse.getPayCanelResult());
        assertEquals(1000, payResponse.getPayCanceledAmount());
    }

    @Test
    void pay_cancel_fail() {
        // given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenieceType.G25, 99);
        // when
        PayCancelResponse payResponse = conveniencePayService.payCancel(payCancelRequest);

        // then
        assertEquals(PayCanelResult.PAY_CANCEL_FAIL, payResponse.getPayCanelResult());
        assertEquals(0, payResponse.getPayCanceledAmount());
    }
}