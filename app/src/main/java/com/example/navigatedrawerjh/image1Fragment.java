package com.example.navigatedrawerjh;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link image1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class image1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public image1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment image1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static image1Fragment newInstance(String param1, String param2) {
        image1Fragment fragment = new image1Fragment();
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

    private VideoView vd1 ;
    private Button btnMav;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image1, container, false);

        btnMav = view.findViewById(R.id.btnmaravillas);

        btnMav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.image3Fragment);
            }
        });

        vd1 = view.findViewById(R.id.videoView);

        Uri uri  = Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.video);
        vd1.setVideoURI(uri);
        vd1.requestFocus();
        vd1.setMediaController(new MediaController(getActivity()));
        vd1.start();


        return view;
    }

}