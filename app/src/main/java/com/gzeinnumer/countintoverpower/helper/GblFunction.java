package com.gzeinnumer.countintoverpower.helper;

import java.text.NumberFormat;
import java.util.Locale;

public class GblFunction {

    public static String saparator(String value) {
        if (value == null || value.equals("") || value.equals("0") || value.equals("0.0") ) {
            return "0";
        }
        if (value.contains(",")){
            value = value.substring(0, value.indexOf(","));
        }
        value = idrComma(value);
        return value.substring(0, value.indexOf(","));
    }

    public static String idrComma(String value) {
        if (value == null || value.equals("") || value.equals("0") || value.equals("0.0")) {
            return "0";
        } else {
            if (value.contains(",")){
                value = value.substring(0, value.indexOf(","));
            }
            Locale localeID = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
            return formatRupiah.format(Double.valueOf(value)).replace("Rp", "");
        }
    }

    public static String idr(String value) {
        return "Rp " + idrComma(value).replace(",00","");
    }
}
