package com.glencconnect.exercisefragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.glencconnect.exercisefragments.Fragments.ChatsFragments;
import com.glencconnect.exercisefragments.Fragments.ConnectionsFragment;
import com.glencconnect.exercisefragments.Fragments.VideosFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPageFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_pager,container,false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager_adapter);
        final VideosFragment videos = new VideosFragment();
        final ChatsFragments chatsFragments = new ChatsFragments();
        final ConnectionsFragment connectionsFragment = new ConnectionsFragment();

        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return position==0?chatsFragments:position==1?connectionsFragment:videos;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return position==0?"Chats":position==1?"Connections":"Videos";
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        tabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        tabLayout.setTabTextColors(Color.GRAY, Color.WHITE);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
