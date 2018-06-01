package com.example.android.welcomeguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CardFragment extends Fragment {

    private CardView cardView;

    public static Fragment getInstance(int position) {
        CardFragment f = new CardFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        f.setArguments(args);

        return f;
    }

    @SuppressLint("DefaultLocale")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewpager, container, false);

        String tit[] = new String[8];
        tit[0] = "Ambala";
        tit[1] = "Patiala";
        tit[2] = "Chandigarh";
        tit[3] = "Mohali";
        tit[4] = "Zirakpur";
        tit[5] = "Panchkula";
        tit[6] = "Kalka";
        tit[7] = "Rajpura";


        // route_info information

        String info[] = new String[8];
        info[0] = "Route No. - 54\nRoute No. - 55 \nRoute No. - 56\nRoute No. - 57\nRoute No. - 58\nRoute No. - 59";
        info[1] = "Route No. - 41\nRoute No. - 42 \nRoute No. - 43\nRoute No. - 44\nRoute No. - 45\nRoute No. - 46";
        info[2] = "Route No. - 1 \nRoute No. - 2  \nRoute No. - 3 \nRoute No. - 4 \nRoute No. - 5 \nRoute No. - 6";
        info[3] = "Route No. - 21\nRoute No. - 22 \nRoute No. - 23\nRoute No. - 24\nRoute No. - 25\nRoute No. - 26";
        info[4] = "Route No. - 63\nRoute No. - 64 \nRoute No. - 65\nRoute No. - 66\nRoute No. - 67\nRoute No. - 68";
        info[5] = "Route No. - 30\nRoute No. - 31 \nRoute No. - 32\nRoute No. - 33\nRoute No. - 34\nRoute No. - 35";
        info[6] = "Route No. - 70\nRoute No. - 71 \nRoute No. - 72\nRoute No. - 73\nRoute No. - 74\nRoute No. - 75";
        info[7] = "Route No. - 52\nRoute No. - 76 \nRoute No. - 77\nRoute No. - 78\nRoute No. - 79\nRoute No. - 80";
        String intentClasses[] = new String[8];
        intentClasses[0] = "AmbalaActivity.class";
        cardView = (CardView) view.findViewById(R.id.cardView);
        cardView.setMaxCardElevation(cardView.getCardElevation() * CardAdapter.MAX_ELEVATION_FACTOR);

        TextView title = (TextView) view.findViewById(R.id.title);
        Button button = (Button)view.findViewById(R.id.button);
        // For Text in center
        TextView information = (TextView) view.findViewById(R.id.route_info);

        // title.setText(tit[position]);
        title.setText(String.format("%s", tit[getArguments().getInt("position")]));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "Button in Card " + getArguments().getInt("position")
                        //+ "Clicked!", Toast.LENGTH_SHORT).show();
                int pos = getArguments().getInt("position");
                Intent intentt = null;
                    if (pos == 0)
                        {intentt = new Intent(getActivity(),ambalaActivity.class);
                        startActivity(intentt);}
                    else if(pos==1)
                    { intentt = new Intent(getActivity(), patialaActivity.class);
                            startActivity(intentt); }
                    else if(pos==2)
                    {intentt = new Intent(getActivity(), chandigarhActivity.class);
                        startActivity(intentt);}
                        else if(pos==3)
                    {intentt = new Intent(getActivity(), mohaliActivity.class);
                        startActivity(intentt);}
                    else if(pos==4)
                    {intentt = new Intent(getActivity(), zirakpurActivity.class);
                        startActivity(intentt);}
                    else if(pos==5)
                    {intentt = new Intent(getActivity(), panchkulaActivity.class);
                        startActivity(intentt);}
                    else if(pos==6)
                    {intentt = new Intent(getActivity(), kalkaActivity.class);
                        startActivity(intentt);}
                    else if(pos==7)
                    {intentt = new Intent(getActivity(), rajpuraActivity.class);
                        startActivity(intentt);}

            }
        });

        // Function defined for information

        information.setText(String.format("%s", info[getArguments().getInt("position")]));
        return view;
    }

    public CardView getCardView() {
        return cardView;
    }
}
