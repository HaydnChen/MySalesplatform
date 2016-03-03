package com.ebao.ls.mysalesplatform.customer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.ebao.ls.mysalesplatform.ReusablePagerAdapter;

/**
 * Created by haydn.chen on 3/2/2016.
 */
public class CustomerCollectionPagerAdapter extends ReusablePagerAdapter {
  public CustomerCollectionPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  private final Fragment[] customerPages = new Fragment[] {new CustomerFragment_()};

  @Override public Fragment[] getFragments() {
    return customerPages;
  }
}
