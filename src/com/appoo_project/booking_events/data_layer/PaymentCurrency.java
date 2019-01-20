package data_layer;

public interface PaymentCurrency {

    void requestMDL(float amount);
    void requestEUR(float amount);
}
