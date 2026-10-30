package com.example.parcialnavegacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView rvListaCelulares;
    private CelularAdaptador adaptador;
    private List<Celular> listaCelulares;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        rvListaCelulares = view.findViewById(R.id.rvListaCelulares);
        rvListaCelulares.setLayoutManager(new LinearLayoutManager(getContext()));

        listaCelulares = new ArrayList<>();
        listaCelulares.add(new Celular(
                "iPhone 18 Pro Max",
                "Chip A20 Pro · Titanio Forjado · Zoom 10x",
                "Borgoña, Azul Glacial, Plata, Negro",
                "$ 6.899.900 COP",
                "Stock: 4 uds",
                R.drawable.cel_iphone18
        ));
        listaCelulares.add(new Celular(
                "Samsung Galaxy S26 Ultra",
                "Snapdragon 8 Gen 5 · 16GB RAM · 200MP",
                "Titanium Black, Gray, Violet, Yellow",
                "$ 6.499.900 COP",
                "Stock: 7 uds",
                R.drawable.cel_s26
        ));
        listaCelulares.add(new Celular(
                "Honor Magic 8 Pro",
                "Cámara Falcon 180MP · Batería 5600mAh",
                "Epi Green, Midnight Black, Velvet Cyan",
                "$ 4.999.900 COP",
                "Stock: 6 uds",
                R.drawable.cel_honor8
        ));
        listaCelulares.add(new Celular(
                "Huawei Pura 80 Ultra",
                "Cámara Retráctil XMAGE · Sensor 1 pulgada",
                "Verde Chanon, Marrón Moka, Negro Clásico",
                "$ 5.999.900 COP",
                "Stock: 5 uds",
                R.drawable.cel_huawei80
        ));
        listaCelulares.add(new Celular(
                "Samsung Galaxy Z Fold 7",
                "Pantalla Plegable AMOLED 2X · Armor Aluminum",
                "Silver Shadow, Navy, Crafted Black",
                "$ 7.499.900 COP",
                "Stock: 3 uds",
                R.drawable.cel_zfold7
        ));

        adaptador = new CelularAdaptador(listaCelulares);
        rvListaCelulares.setAdapter(adaptador);

        return view;
    }
}