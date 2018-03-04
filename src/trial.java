public class trial {

    public String name;
    public int ID;
    private static int newestID = 0;

    public trial(String n){
        this.name = n;
        this.ID = newestID;
        newestID++;
    }


}
