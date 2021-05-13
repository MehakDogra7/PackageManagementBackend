package com.manage.product_management.model;


import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RecordTable")
public class RecordTable {

    @Id
    @Column(name = "Item_No")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_no;

    @NotNull
    @Column(name = "Tracking_Id")
    private String track_id;

    @NotNull
    @Column(name = "Name")
    private String name;

    @NotNull
    @Column(name = "Company_Name")
    private String comp_name;

    @Column(name = "remark")
    private String remark;

    @NotNull
    @Column(name = "Status")
    private String status;

    @NotNull
    @Column(name = "Contact")
    private  String number;

    @NotNull
    @Column(name = "Date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @PrePersist
    void onCreate()
    {
        date=new Date();
        status="Unpicked";
    }

    public RecordTable() {
    }

    public RecordTable(Long item_no, String track_id, String name, String comp_name, String remark, String status, String number, Date date) {
        this.item_no = item_no;
        this.track_id = track_id;
        this.name = name;
        this.comp_name = comp_name;
        this.remark = remark;
        this.status = status;
        this.number = number;
        this.date = date;
    }


    public Long getItem_no() {
        return item_no;
    }

    public void setItem_no(Long item_no) {
        this.item_no = item_no;
    }

    public String getTrack_id() {
        return track_id;
    }

    public void setTrack_id(String track_id) {
        this.track_id = track_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "item_no=" + item_no +
                ", TrackID='" + track_id + '\'' +
                ", Name=" + name + '\'' +
                ", Company_Name=" + comp_name + '\'' +
                ", remarks=" + remark + '\'' +
                ", Status=" + status + '\'' +
                ", Contact='" + number + '\'' +
                ", Date=" + date +
                '}';
    }
}
