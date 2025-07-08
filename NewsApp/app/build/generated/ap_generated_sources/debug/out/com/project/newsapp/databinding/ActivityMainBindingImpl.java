package com.project.newsapp.databinding;
import com.project.newsapp.R;
import com.project.newsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.ivToolbarCountry, 2);
        sViewsWithIds.put(R.id.nested_scroll_view, 3);
        sViewsWithIds.put(R.id.cardBusiness, 4);
        sViewsWithIds.put(R.id.cardEntertainment, 5);
        sViewsWithIds.put(R.id.cardHealth, 6);
        sViewsWithIds.put(R.id.cardScience, 7);
        sViewsWithIds.put(R.id.cardSports, 8);
        sViewsWithIds.put(R.id.cardTechnology, 9);
        sViewsWithIds.put(R.id.recyclerView, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            );
        this.lytParent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.project.newsapp.viewmodels.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.project.newsapp.viewmodels.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}