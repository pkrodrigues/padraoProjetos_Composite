package designpattern.structural;

public abstract class Content {

    private String description;

    public Content(String description){
        this.description = description;
    }

    public abstract String getContent();
}
