package org.goodev.discourse.ui;

import android.os.Bundle;

import org.goodev.discourse.R;
import org.goodev.discourse.api.Api;

public class NewTopicsFragment extends TopicsListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public CharSequence getTitle() {
        return getResources().getString(R.string.title_new);
    }

    @Override
    public String getInitUrl() {
        return mSiteUrl + Api.NEW;
    }
}
