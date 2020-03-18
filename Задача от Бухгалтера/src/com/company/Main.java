package com.company;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill (100000.0, new IncomeTaxType(), new TaxService()),
                new Bill (100000.1, new ProgressiveTaxType(), new TaxService()),
                new Bill (100000.0, new VATaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
