package scorpio.com.swipeviews;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * This class helps to access and display the fragments inside viewPager
 * Created by Ayush Bansal on 27-12-2016.
 */

public class MCollectionPagerAdapter extends FragmentStatePagerAdapter {
    public MCollectionPagerAdapter(FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
