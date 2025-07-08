package com.project.newsapp.databinding;
import com.project.newsapp.R;
import com.project.newsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewsDialogBindingImpl extends NewsDialogBinding implements com.project.newsapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewsDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private NewsDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            );
        this.btDecline.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatButton) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.project.newsapp.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.project.newsapp.generated.callback.OnClickListener(this, 1);
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
        else if (BR.listener == variableId) {
            setListener((com.project.newsapp.clicklisteners.NewsDialogClickListeners) variable);
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
    public void setListener(@Nullable com.project.newsapp.clicklisteners.NewsDialogClickListeners Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
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
        com.project.newsapp.model.News news = mNews;
        com.project.newsapp.clicklisteners.NewsDialogClickListeners listener = mListener;
        java.lang.String newsNewsDescription = null;
        java.lang.String newsNewsTitle = null;
        java.lang.String newsNewsImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (news != null) {
                    // read news.newsDescription
                    newsNewsDescription = news.getNewsDescription();
                    // read news.newsTitle
                    newsNewsTitle = news.getNewsTitle();
                    // read news.newsImage
                    newsNewsImage = news.getNewsImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btDecline.setOnClickListener(mCallback2);
            this.mboundView5.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.project.newsapp.model.News.setImage(this.mboundView1, newsNewsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, newsNewsTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, newsNewsDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // news.newsUrl
                java.lang.String newsNewsUrl = null;
                // news
                com.project.newsapp.model.News news = mNews;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.project.newsapp.clicklisteners.NewsDialogClickListeners listener = mListener;
                // news != null
                boolean newsJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    newsJavaLangObjectNull = (news) != (null);
                    if (newsJavaLangObjectNull) {


                        newsNewsUrl = news.getNewsUrl();

                        listener.onGotoWebSiteClick(newsNewsUrl);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.project.newsapp.clicklisteners.NewsDialogClickListeners listener = mListener;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {


                    listener.onDismissClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): news
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}