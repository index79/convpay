package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenieceType;
import com.zerobase.convpay.type.PayMethodType;

public class PayRequest {
    // 결제 수단
    PayMethodType payMethodType;

    // 편의점 종료
    ConvenieceType convenienceType;

    // 결제 금액
    Integer payAmount;

    // 생성자
    public PayRequest(PayMethodType payMethodType, ConvenieceType convenienceType, Integer payAmount) {
        this.payMethodType = payMethodType;
        this.convenienceType = convenienceType;
        this.payAmount = payAmount;
    }

    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(PayMethodType payMethodType) {
        this.payMethodType = payMethodType;
    }

    public ConvenieceType getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(ConvenieceType convenienceType) {
        this.convenienceType = convenienceType;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }
}
