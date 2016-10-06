package com.tangyang.fribbble.view.bucket_list;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.tangyang.fribbble.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by YangTang on 10/6/2016.
 */
public class NewBucketDialogFragment extends DialogFragment {
    @BindView(R.id.new_bucket_name) EditText bucketName;
    @BindView(R.id.new_bucket_description) EditText bucketDescription;

    public static final String TAG = "NewBucketDialogFragment";

    public static NewBucketDialogFragment newInstance() {
        return new NewBucketDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_new_bucket, null);
        ButterKnife.bind(this, view);

        return new android.support.v7.app.AlertDialog.Builder(getContext())
                .setView(view)
                .setTitle(R.string.new_bucket_title)
                .setPositiveButton(R.string.new_bucket_create, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dismiss();
                    }
                })
                .setNegativeButton(R.string.new_bucket_cancel, null)
                .show();
    }
}
