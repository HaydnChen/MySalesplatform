package com.ebao.ls.mysalesplatform;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by haydn.chen on 3/2/2016.
 */
public abstract class ReusablePagerAdapter extends FragmentPagerAdapter {

  private  final FragmentManager fm;

  public ReusablePagerAdapter(FragmentManager fm) {
    super(fm);
    this.fm = fm;
  }

  public abstract Fragment[] getFragments();

  public FragmentManager getFragmentManager() {
    return fm;
  }

  @Override
  public Fragment getItem(int i) {
    return getFragments()[i];
  }

  @Override
  public int getCount() {
    return getFragments().length;
  }

  public void clearAll() {
    for (Fragment fragment : getFragments()) {
      getFragmentManager().beginTransaction().remove(fragment).commit();
    }
    notifyDataSetChanged();
  }

  public void addAll() {
    for (Fragment fragment : getFragments()) {
      getFragmentManager().beginTransaction().attach(fragment).commit();
    }
    notifyDataSetChanged();
  }
}
