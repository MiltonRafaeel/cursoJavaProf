package services;

public class BrazilTaxService extends TaxService {

    @Override
    public Double tax(Double amount) {
        return amount * 0.3;
    }
}
