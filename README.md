# CountIntOverPower
 
```java
public class GblFunction {

    public static String saparator(String value) {
        if (value == null || value.equals("")) {
            return "0";
        }
        value = idrComma(value);
        return value.substring(0, value.indexOf(","));
    }

    public static String idrComma(String value) {
        if (value == null || value.equals("")) {
            return "0";
        } else {
            Locale localeID = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
            return formatRupiah.format(Double.valueOf(value)).replace("Rp", "");
        }
    }

    public static String idr(String value) {
        return "Rp " + idrComma(value).replace(",00","");
    }
}
```

```java
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
```

---

```
Copyright 2021 M. Fadli Zein
```