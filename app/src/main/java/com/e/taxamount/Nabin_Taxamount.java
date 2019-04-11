package com.e.taxamount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Nabin_Taxamount extends AppCompatActivity {
    double taxAmount;

    public Nabin_Taxamount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double finalResult()
    {
        double returnAmount = 0;
        double totalAmount = taxAmount*12;
        if (totalAmount>=1 && totalAmount <=200000)
        {
            return returnAmount = (totalAmount/100)*1;

        }
        else if (totalAmount>200000 && totalAmount<=350000)
        {
            return returnAmount = ((totalAmount-200000)/100*15)+2000;
        }
        else if (totalAmount>350000)
        {
            return returnAmount = ((totalAmount-350000)/100*25)+2000+22500;
        }
        else return returnAmount;
    }
}