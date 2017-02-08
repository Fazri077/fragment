package developerkampus.whatsup.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import developerkampus.whatsup.CheckoutActivity;
import developerkampus.whatsup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HitungFragment extends Fragment {
    private Button btnMin, btnPlus, btnOrder, btnbayar;
    private TextView tvQuantity, tvPrice;
    int quantity = 0;

    public HitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hitung, container, false);

        btnMin = (Button) v.findViewById(R.id.btn_min);
        btnPlus = (Button) v.findViewById(R.id.btn_plus);
        btnOrder = (Button) v.findViewById(R.id.btn_order);
        tvQuantity = (TextView) v.findViewById(R.id.tv_quantity);
        tvPrice = (TextView) v.findViewById(R.id.tv_price);
        btnbayar = (Button) v.findViewById(R.id.btn_bayar);

        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CheckoutActivity.class);
                intent.putExtra("order", tvQuantity.getText().toString());
                intent.putExtra("harga", tvPrice.getText().toString());
                startActivity(intent);
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity--;
                tvQuantity.setText(""+quantity);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                tvQuantity.setText(""+quantity);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvPrice.setText("Rp. "+(quantity*5000));
            }
        });

        return v;
    }

}
