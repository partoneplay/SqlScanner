package oneplay.SqlScanner.rules;

public class RuleInfo {
    private String id;
    private String summary;
    private String content;
    private String example;

    public RuleInfo(String id, String summary, String content, String example) {
        this.id = id;
        this.summary = summary;
        this.content = content;
        this.example = example;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String toMarkdown() {
        return String.format("Markdown Output: \n### %s\n\n> %s\n\n```sql\n%s\n```\n", summary, content, example);
    }

}

