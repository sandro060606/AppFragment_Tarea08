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

public class RestaFragment extends Fragment {

    private EditText edtNum1, edtNum2;
    private Button btnCalcular;
    private TextView txtResultado;

    public RestaFragment() {
        // Constructor vacío requerido
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el diseño para este fragmento
        View view = inflater.inflate(R.layout.fragment_resta, container, false);

        // Inicializar los componentes
        edtNum1 = view.findViewById(R.id.edtNum1R);
        edtNum2 = view.findViewById(R.id.edtNum2R);
        btnCalcular = view.findViewById(R.id.btnCalcularR);
        txtResultado = view.findViewById(R.id.txtResultado);

        // Configurar el evento click del botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtNum1.getText().toString().trim();
                String s2 = edtNum2.getText().toString().trim();
                //Validacion nop Vacios
                if (s1.isEmpty() && s2.isEmpty()) {
                    Toast.makeText(getContext(), "Por favor complete ambos campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer n1 = Integer.parseInt(s1);
                Integer n2 = Integer.parseInt(s2);
                if (n1 >= n2) {
                    int resta = n1 - n2;
                    txtResultado.setText("Resultado: " + resta);
                } else {
                    Toast.makeText(getContext(), "El Primer Numero no puede ser Menor que el Segundo Numero", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
