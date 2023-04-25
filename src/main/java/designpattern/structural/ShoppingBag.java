package designpattern.structural;

public class ShoppingBag
{
    private Content content;

    public String getContent() {
        if(this.content == null){
            throw new NullPointerException("Sacola vazia");
        }
        return this.content.getContent();
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
