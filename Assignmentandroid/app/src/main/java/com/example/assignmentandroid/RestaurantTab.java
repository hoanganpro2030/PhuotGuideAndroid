package com.example.assignmentandroid;

import android.app.ListFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;

import static android.R.*;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestaurantTab.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestaurantTab#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantTab extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RestaurantTab() {
        // Required empty public constructor
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        //View rootView = inflater.inflate(R.layout.fragment_restaurant_tab, container, false);
        //ListView listView = (ListView) getActivity().findViewById(R.id.listView1);
//        Restaurant Res1= new Restaurant("Quán cơm Huế",35000,0.5);
//        Restaurant Res2 = new Restaurant("Quán cơm Ngọc Thủy",30000,0.7);
//        Restaurant Res3 = new Restaurant("Quán bún cá Hạnh",35000, 1.2);
//        Restaurant[] Res = new Restaurant[]{Res1,Res2,Res3};
//        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
//                "Jupiter", "Saturn", "Uranus", "Neptune"};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Objects.requireNonNull(getActivity()), layout.simple_list_item_1,planets);
//        listView.setAdapter(arrayAdapter);
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantTab.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantTab newInstance(String param1, String param2) {
        RestaurantTab fragment = new RestaurantTab();
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


//        Restaurant Res1= new Restaurant("Quán cơm Huế",35000,0.5);
//        Restaurant Res2 = new Restaurant("Quán cơm Ngọc Thủy",30000,0.7);
//        Restaurant Res3 = new Restaurant("Quán bún cá Hạnh",35000, 1.2);
//
//        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
//                "Jupiter", "Saturn", "Uranus", "Neptune"};
//
//        Restaurant[] Res = new Restaurant[]{Res1,Res2,Res3};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,planets);
//        listView.setAdapter(arrayAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant_tab, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView1);
//        Restaurant Res1= new Restaurant("Quán cơm Huế",35000,0.5);
//        Restaurant Res2 = new Restaurant("Quán cơm Ngọc Thủy",30000,0.7);
//        Restaurant Res3 = new Restaurant("Quán bún cá Hạnh",35000, 1.2);
//        Restaurant[] Res = new Restaurant[]{Res1,Res2,Res3};
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), layout.simple_list_item_1,planets);
        listView.setAdapter(arrayAdapter);
        return inflater.inflate(R.layout.fragment_restaurant_tab, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
