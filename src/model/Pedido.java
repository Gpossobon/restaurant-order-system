package model;


public class Pedido {
    private int id;
    private String client;
    private String item;
    private String status;

    public Pedido(int id, String client, String item) {
        this.id = id;
        this.client = client;
        this.item = item;
        this.status = "Em preparo";

    }
public int getId(){
        return id;
}
public String getClient() {
        return client;
}
public String getItem(){
    return item;

}
    public String getStatus(){
        return status;
    }
public void setStatus(String status){
        this.status = status;
    }
@Override
public String toString() {
    return "ID:" + id +
            " | Client: " + client +
            " | Item: " + item +
            " | Status:" + status;
    }
}



