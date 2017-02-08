package developerkampus.whatsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    private TextView tvJumlah, tvHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        tvJumlah = (TextView) findViewById(R.id.tv_jumlahorder);
        tvHarga = (TextView) findViewById(R.id.tv_totalharga);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        final String order = (String) bundle.get("order");
        final String harga = (String) bundle.get("harga");

        tvHarga.setText(harga);
        tvJumlah.setText(order);
    }
}
