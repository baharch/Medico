package org.bahar.medico.model;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by Bahar on 1/8/2018.
 */

public class Categories extends RealmObject {
    @Required
    private String category;
    @Required
    private Double category_ID;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(Double category_ID) {
        this.category_ID = category_ID;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category='" + category + '\n' +
                ", category_ID=" + category_ID + '\n' +
                '}';
    }
}
