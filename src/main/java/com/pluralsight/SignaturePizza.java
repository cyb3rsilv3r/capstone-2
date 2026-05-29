package com.pluralsight;

public class SignaturePizza extends Pizza {

    private String signatureName;

    public SignaturePizza(String signatureName) {

        super(PizzaSize.LARGE, CrustType.REGULAR, false, false);

        this.signatureName = signatureName;

        if (signatureName.equalsIgnoreCase("Margherita")) {

            addSauce(Sauces.MARINARA);
            addSauce(Sauces.OLIVE_OIL);

            addPremiumTopping(PremiumToppings.MYSTERY_BACON);

            addRegularTopping(RegularToppings.SUN_BRUISED_TOMATOES);
            addRegularTopping(RegularToppings.WILD_ROADSIDE_BASIL);
        }

    }
}
