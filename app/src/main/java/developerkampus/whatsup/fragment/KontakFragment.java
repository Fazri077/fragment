package developerkampus.whatsup.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import developerkampus.whatsup.R;
import developerkampus.whatsup.adapter.KontakAdapter;


public class KontakFragment extends Fragment {
    private ListView listView;

    String[] nama ={"Dodi Rivaldi", "Intan & Aang", "Tri", "Siti", "Wamba"};
    String[] telp ={"1234","1234","1234","1234","1234"};
    Integer[] image = {R.drawable.id,R.drawable.id,R.drawable.id,R.drawable.id,R.drawable.id};

    public KontakFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        KontakAdapter adapter = new KontakAdapter(getActivity(),nama,telp,image);
        listView = (ListView) view.findViewById(R.id.lv_kontak);
        listView.setAdapter(adapter);

        return view;
    }

}
