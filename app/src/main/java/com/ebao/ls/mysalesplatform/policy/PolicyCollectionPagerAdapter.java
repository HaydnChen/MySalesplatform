package com.ebao.ls.mysalesplatform.policy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.ebao.ls.mysalesplatform.ReusablePagerAdapter;

/**
 * Created by haydn.chen on 3/2/2016.
 */
public class PolicyCollectionPagerAdapter extends ReusablePagerAdapter {
  private  final Fragment[] pages = new Fragment[] {new PolicyFragment_()};

  public PolicyCollectionPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override public Fragment[] getFragments() {
    return pages;
  }
}
