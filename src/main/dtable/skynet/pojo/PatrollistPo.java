package main.dtable.skynet.pojo;

import java.util.Date;

/**
 * Created by skyRay on 2017/1/18.
 */
public class PatrollistPo {
    private int id;
    private String guid;
    private String rule;
    private int threshold;
    private String type;
    private String category;
    private String source;
    private String description;
    private int warning;
    private int auto;
    private int active;
    private Date wctime;
    private Date actime;
    private Date ctime;

    public PatrollistPo() {
    }

    public PatrollistPo(int id, String guid, String rule, int threshold, String type, String category, String source, String description, int warning, int auto, int active, Date wctime, Date actime, Date ctime) {
        this.id = id;
        this.guid = guid;
        this.rule = rule;
        this.threshold = threshold;
        this.type = type;
        this.category = category;
        this.source = source;
        this.description = description;
        this.warning = warning;
        this.auto = auto;
        this.active = active;
        this.wctime = wctime;
        this.actime = actime;
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatrollistPo)) return false;

        PatrollistPo that = (PatrollistPo) o;

        if (getId() != that.getId()) return false;
        if (getThreshold() != that.getThreshold()) return false;
        if (getWarning() != that.getWarning()) return false;
        if (getAuto() != that.getAuto()) return false;
        if (getActive() != that.getActive()) return false;
        if (getGuid() != null ? !getGuid().equals(that.getGuid()) : that.getGuid() != null) return false;
        if (getRule() != null ? !getRule().equals(that.getRule()) : that.getRule() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getCategory() != null ? !getCategory().equals(that.getCategory()) : that.getCategory() != null)
            return false;
        if (getSource() != null ? !getSource().equals(that.getSource()) : that.getSource() != null) return false;
        if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null)
            return false;
        if (getWctime() != null ? !getWctime().equals(that.getWctime()) : that.getWctime() != null) return false;
        if (getActime() != null ? !getActime().equals(that.getActime()) : that.getActime() != null) return false;
        return !(getCtime() != null ? !getCtime().equals(that.getCtime()) : that.getCtime() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getGuid() != null ? getGuid().hashCode() : 0);
        result = 31 * result + (getRule() != null ? getRule().hashCode() : 0);
        result = 31 * result + getThreshold();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        result = 31 * result + (getSource() != null ? getSource().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + getWarning();
        result = 31 * result + getAuto();
        result = 31 * result + getActive();
        result = 31 * result + (getWctime() != null ? getWctime().hashCode() : 0);
        result = 31 * result + (getActime() != null ? getActime().hashCode() : 0);
        result = 31 * result + (getCtime() != null ? getCtime().hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWarning() {
        return warning;
    }

    public void setWarning(int warning) {
        this.warning = warning;
    }

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Date getWctime() {
        return wctime;
    }

    public void setWctime(Date wctime) {
        this.wctime = wctime;
    }

    public Date getActime() {
        return actime;
    }

    public void setActime(Date actime) {
        this.actime = actime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
