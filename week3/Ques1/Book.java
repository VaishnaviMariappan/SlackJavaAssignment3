public abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class novel extends Book
{
    public void setTitle(String s)
    {
        this.title=s;
        //System.out.print("A tale of two cities");
    }
}