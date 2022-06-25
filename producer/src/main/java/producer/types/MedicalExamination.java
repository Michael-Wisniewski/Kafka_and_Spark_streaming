package producer.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "age",
    "sex",
    "cp",
    "trtbps",
    "chol",
    "fbs",
    "restecg",
    "thalachh",
    "exng",
    "oldpeak",
    "slp",
    "caa",
    "thall",
    "output"
})
public class MedicalExamination {

    @JsonProperty("age")
    private Integer age;
    @JsonProperty("sex")
    private Integer sex;
    @JsonProperty("cp")
    private Integer cp;
    @JsonProperty("trtbps")
    private Integer trtbps;
    @JsonProperty("chol")
    private Integer chol;
    @JsonProperty("fbs")
    private Integer fbs;
    @JsonProperty("restecg")
    private Integer restecg;
    @JsonProperty("thalachh")
    private Integer thalachh;
    @JsonProperty("exng")
    private Integer exng;
    @JsonProperty("oldpeak")
    private Object oldpeak;
    @JsonProperty("slp")
    private Integer slp;
    @JsonProperty("caa")
    private Integer caa;
    @JsonProperty("thall")
    private Integer thall;
    @JsonProperty("output")
    private Integer output;

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public MedicalExamination withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonProperty("sex")
    public Integer getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public MedicalExamination withSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    @JsonProperty("cp")
    public Integer getCp() {
        return cp;
    }

    @JsonProperty("cp")
    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public MedicalExamination withCp(Integer cp) {
        this.cp = cp;
        return this;
    }

    @JsonProperty("trtbps")
    public Integer getTrtbps() {
        return trtbps;
    }

    @JsonProperty("trtbps")
    public void setTrtbps(Integer trtbps) {
        this.trtbps = trtbps;
    }

    public MedicalExamination withTrtbps(Integer trtbps) {
        this.trtbps = trtbps;
        return this;
    }

    @JsonProperty("chol")
    public Integer getChol() {
        return chol;
    }

    @JsonProperty("chol")
    public void setChol(Integer chol) {
        this.chol = chol;
    }

    public MedicalExamination withChol(Integer chol) {
        this.chol = chol;
        return this;
    }

    @JsonProperty("fbs")
    public Integer getFbs() {
        return fbs;
    }

    @JsonProperty("fbs")
    public void setFbs(Integer fbs) {
        this.fbs = fbs;
    }

    public MedicalExamination withFbs(Integer fbs) {
        this.fbs = fbs;
        return this;
    }

    @JsonProperty("restecg")
    public Integer getRestecg() {
        return restecg;
    }

    @JsonProperty("restecg")
    public void setRestecg(Integer restecg) {
        this.restecg = restecg;
    }

    public MedicalExamination withRestecg(Integer restecg) {
        this.restecg = restecg;
        return this;
    }

    @JsonProperty("thalachh")
    public Integer getThalachh() {
        return thalachh;
    }

    @JsonProperty("thalachh")
    public void setThalachh(Integer thalachh) {
        this.thalachh = thalachh;
    }

    public MedicalExamination withThalachh(Integer thalachh) {
        this.thalachh = thalachh;
        return this;
    }

    @JsonProperty("exng")
    public Integer getExng() {
        return exng;
    }

    @JsonProperty("exng")
    public void setExng(Integer exng) {
        this.exng = exng;
    }

    public MedicalExamination withExng(Integer exng) {
        this.exng = exng;
        return this;
    }

    @JsonProperty("oldpeak")
    public Object getOldpeak() {
        return oldpeak;
    }

    @JsonProperty("oldpeak")
    public void setOldpeak(Object oldpeak) {
        this.oldpeak = oldpeak;
    }

    public MedicalExamination withOldpeak(Object oldpeak) {
        this.oldpeak = oldpeak;
        return this;
    }

    @JsonProperty("slp")
    public Integer getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Integer slp) {
        this.slp = slp;
    }

    public MedicalExamination withSlp(Integer slp) {
        this.slp = slp;
        return this;
    }

    @JsonProperty("caa")
    public Integer getCaa() {
        return caa;
    }

    @JsonProperty("caa")
    public void setCaa(Integer caa) {
        this.caa = caa;
    }

    public MedicalExamination withCaa(Integer caa) {
        this.caa = caa;
        return this;
    }

    @JsonProperty("thall")
    public Integer getThall() {
        return thall;
    }

    @JsonProperty("thall")
    public void setThall(Integer thall) {
        this.thall = thall;
    }

    public MedicalExamination withThall(Integer thall) {
        this.thall = thall;
        return this;
    }

    @JsonProperty("output")
    public Integer getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(Integer output) {
        this.output = output;
    }

    public MedicalExamination withOutput(Integer output) {
        this.output = output;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("age", age).append("sex", sex).append("cp", cp).append("trtbps", trtbps).append("chol", chol).append("fbs", fbs).append("restecg", restecg).append("thalachh", thalachh).append("exng", exng).append("oldpeak", oldpeak).append("slp", slp).append("caa", caa).append("thall", thall).append("output", output).toString();
    }

}
