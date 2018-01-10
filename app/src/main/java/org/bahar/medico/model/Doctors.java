package org.bahar.medico.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by Bahar on 1/8/2018.
 */

public class Doctors extends RealmObject {
    @Required
    private Double doctor_ID;
    @Required
    private String name;
    @Required
    private String family;

    private RealmList<Categories> categories;

    private String expert;
    private String description;
    private String address;
    private String tel;
    private String web;
    private int rate;

    public Double getDoctor_ID() {
        return doctor_ID;
    }

    public void setDoctor_ID(Double doctor_ID) {
        this.doctor_ID = doctor_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Double getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(Double category_ID) {
        this.category_ID = category_ID;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "doctor_ID=" + doctor_ID + '\n'+
                ", name='" + name + '\n' +
                ", family='" + family + '\n' +
                ", category_ID=" + category_ID + '\n' +
                ", expert='" + expert + '\n' +
                ", description='" + description + '\n' +
                ", address='" + address + '\n' +
                ", tel='" + tel + '\n' +
                ", web='" + web + '\n' +
                ", rate=" + rate + '\n' +
                '}';
    }
}
