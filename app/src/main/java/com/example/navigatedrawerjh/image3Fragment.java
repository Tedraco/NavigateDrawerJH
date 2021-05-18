package com.example.navigatedrawerjh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link image3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class image3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public image3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment image3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static image3Fragment newInstance(String param1, String param2) {
        image3Fragment fragment = new image3Fragment();
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

    private ImageView imgg;
    private ImageButton img1, img2, img3, img4,img5,img6,img7;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image3, container, false);

        img1  = view.findViewById(R.id.imMach);
        img2  = view.findViewById(R.id.imRom);
        img3  = view.findViewById(R.id.imChich);
        img4  = view.findViewById(R.id.imMuralla);
        img5  = view.findViewById(R.id.imPetra);
        img6  = view.findViewById(R.id.imtaj);
        img7  = view.findViewById(R.id.imCrist);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo MACHU PICCHU - fue planificada y construida alrededor del año 1400 d.C" , Toast.LENGTH_SHORT).show();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo ROMA - es una extensa ciudad cosmopolita que tiene a la vista casi 3,000 años de arte " , Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo CHICHEN ITZA - ruinas mayas famoso a nivel mundial en la península de Yucatán de México " , Toast.LENGTH_SHORT).show();
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo MURALLA CHINA - antigua fortificación china construida y reconstruida entre el siglo V a. C." , Toast.LENGTH_SHORT).show();
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo PETRA - ciudad arqueológica famosa en el desierto, al sudoeste de Jordania. Fundada alrededor del 300 a. C." , Toast.LENGTH_SHORT).show();
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo TAJ MAHAL - monumento funerario construido entre 1631 y 1654 en la ciudad de Agra " , Toast.LENGTH_SHORT).show();
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "La maravilla del mundo CRISTO REDENTOR - es una estatua art déco de Jesús de Nazaret con los brazos abiertos mostrando a la ciudad de Río de Janeiro, Brasil" , Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }
}