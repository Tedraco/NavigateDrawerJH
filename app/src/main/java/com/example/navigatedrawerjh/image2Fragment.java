package com.example.navigatedrawerjh;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link image2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class image2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public image2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment image2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static image2Fragment newInstance(String param1, String param2) {
        image2Fragment fragment = new image2Fragment();
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


    private WebView wv1;
    private EditText et1;
    private Button btnface, btnMar, btnOpe;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image2, container, false);

        btnface = view.findViewById(R.id.btnFacebook);
        btnMar = view.findViewById(R.id.btnMar);
        btnOpe = view.findViewById(R.id.btnCerrar);
        wv1 = view.findViewById(R.id.wv1);

        btnOpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.operacionesFragment);
            }
        });

        btnMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.image3Fragment);
            }
        });

        btnface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                if (intent!=null)
                { startActivity(intent); }
            }
        });

        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.nasa.gov/");
        return  view;
    }

    public void openApp(View view){
        Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        if (intent!=null)
            { startActivity(intent); }
    }
}