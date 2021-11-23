abstract class UserDetails{

    private int id;

    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }

    abstract public void uName(String name);
}
class AbstractKeyword extends UserDetails{

    public void uName(String name){
        System.out.println("User Name: "+name);
    }

    public static void main(String[] args) {
        
        AbstractKeyword ob = new AbstractKeyword();
        ob.setId(1);
        System.out.println("User Id: "+ob.getId());

        ob.uName("Atul");
    }
}
