package com.example.pint;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MensagensFragment extends Fragment {

    public MensagensFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mensagens, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView mensagem = (TextView) getView().findViewById(R.id.textView22);

        mensagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Mensagem = new Intent(getActivity(), MensagemActivity.class);
                startActivity(Mensagem);
            }
        });
    }

    public static MensagensFragment newInstance() {
        return new MensagensFragment();
    }
}
