package com.example.navigatedrawerjh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link operacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class operacionesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public operacionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment operacionesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static operacionesFragment newInstance(String param1, String param2) {
        operacionesFragment fragment = new operacionesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private EditText txtnr1, txtnr2;
    private Button btnSumar, btnRestar, btnMulti, btnDiv, btnFact, btnPow, btnSeno, btnCoseno, btnP, btnSpla;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_operaciones, container, false);

        txtnr1 = view.findViewById(R.id.txtn1);
        txtnr2 = view.findViewById(R.id.txtn2);
        btnSumar = view.findViewById(R.id.btnSuma);
        btnRestar = view.findViewById(R.id.btnResta);
        btnMulti = view.findViewById(R.id.btnMultiplicacion);
        btnDiv = view.findViewById(R.id.btnDivision);
        btnFact = view.findViewById(R.id.btnFactorial);
        btnPow = view.findViewById(R.id.btnPotencia);
        btnSeno = view.findViewById(R.id.btnSeno);
        btnCoseno = view.findViewById(R.id.btnCoseno);
        btnP = view.findViewById(R.id.btnPrincipio);
        btnSpla = view.findViewById(R.id.btnSlpash);


        btnSpla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.splashFragment);
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.image2Fragment);
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double numero2 = Double.parseDouble(txtnr2.getText().toString());

                double suma = numero1 + numero2 ;

                Toast.makeText(getActivity(), "La suma es: " + suma, Toast.LENGTH_SHORT).show();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double numero2 = Double.parseDouble(txtnr2.getText().toString());

                double resta = numero1 - numero2 ;

                Toast.makeText(getActivity(), "La resta es: " + resta, Toast.LENGTH_SHORT).show();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double numero2 = Double.parseDouble(txtnr2.getText().toString());

                double mut = numero1 * numero2 ;

                Toast.makeText(getActivity(), "La multiplicación es: " + mut, Toast.LENGTH_SHORT).show();
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double numero2 = Double.parseDouble(txtnr2.getText().toString());

               if(numero2==0){

                   Toast.makeText(getActivity(), "division entre cero imposible: ", Toast.LENGTH_SHORT).show();
               } else{

                   double divd = numero1 / numero2 ;

                   Toast.makeText(getActivity(), "La division es: " + divd, Toast.LENGTH_SHORT).show();

               }

            }
        });

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double facto=1, i;
                if (numero1 == 0){
                    facto = 1;}
                else{
                    for(i=1;i<=numero1;i++){
                        facto=facto*i;
                    }

                }

                Toast.makeText(getActivity(), "La multiplicación es: " + facto, Toast.LENGTH_SHORT).show();
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());
                double numero2 = Double.parseDouble(txtnr2.getText().toString());

                double pow;
                pow = Math.pow(numero1,numero2);

                Toast.makeText(getActivity(), "La potencia es: " + pow, Toast.LENGTH_SHORT).show();
            }
        });

        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());

                double pow;
                pow = Math.sin(numero1)*180/Math.PI;

                Toast.makeText(getActivity(), "La potencia es: " + pow, Toast.LENGTH_SHORT).show();
            }
        });

        btnCoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnr1.getText().toString());

                double pow;
                pow = Math.cos(numero1)*180/Math.PI;

                Toast.makeText(getActivity(), "La potencia es: " + pow, Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }
}