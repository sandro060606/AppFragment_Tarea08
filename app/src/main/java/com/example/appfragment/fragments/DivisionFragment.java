package com.example.appfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appfragment.R;

public class DivisionFragment extends Fragment {

    private EditText edtNum1D, edtNum2D;
    private Button btnCalcularD;
    private TextView txtResultadoD;

    public DivisionFragment() {
        // Constructor vacío requerido
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Asociar el fragment con el XML
        View view = inflater.inflate(R.layout.fragment_division, container, false);

        // CORRECCIÓN DE IDs: Deben coincidir con los de fragment_division.xml
        edtNum1D = view.findViewById(R.id.edtNum1D);
        edtNum2D = view.findViewById(R.id.edtNum2D);
        btnCalcularD = view.findViewById(R.id.btnCalcularD);
        txtResultadoD = view.findViewById(R.id.txtResultadoD);

        btnCalcularD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtNum1D.getText().toString().trim();
                String s2 = edtNum2D.getText().toString().trim();
                
                // Validación: No vacíos (Usar || para que salte si CUALQUIERA está vacío)
                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(getContext(), "Por favor complete ambos campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double n1 = Integer.parseInt(s1);
                    double n2 = Integer.parseInt(s2);
                    if (n1 > n2) {
                        double division = n1 / n2;
                        txtResultadoD.setText("Resultado: " + division);
                    } else {
                        Toast.makeText(getContext(), "El primer número no puede ser menor que el segundo", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getContext(), "Ingrese números enteros válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
