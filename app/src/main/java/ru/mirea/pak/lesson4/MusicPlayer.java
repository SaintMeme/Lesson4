package ru.mirea.pak.lesson4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.mirea.pak.lesson4.databinding.FragmentMusicPlayerBinding;


public	class	MusicPlayer	extends	Fragment	{
    private FragmentMusicPlayerBinding binding;
    public	View	onCreateView(@NonNull LayoutInflater	inflater, ViewGroup	container,	Bundle	savedInstanceState)	{
        binding	=	FragmentMusicPlayerBinding.inflate(inflater,	container,	false);
        View	root	=	binding.getRoot();
        final TextView textView	=	binding.textView;
        return	root;
    }
    @Override
    public	void	onDestroyView()	{
        super.onDestroyView();
        binding	=	null;
    }
}


///**
// * A simple {@link Fragment} subclass.
// * Use the {@link MusicPlayer#newInstance} factory method to
// * create an instance of this fragment.
// *
// */
//public class MusicPlayer extends Fragment {
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment MusicPlayer.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static MusicPlayer newInstance(String param1, String param2) {
//        MusicPlayer fragment = new MusicPlayer();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    public MusicPlayer() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_music_player, container, false);
//    }
//}