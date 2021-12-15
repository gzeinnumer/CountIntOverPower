package com.gzeinnumer.countintoverpower;

import static com.gzeinnumer.countintoverpower.helper.GblFunction.idr;
import static com.gzeinnumer.countintoverpower.helper.GblFunction.idrComma;
import static com.gzeinnumer.countintoverpower.helper.GblFunction.saparator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> productBuys;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        productBuys = new ArrayList<>();

        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");
        productBuys.add("9999");

        hitungTotal();
    }

    public void hitungTotal() {
        double sum = 0;
        for (int j = 0; j < productBuys.size(); j++) {
            if (productBuys.get(j) != null) {

                double harga1 = Double.parseDouble("9999999");
                double qty1 = Double.parseDouble(productBuys.get(j));

                Double subtotal1 = (harga1 * qty1);
                sum = Math.round(subtotal1 + sum);
            }
        }
        tv1.setText(saparator(String.valueOf(sum)));
        tv2.setText(idrComma(String.valueOf(sum)));
        tv3.setText(idr(String.valueOf(sum)));
    }
}