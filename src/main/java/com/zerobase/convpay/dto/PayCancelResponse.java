package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayCanelResult;

public class PayCancelResponse {
    PayCanelResult payCanelResult;
    Integer payCanceledAmount;

    public PayCancelResponse(PayCanelResult payCanelResult, Integer payCanceledAmount) {
        this.payCanelResult = payCanelResult;
        this.payCanceledAmount = payCanceledAmount;
    }

    public PayCanelResult getPayCanelResult() {
        return payCanelResult;
    }

    public void setPayCanelResult(PayCanelResult payCanelResult) {
        this.payCanelResult = payCanelResult;
    }

    public Integer getPayCanceledAmount() {
        return payCanceledAmount;
    }

    public void setPayCanceledAmount(Integer payCanceledAmount) {
        this.payCanceledAmount = payCanceledAmount;
    }

    @Override
    public String toString() {
        return "PayCancelResponse{" +
                "payCanelResult=" + payCanelResult +
                ", payCanceledAmount=" + payCanceledAmount +
                '}';
    }
}



