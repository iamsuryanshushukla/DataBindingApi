package com.demo.databindingdemo.databinding;
import com.demo.databindingdemo.R;
import com.demo.databindingdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerviewRowBindingImpl extends RecyclerviewRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.thubmImage, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerviewRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RecyclerviewRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            );
        this.createdDateTextView.setTag(null);
        this.descTextView.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameTextView.setTag(null);
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
        if (BR.recyclerData == variableId) {
            setRecyclerData((com.demo.databindingdemo.RecyclerData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRecyclerData(@Nullable com.demo.databindingdemo.RecyclerData RecyclerData) {
        this.mRecyclerData = RecyclerData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.recyclerData);
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
        java.lang.String recyclerDataDescriptionJavaLangObjectNullJavaLangStringNoDescAvaialableRecyclerDataDescription = null;
        boolean recyclerDataDescriptionJavaLangObjectNull = false;
        com.demo.databindingdemo.RecyclerData recyclerData = mRecyclerData;
        java.lang.String recyclerDataDescription = null;
        java.lang.String recyclerDataCreatedAt = null;
        java.lang.String recyclerDataName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (recyclerData != null) {
                    // read recyclerData.description
                    recyclerDataDescription = recyclerData.getDescription();
                    // read recyclerData.created_at
                    recyclerDataCreatedAt = recyclerData.getCreated_at();
                    // read recyclerData.name
                    recyclerDataName = recyclerData.getName();
                }


                // read recyclerData.description == null
                recyclerDataDescriptionJavaLangObjectNull = (recyclerDataDescription) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(recyclerDataDescriptionJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read recyclerData.description == null ? "No Desc avaialable" : recyclerData.description
                recyclerDataDescriptionJavaLangObjectNullJavaLangStringNoDescAvaialableRecyclerDataDescription = ((recyclerDataDescriptionJavaLangObjectNull) ? ("No Desc avaialable") : (recyclerDataDescription));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.createdDateTextView.setText(recyclerDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descTextView, recyclerDataDescriptionJavaLangObjectNullJavaLangStringNoDescAvaialableRecyclerDataDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, recyclerDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): recyclerData
        flag 1 (0x2L): null
        flag 2 (0x3L): recyclerData.description == null ? "No Desc avaialable" : recyclerData.description
        flag 3 (0x4L): recyclerData.description == null ? "No Desc avaialable" : recyclerData.description
    flag mapping end*/
    //end
}