package Notebook;

public class Notebook implements Prototype {
    private Rule rule;
    private int pages;
    private String size;

    public Notebook(Rule rule, int pages, String size){
        this.pages = pages;
        this.rule = rule;
        this.size = size;
    }
    private Notebook(Notebook original){
        this.size = original.size;
        this.rule = original.rule;
        this.pages = original.pages;
    }

    @Override
    public Notebook clone(){
        return new Notebook(this);
    }
}
