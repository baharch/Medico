package org.bahar.medico.model;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by Bahar on 1/8/2018.
 */

public class Comments extends RealmObject {
    @Required
    private Double Comment_ID;
    @Required
    private Double doctor_ID;
    private String Comment;
    private String uer_name;

    public Double getComment_ID() {
        return Comment_ID;
    }

    public void setComment_ID(Double comment_ID) {
        Comment_ID = comment_ID;
    }

    public Double getDoctor_ID() {
        return doctor_ID;
    }

    public void setDoctor_ID(Double doctor_ID) {
        this.doctor_ID = doctor_ID;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getUer_name() {
        return uer_name;
    }

    public void setUer_name(String uer_name) {
        this.uer_name = uer_name;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "Comment_ID=" + Comment_ID + '\n' +
                ", doctor_ID=" + doctor_ID + '\n' +
                ", Comment='" + Comment + '\n' +
                ", uer_name='" + uer_name + '\n' +
                '}';
    }
}
