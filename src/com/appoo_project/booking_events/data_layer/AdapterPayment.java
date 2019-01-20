package data_layer;

public class AdapterPayment implements PaymentCurrency {

    AdapteePaymentMDL adapteePaymentMDL;
    AdapteePaymentEUR adapteePaymentEUR;

    public AdapterPayment(AdapteePaymentMDL adapteePaymentMDL)
    {
        this.adapteePaymentMDL = adapteePaymentMDL;
    }

    public AdapterPayment(AdapteePaymentEUR adapteePaymentEUR)
    {
        this.adapteePaymentEUR = adapteePaymentEUR;
    }

    public void requestMDL(float amount) {

        this.adapteePaymentMDL.specificPaymentMDL(amount);
    }
    public void requestEUR(float amount) {

        this.adapteePaymentEUR.specificPaymentEUR(amount);
    }


}
