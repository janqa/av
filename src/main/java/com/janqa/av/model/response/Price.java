package com.janqa.av.model.response;

public class Price {
    private Money usd;
    private Money byn;
    private Money rub;
    private Money eur;

    public Money getUsd() {
        return usd;
    }

    public void setUsd(Money usd) {
        this.usd = usd;
    }

    public Money getByn() {
        return byn;
    }

    public void setByn(Money byn) {
        this.byn = byn;
    }

    public Money getRub() {
        return rub;
    }

    public void setRub(Money rub) {
        this.rub = rub;
    }

    public Money getEur() {
        return eur;
    }

    public void setEur(Money eur) {
        this.eur = eur;
    }
}
