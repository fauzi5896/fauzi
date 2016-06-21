package com.example.fauzi.bekupdua;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by fauzi on 21/06/2016.
 */
//Maksud <String> di bawah adalah hanya mengambil tipe data yang khusus isinya String

public class ListView_adapter extends ArrayAdapter<String> {
    public ListView_adapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }
}
