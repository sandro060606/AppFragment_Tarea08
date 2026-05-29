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

public class MultiplicacionFragment extends Fragment {

    private EditText edtNum1, edtNum2;
    private Button btnCalcular;
    private TextView txtResultado;

    //Constructor
    public MultiplicacionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Asociar el fragment con el XML
        View view = inflater.inflate(R.layout.fragment_multiplicacion, container, false);

        // Inicializar los componentes
        edtNum1 = view.findViewById(R.id.edtNum1M);
        edtNum2 = view.findViewById(R.id.edtNum2M);
        btnCalcular = view.findViewById(R.id.btnCalcularM);
        txtResultado = view.findViewById(R.id.txtResultadoM);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = edtNum1.getText().toString().trim();
                String n2 = edtNum2.getText().toString().trim();

                if (!n1.isEmpty() && !n2.isEmpty()) {
                    int multiplicacion = Integer.parseInt(n1) * Integer.parseInt(n2);
                    txtResultado.setText("Resultado: " + multiplicacion);
                } else {
                    Toast.makeText(getContext(), "Por favor complete ambos campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
