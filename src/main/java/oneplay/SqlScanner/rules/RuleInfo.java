package oneplay.SqlScanner.rules;

public class RuleInfo {
    private String id;
    private String english;
    private String chinese;
    private String level;
    private String explain;
    private String recommendation;

    public RuleInfo(String id, String english, String chinese, String level, String explain, String recommendation) {
        this.id = id;
        this.english = english;
        this.chinese = chinese;
        this.level = level;
        this.explain = explain;
        this.recommendation = recommendation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)\n解释说明：\n%s\n修复建议：\n%s", chinese, english, explain, recommendation);
    }

}

