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

public class SumaFragment extends Fragment {

    private EditText edtNum1, edtNum2;
    private Button btnCalcular;
    private TextView txtResultado;

    public SumaFragment() {
        // Constructor vacío requerido
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el diseño para este fragmento
        View view = inflater.inflate(R.layout.fragment_suma, container, false);

        // Inicializar los componentes
        edtNum1 = view.findViewById(R.id.edtNum1);
        edtNum2 = view.findViewById(R.id.edtNum2);
        btnCalcular = view.findViewById(R.id.btnCalcular);
        txtResultado = view.findViewById(R.id.txtResultado);

        // Configurar el evento click del botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = edtNum1.getText().toString().trim();
                String n2 = edtNum2.getText().toString().trim();

                if (!n1.isEmpty() && !n2.isEmpty()) {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int suma = num1 + num2;

                    txtResultado.setText("Resultado: " + suma);
                } else {
                    Toast.makeText(getContext(), "Por favor complete ambos campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}