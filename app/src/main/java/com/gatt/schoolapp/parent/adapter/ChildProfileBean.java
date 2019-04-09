package com.gatt.schoolapp.parent.adapter;

/**
 * Created by Sushil Chaurasiya on 27/03/2018.
 */

public class ChildProfileBean {
    String child_id;
    String image;
    String name;
    String admission_no;
    String roll_no;
    String classname;
    String section;
    String rte;

    // message_list adapter  && user list adapter
    public ChildProfileBean(String child_id, String name, String image, String admission_no, String roll_no , String classname, String section, String rte) {
        this.child_id = child_id;
        this.name = name;
        this.image = image;
        this.admission_no = admission_no;
        this.roll_no = roll_no;
        this.classname = classname;
        this.section = section;
        this.rte = rte;
    }
    public String getChldId() {
        return child_id;
    }
    public String getChildName() {
        return name;
    }
    public String getChildImage() {
        return image;
    }
    public String getChildAdmissionNo() {
        return admission_no;
    }
    public String getChildRollNo() {
        return roll_no;
    }
    public String getChildClass() {
        return classname;
    }
    public String getChildSection() {
        return section;
    }
    public String getChildRTE() {
        return rte;
    }

}
