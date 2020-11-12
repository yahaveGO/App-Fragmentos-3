package com.example.appfragmentos3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    private OnFragmentInteraction contexto;
    private EditText editName;
    private EditText editPaterno;
    private EditText editMaterno;
    private TextView tvSalida;

    public BlankFragment() {
        // Required empty public constructor
    }

    public void OnAttach(@NonNull Context context){
        super.onAttach(context);
        contexto = (OnFragmentInteraction) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        editName    = v.findViewById(R.id.editName);
        editPaterno = v.findViewById(R.id.editPaterno);
        editMaterno = v.findViewById(R.id.editMaterno);
        tvSalida    = v.findViewById(R.id.tvSalida);

        v.findViewById(R.id.botonSaludar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editName.getText().toString()+" "+editPaterno.getText().toString()+" "+editMaterno.getText().toString();
                //Persona persona = new Persona(editName.getText().toString()+" "+editPaterno.getText().toString()+" "+editMaterno.getText().toString());
                contexto.visualizar(nombre);
                tvSalida.setText(nombre);
                //tvSalida.setText(persona.toString());
            }
        });
        return v;
    }

    public interface OnFragmentInteraction{
        void visualizar(String nombre);
        //void getPersona(Persona persona);
    }
}