package com.project.newsapp.databinding;
import com.project.newsapp.R;
import com.project.newsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewsBindingImpl extends NewsBinding implements com.project.newsapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private NewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.lytParent.setTag(null);
        this.newsImage.setTag(null);
        this.newsPublishDate.setTag(null);
        this.newsSourceName.setTag(null);
        this.newsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.project.newsapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.news == variableId) {
            setNews((com.project.newsapp.model.News) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.project.newsapp.clicklisteners.AdapterItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNews(@Nullable com.project.newsapp.model.News News) {
        this.mNews = News;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.news);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.project.newsapp.clicklisteners.AdapterItemClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String newsSourceSourceName = null;
        com.project.newsapp.model.News news = mNews;
        com.project.newsapp.clicklisteners.AdapterItemClickListener clickListener = mClickListener;
        java.lang.String newsNewsPublishedDate = null;
        com.project.newsapp.model.News.Source newsSource = null;
        java.lang.String newsNewsTitle = null;
        java.lang.String newsNewsImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (news != null) {
                    // read news.newsPublishedDate
                    newsNewsPublishedDate = news.getNewsPublishedDate();
                    // read news.source
                    newsSource = news.getSource();
                    // read news.newsTitle
                    newsNewsTitle = news.getNewsTitle();
                    // read news.newsImage
                    newsNewsImage = news.getNewsImage();
                }


                if (newsSource != null) {
                    // read news.source.sourceName
                    newsSourceSourceName = newsSource.getSourceName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.lytParent.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.project.newsapp.model.News.setImage(this.newsImage, newsNewsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newsPublishDate, newsNewsPublishedDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newsSourceName, newsSourceSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newsTitle, newsNewsTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // news
        com.project.newsapp.model.News news = mNews;
        // clickListener
        com.project.newsapp.clicklisteners.AdapterItemClickListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onNewsItemClick(news);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): news
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}