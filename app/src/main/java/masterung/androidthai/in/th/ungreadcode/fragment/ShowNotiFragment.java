package masterung.androidthai.in.th.ungreadcode.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import masterung.androidthai.in.th.ungreadcode.NotificationActivity;
import masterung.androidthai.in.th.ungreadcode.R;

/**
 * Created by muc on 23/3/2561.
 */

public class ShowNotiFragment extends Fragment {

    private String[] messageString;

    public static ShowNotiFragment showNotiInstance(String[] messageString) {

        ShowNotiFragment showNotiFragment = new ShowNotiFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Message", messageString);
        showNotiFragment.setArguments(bundle);
        return showNotiFragment;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Vaue From Argument
        messageString = getArguments().getStringArray("Message");

//        Create Toolbar
        createToolbar();

    }   // Main Class

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarShowNoti);
        ((NotificationActivity) getActivity()).setSupportActionBar(toolbar);

        ((NotificationActivity) getActivity()).getSupportActionBar().setTitle(messageString[3]);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_notification, container, false);

        return view;
    }
}   // Main Class

