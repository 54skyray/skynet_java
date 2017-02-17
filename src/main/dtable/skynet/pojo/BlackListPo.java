package main.dtable.skynet.pojo;

import java.util.Date;

/**
 * Created by skyRay on 2017/1/18.
 */
public class BlackListPo {
    private int id;
    private String guid;
    private String rule;
    private String type;
    private String category;
    private String source;
    private String description;
    private Date ctime;

    public BlackListPo() {
    }

    public BlackListPo(int id, String guid, String rule, String type, String category, String source, String description, Date ctime) {
        this.id = id;
        this.guid = guid;
        this.rule = rule;
        this.type = type;
        this.category = category;
        this.source = source;
        this.description = description;
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlackListPo)) return false;

        BlackListPo blackListPo = (BlackListPo) o;

        if (getId() != blackListPo.getId()) return false;
        if (getGuid() != null ? !getGuid().equals(blackListPo.getGuid()) : blackListPo.getGuid() != null) return false;
        if (getRule() != null ? !getRule().equals(blackListPo.getRule()) : blackListPo.getRule() != null) return false;
        if (getType() != null ? !getType().equals(blackListPo.getType()) : blackListPo.getType() != null) return false;
        if (getCategory() != null ? !getCategory().equals(blackListPo.getCategory()) : blackListPo.getCategory() != null)
            return false;
        if (getSource() != null ? !getSource().equals(blackListPo.getSource()) : blackListPo.getSource() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(blackListPo.getDescription()) : blackListPo.getDescription() != null)
            return false;
        return !(getCtime() != null ? !getCtime().equals(blackListPo.getCtime()) : blackListPo.getCtime() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getGuid() != null ? getGuid().hashCode() : 0);
        result = 31 * result + (getRule() != null ? getRule().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        result = 31 * result + (getSource() != null ? getSource().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
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

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
