package com.project.newsapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.project.newsapp.databinding.ActivityMainBindingImpl;
import com.project.newsapp.databinding.NewsBindingImpl;
import com.project.newsapp.databinding.NewsDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGHEADERPOLYGON = 2;

  private static final int LAYOUT_ITEMNEWSDASHBOARD = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.project.newsapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.project.newsapp.R.layout.dialog_header_polygon, LAYOUT_DIALOGHEADERPOLYGON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.project.newsapp.R.layout.item_news_dashboard, LAYOUT_ITEMNEWSDASHBOARD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGHEADERPOLYGON: {
          if ("layout/dialog_header_polygon_0".equals(tag)) {
            return new NewsDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_header_polygon is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWSDASHBOARD: {
          if ("layout/item_news_dashboard_0".equals(tag)) {
            return new NewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news_dashboard is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "listener");
      sKeys.put(3, "news");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_main_0", com.project.newsapp.R.layout.activity_main);
      sKeys.put("layout/dialog_header_polygon_0", com.project.newsapp.R.layout.dialog_header_polygon);
      sKeys.put("layout/item_news_dashboard_0", com.project.newsapp.R.layout.item_news_dashboard);
    }
  }
}
