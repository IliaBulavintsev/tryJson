package com.example.ilia.json;


import android.util.Log;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class jsonStruct {

    private int id;
    private String name;
    private int size;
    private List<User> users;


    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append("id: '" + this.id + "', name: '" + this.name + "', size: '" + this.size +"\n");

        Comparator<User> byKaff = new Comparator<User>() {
            public int compare(User left, User right) {
                return Ints.compare(left.age*Math.abs((int)left.weight-50), right.age*Math.abs((int)right.weight-50));
            }
        };
        Comparator<User> byK = Ordering.from(byKaff);

        Collections.sort(users, byK);

        Log.d("qq", users.toString());

        for (User user : users) {
            data.append("' users:" + user.toString());
        }

        return data.toString();
    }

}
