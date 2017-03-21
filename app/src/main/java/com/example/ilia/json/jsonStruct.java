package com.example.ilia.json;


import java.util.Arrays;
import java.util.Comparator;

public class jsonStruct {

    private int id;
    private String name;
    private int size;
    private User[] users;

    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append("id: '" + this.id + "', name: '" + this.name + "', size: '" + this.size);

        // 2. sort using comparator: sort by id
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.compareTo(o2);
//                if (o1.check > o2.check){
//                    return 1;
//                } else return  0;
            }
        });
        Arrays.sort(users);
        for (User user : users) {
            data.append("' users:" + user.toString());
        }

        return data.toString();
    }

}
