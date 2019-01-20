package data_layer;

public class Main {

    public static void main(String args[]) {

        User utilisateur = new UserBuilder().withAddress("Fake address").withAge(20).withCounty("Chisinau").withEmail("fake@email.com").withFistname("Ion").withLastname("Negara").withUsername("ionn").withPassword("password").withPostcode("PC22").withTown("Chisinau").build();
        System.out.println(utilisateur.getFistname().toString());

        PaymentCurrency mdl = new AdapterPayment(new AdapteePaymentMDL());
        mdl.requestMDL(290);
        PaymentCurrency eur = new AdapterPayment(new AdapteePaymentEUR());
        eur.requestEUR(290);


    }


}


