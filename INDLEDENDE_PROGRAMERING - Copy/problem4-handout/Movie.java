import java.util.Arrays;
import java.util.List;

class Movie {
    private String title;
    private String opinion;
    private static final List<String> validOpinions = Arrays.asList("wicked", "rad", "legit", "meh", "rotten");

    public Movie(String title, String opinion) {
        setTitle(title);
        setOpinion(opinion);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().length() == 0 || title.startsWith(" ") || title.endsWith(" ") || title.contains("  ")) {
            throw new IllegalArgumentException("Invalid title: '" + title + "'");
        }
        this.title = title;
    }

    public String getOpinion() {
        return this.opinion;
    }

    public void setOpinion(String opinion) {
        if (!validOpinions.contains(opinion)) {
            throw new IllegalArgumentException("Invalid opinion: '" + opinion + "'");
        }
        this.opinion = opinion;
    }

    public boolean isBetterThan(Movie other) {
        return validOpinions.indexOf(this.opinion) < validOpinions.indexOf(other.getOpinion());
    }
}