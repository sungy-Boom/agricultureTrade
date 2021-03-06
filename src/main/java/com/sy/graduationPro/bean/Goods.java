package com.sy.graduationPro.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sunguiyong on 2018/5/16.
 */
@Entity
@Table(name = "goods")
public class Goods implements Serializable {
    private static final long serialVersionUID = 8921419105732610201L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addTime = new Date();

    private String name;
    private String kindUid;
    private String goodsPic;
    private Float sellTotalNum = 0f;
    private Integer hasDel = 0;

    public Goods() {
    }

    public Goods(String name, String kindUid) {
        this.name = name;
        this.kindUid = kindUid;
    }

    public Goods(String name, String kindUid, String goodsPic) {
        this.name = name;
        this.kindUid = kindUid;
        this.goodsPic = goodsPic;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public Float getSellTotalNum() {
        return sellTotalNum;
    }

    public void setSellTotalNum(Float sellTotalNum) {
        this.sellTotalNum = sellTotalNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindUid() {
        return kindUid;
    }

    public void setKindUid(String kindUid) {
        this.kindUid = kindUid;
    }

    public Integer getHasDel() {
        return hasDel;
    }

    public void setHasDel(Integer hasDel) {
        this.hasDel = hasDel;
    }
}
